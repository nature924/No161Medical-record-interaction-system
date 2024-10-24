package com.entity.vo;

import com.entity.YiliaoanpaiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 医疗安排
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-04-20 11:48:28
 */
public class YiliaoanpaiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 账号
	 */
	
	private String zhanghao;
		
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 入院日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date ruyuanriqi;
		
	/**
	 * 入住科室
	 */
	
	private String ruzhukeshi;
		
	/**
	 * 入住房号
	 */
	
	private String ruzhufanghao;
		
	/**
	 * 医生账号
	 */
	
	private String yishengzhanghao;
		
	/**
	 * 医生姓名
	 */
	
	private String yishengxingming;
		
	/**
	 * 用药安排
	 */
	
	private String yongyaoanpai;
		
	/**
	 * 用药进度
	 */
	
	private String yongyaojindu;
		
	/**
	 * 检查项目安排
	 */
	
	private String jianchaxiangmuanpai;
		
	/**
	 * 项目检查进度
	 */
	
	private String xiangmujianchajindu;
		
	/**
	 * 护理安排
	 */
	
	private String hulianpai;
		
	/**
	 * 护理进度
	 */
	
	private String hulijindu;
				
	
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
	 * 设置：姓名
	 */
	 
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
				
	
	/**
	 * 设置：入院日期
	 */
	 
	public void setRuyuanriqi(Date ruyuanriqi) {
		this.ruyuanriqi = ruyuanriqi;
	}
	
	/**
	 * 获取：入院日期
	 */
	public Date getRuyuanriqi() {
		return ruyuanriqi;
	}
				
	
	/**
	 * 设置：入住科室
	 */
	 
	public void setRuzhukeshi(String ruzhukeshi) {
		this.ruzhukeshi = ruzhukeshi;
	}
	
	/**
	 * 获取：入住科室
	 */
	public String getRuzhukeshi() {
		return ruzhukeshi;
	}
				
	
	/**
	 * 设置：入住房号
	 */
	 
	public void setRuzhufanghao(String ruzhufanghao) {
		this.ruzhufanghao = ruzhufanghao;
	}
	
	/**
	 * 获取：入住房号
	 */
	public String getRuzhufanghao() {
		return ruzhufanghao;
	}
				
	
	/**
	 * 设置：医生账号
	 */
	 
	public void setYishengzhanghao(String yishengzhanghao) {
		this.yishengzhanghao = yishengzhanghao;
	}
	
	/**
	 * 获取：医生账号
	 */
	public String getYishengzhanghao() {
		return yishengzhanghao;
	}
				
	
	/**
	 * 设置：医生姓名
	 */
	 
	public void setYishengxingming(String yishengxingming) {
		this.yishengxingming = yishengxingming;
	}
	
	/**
	 * 获取：医生姓名
	 */
	public String getYishengxingming() {
		return yishengxingming;
	}
				
	
	/**
	 * 设置：用药安排
	 */
	 
	public void setYongyaoanpai(String yongyaoanpai) {
		this.yongyaoanpai = yongyaoanpai;
	}
	
	/**
	 * 获取：用药安排
	 */
	public String getYongyaoanpai() {
		return yongyaoanpai;
	}
				
	
	/**
	 * 设置：用药进度
	 */
	 
	public void setYongyaojindu(String yongyaojindu) {
		this.yongyaojindu = yongyaojindu;
	}
	
	/**
	 * 获取：用药进度
	 */
	public String getYongyaojindu() {
		return yongyaojindu;
	}
				
	
	/**
	 * 设置：检查项目安排
	 */
	 
	public void setJianchaxiangmuanpai(String jianchaxiangmuanpai) {
		this.jianchaxiangmuanpai = jianchaxiangmuanpai;
	}
	
	/**
	 * 获取：检查项目安排
	 */
	public String getJianchaxiangmuanpai() {
		return jianchaxiangmuanpai;
	}
				
	
	/**
	 * 设置：项目检查进度
	 */
	 
	public void setXiangmujianchajindu(String xiangmujianchajindu) {
		this.xiangmujianchajindu = xiangmujianchajindu;
	}
	
	/**
	 * 获取：项目检查进度
	 */
	public String getXiangmujianchajindu() {
		return xiangmujianchajindu;
	}
				
	
	/**
	 * 设置：护理安排
	 */
	 
	public void setHulianpai(String hulianpai) {
		this.hulianpai = hulianpai;
	}
	
	/**
	 * 获取：护理安排
	 */
	public String getHulianpai() {
		return hulianpai;
	}
				
	
	/**
	 * 设置：护理进度
	 */
	 
	public void setHulijindu(String hulijindu) {
		this.hulijindu = hulijindu;
	}
	
	/**
	 * 获取：护理进度
	 */
	public String getHulijindu() {
		return hulijindu;
	}
			
}
