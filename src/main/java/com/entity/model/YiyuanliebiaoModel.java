package com.entity.model;

import com.entity.YiyuanliebiaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 医院列表
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-04-20 11:48:28
 */
public class YiyuanliebiaoModel  implements Serializable {
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
	 * 账号
	 */
	
	private String zhanghao;
		
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 注册时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date zhuceshijian;
				
	
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
	 * 设置：注册时间
	 */
	 
	public void setZhuceshijian(Date zhuceshijian) {
		this.zhuceshijian = zhuceshijian;
	}
	
	/**
	 * 获取：注册时间
	 */
	public Date getZhuceshijian() {
		return zhuceshijian;
	}
			
}
