package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.CaipinEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.CaipinVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.CaipinView;


/**
 * 菜品
 *
 * @author 
 * @email 
 * @date 2020-09-23 18:00:25
 */
public interface CaipinService extends IService<CaipinEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<CaipinVO> selectListVO(Wrapper<CaipinEntity> wrapper);
   	
   	CaipinVO selectVO(@Param("ew") Wrapper<CaipinEntity> wrapper);
   	
   	List<CaipinView> selectListView(Wrapper<CaipinEntity> wrapper);
   	
   	CaipinView selectView(@Param("ew") Wrapper<CaipinEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<CaipinEntity> wrapper);
   	
}

