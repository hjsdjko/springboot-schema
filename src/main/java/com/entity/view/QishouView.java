package com.entity.view;

import com.entity.QishouEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 骑手
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2020-09-23 18:00:25
 */
@TableName("qishou")
public class QishouView  extends QishouEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public QishouView(){
	}
 
 	public QishouView(QishouEntity qishouEntity){
 	try {
			BeanUtils.copyProperties(this, qishouEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
