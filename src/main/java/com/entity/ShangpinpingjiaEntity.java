package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 商品评价
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2020-09-23 18:00:25
 */
@TableName("shangpinpingjia")
public class ShangpinpingjiaEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ShangpinpingjiaEntity() {
		
	}
	
	public ShangpinpingjiaEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 名称
	 */
					
	private String mingcheng;
	
	/**
	 * 图片
	 */
					
	private String tupian;
	
	/**
	 * 购买数量
	 */
					
	private String goumaishuliang;
	
	/**
	 * 商家编号
	 */
					
	private String shangjiabianhao;
	
	/**
	 * 菜品评分
	 */
					
	private String caipinpingfen;
	
	/**
	 * 配送评分
	 */
					
	private String peisongpingfen;
	
	/**
	 * 商家评分
	 */
					
	private String shangjiapingfen;
	
	/**
	 * 评语
	 */
					
	private String pingyu;
	
	/**
	 * 账号
	 */
					
	private String zhanghao;
	
	/**
	 * 备注
	 */
					
	private String beizhu;
	
	/**
	 * 是否审核
	 */
					
	private String sfsh;
	
	/**
	 * 审核回复
	 */
					
	private String shhf;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：名称
	 */
	public void setMingcheng(String mingcheng) {
		this.mingcheng = mingcheng;
	}
	/**
	 * 获取：名称
	 */
	public String getMingcheng() {
		return mingcheng;
	}
	/**
	 * 设置：图片
	 */
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
	}
	/**
	 * 设置：购买数量
	 */
	public void setGoumaishuliang(String goumaishuliang) {
		this.goumaishuliang = goumaishuliang;
	}
	/**
	 * 获取：购买数量
	 */
	public String getGoumaishuliang() {
		return goumaishuliang;
	}
	/**
	 * 设置：商家编号
	 */
	public void setShangjiabianhao(String shangjiabianhao) {
		this.shangjiabianhao = shangjiabianhao;
	}
	/**
	 * 获取：商家编号
	 */
	public String getShangjiabianhao() {
		return shangjiabianhao;
	}
	/**
	 * 设置：菜品评分
	 */
	public void setCaipinpingfen(String caipinpingfen) {
		this.caipinpingfen = caipinpingfen;
	}
	/**
	 * 获取：菜品评分
	 */
	public String getCaipinpingfen() {
		return caipinpingfen;
	}
	/**
	 * 设置：配送评分
	 */
	public void setPeisongpingfen(String peisongpingfen) {
		this.peisongpingfen = peisongpingfen;
	}
	/**
	 * 获取：配送评分
	 */
	public String getPeisongpingfen() {
		return peisongpingfen;
	}
	/**
	 * 设置：商家评分
	 */
	public void setShangjiapingfen(String shangjiapingfen) {
		this.shangjiapingfen = shangjiapingfen;
	}
	/**
	 * 获取：商家评分
	 */
	public String getShangjiapingfen() {
		return shangjiapingfen;
	}
	/**
	 * 设置：评语
	 */
	public void setPingyu(String pingyu) {
		this.pingyu = pingyu;
	}
	/**
	 * 获取：评语
	 */
	public String getPingyu() {
		return pingyu;
	}
	/**
	 * 设置：账号
	 */
	public void setZhanghao(String zhanghao) {
		this.zhanghao = zhanghao;
	}
	/**
	 * 获取：账号
	 */
	public String getZhanghao() {
		return zhanghao;
	}
	/**
	 * 设置：备注
	 */
	public void setBeizhu(String beizhu) {
		this.beizhu = beizhu;
	}
	/**
	 * 获取：备注
	 */
	public String getBeizhu() {
		return beizhu;
	}
	/**
	 * 设置：是否审核
	 */
	public void setSfsh(String sfsh) {
		this.sfsh = sfsh;
	}
	/**
	 * 获取：是否审核
	 */
	public String getSfsh() {
		return sfsh;
	}
	/**
	 * 设置：审核回复
	 */
	public void setShhf(String shhf) {
		this.shhf = shhf;
	}
	/**
	 * 获取：审核回复
	 */
	public String getShhf() {
		return shhf;
	}

}
