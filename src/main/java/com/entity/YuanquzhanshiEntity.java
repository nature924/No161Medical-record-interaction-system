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
 * 院区展示
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-04-20 11:48:28
 */
@TableName("yuanquzhanshi")
public class YuanquzhanshiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public YuanquzhanshiEntity() {
		
	}
	
	public YuanquzhanshiEntity(T t) {
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
	 * 医院编号
	 */
					
	private String yiyuanbianhao;
	
	/**
	 * 院区名称
	 */
					
	private String yuanqumingcheng;
	
	/**
	 * 院区简介
	 */
					
	private String yuanqujianjie;
	
	/**
	 * 院区地址
	 */
					
	private String yuanqudizhi;
	
	/**
	 * 院区电话
	 */
					
	private String yuanqudianhua;
	
	/**
	 * 院区总面积
	 */
					
	private String yuanquzongmianji;
	
	/**
	 * 专家
	 */
					
	private String zhuanjia;
	
	/**
	 * 科室
	 */
					
	private String keshi;
	
	/**
	 * 院区图片
	 */
					
	private String yuanqutupian;
	
	
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
	 * 设置：医院编号
	 */
	public void setYiyuanbianhao(String yiyuanbianhao) {
		this.yiyuanbianhao = yiyuanbianhao;
	}
	/**
	 * 获取：医院编号
	 */
	public String getYiyuanbianhao() {
		return yiyuanbianhao;
	}
	/**
	 * 设置：院区名称
	 */
	public void setYuanqumingcheng(String yuanqumingcheng) {
		this.yuanqumingcheng = yuanqumingcheng;
	}
	/**
	 * 获取：院区名称
	 */
	public String getYuanqumingcheng() {
		return yuanqumingcheng;
	}
	/**
	 * 设置：院区简介
	 */
	public void setYuanqujianjie(String yuanqujianjie) {
		this.yuanqujianjie = yuanqujianjie;
	}
	/**
	 * 获取：院区简介
	 */
	public String getYuanqujianjie() {
		return yuanqujianjie;
	}
	/**
	 * 设置：院区地址
	 */
	public void setYuanqudizhi(String yuanqudizhi) {
		this.yuanqudizhi = yuanqudizhi;
	}
	/**
	 * 获取：院区地址
	 */
	public String getYuanqudizhi() {
		return yuanqudizhi;
	}
	/**
	 * 设置：院区电话
	 */
	public void setYuanqudianhua(String yuanqudianhua) {
		this.yuanqudianhua = yuanqudianhua;
	}
	/**
	 * 获取：院区电话
	 */
	public String getYuanqudianhua() {
		return yuanqudianhua;
	}
	/**
	 * 设置：院区总面积
	 */
	public void setYuanquzongmianji(String yuanquzongmianji) {
		this.yuanquzongmianji = yuanquzongmianji;
	}
	/**
	 * 获取：院区总面积
	 */
	public String getYuanquzongmianji() {
		return yuanquzongmianji;
	}
	/**
	 * 设置：专家
	 */
	public void setZhuanjia(String zhuanjia) {
		this.zhuanjia = zhuanjia;
	}
	/**
	 * 获取：专家
	 */
	public String getZhuanjia() {
		return zhuanjia;
	}
	/**
	 * 设置：科室
	 */
	public void setKeshi(String keshi) {
		this.keshi = keshi;
	}
	/**
	 * 获取：科室
	 */
	public String getKeshi() {
		return keshi;
	}
	/**
	 * 设置：院区图片
	 */
	public void setYuanqutupian(String yuanqutupian) {
		this.yuanqutupian = yuanqutupian;
	}
	/**
	 * 获取：院区图片
	 */
	public String getYuanqutupian() {
		return yuanqutupian;
	}

}
