package com.entity.vo;

import com.entity.YuanquzhanshiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 院区展示
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-04-20 11:48:28
 */
public class YuanquzhanshiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
