package com.entity.model;

import com.entity.YiyuanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 医院
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-04-20 11:48:28
 */
public class YiyuanModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 密码
	 */
	
	private String mima;
		
	/**
	 * 医院名称
	 */
	
	private String yiyuanmingcheng;
		
	/**
	 * 负责人
	 */
	
	private String fuzeren;
		
	/**
	 * 负责人手机
	 */
	
	private String fuzerenshouji;
		
	/**
	 * 邮箱
	 */
	
	private String youxiang;
		
	/**
	 * 负责人身份证
	 */
	
	private String fuzerenshenfenzheng;
				
	
	/**
	 * 设置：密码
	 */
	 
	public void setMima(String mima) {
		this.mima = mima;
	}
	
	/**
	 * 获取：密码
	 */
	public String getMima() {
		return mima;
	}
				
	
	/**
	 * 设置：医院名称
	 */
	 
	public void setYiyuanmingcheng(String yiyuanmingcheng) {
		this.yiyuanmingcheng = yiyuanmingcheng;
	}
	
	/**
	 * 获取：医院名称
	 */
	public String getYiyuanmingcheng() {
		return yiyuanmingcheng;
	}
				
	
	/**
	 * 设置：负责人
	 */
	 
	public void setFuzeren(String fuzeren) {
		this.fuzeren = fuzeren;
	}
	
	/**
	 * 获取：负责人
	 */
	public String getFuzeren() {
		return fuzeren;
	}
				
	
	/**
	 * 设置：负责人手机
	 */
	 
	public void setFuzerenshouji(String fuzerenshouji) {
		this.fuzerenshouji = fuzerenshouji;
	}
	
	/**
	 * 获取：负责人手机
	 */
	public String getFuzerenshouji() {
		return fuzerenshouji;
	}
				
	
	/**
	 * 设置：邮箱
	 */
	 
	public void setYouxiang(String youxiang) {
		this.youxiang = youxiang;
	}
	
	/**
	 * 获取：邮箱
	 */
	public String getYouxiang() {
		return youxiang;
	}
				
	
	/**
	 * 设置：负责人身份证
	 */
	 
	public void setFuzerenshenfenzheng(String fuzerenshenfenzheng) {
		this.fuzerenshenfenzheng = fuzerenshenfenzheng;
	}
	
	/**
	 * 获取：负责人身份证
	 */
	public String getFuzerenshenfenzheng() {
		return fuzerenshenfenzheng;
	}
			
}
