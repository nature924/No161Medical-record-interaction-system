package com.entity.vo;

import com.entity.YiyuangonggaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 医院公告
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-04-20 11:48:28
 */
public class YiyuangonggaoVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 内容
	 */
	
	private String neirong;
		
	/**
	 * 公告时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date gonggaoshijian;
		
	/**
	 * 公告文件
	 */
	
	private String gonggaowenjian;
		
	/**
	 * 公告图片
	 */
	
	private String gonggaotupian;
		
	/**
	 * 医院编号
	 */
	
	private String yiyuanbianhao;
				
	
	/**
	 * 设置：内容
	 */
	 
	public void setNeirong(String neirong) {
		this.neirong = neirong;
	}
	
	/**
	 * 获取：内容
	 */
	public String getNeirong() {
		return neirong;
	}
				
	
	/**
	 * 设置：公告时间
	 */
	 
	public void setGonggaoshijian(Date gonggaoshijian) {
		this.gonggaoshijian = gonggaoshijian;
	}
	
	/**
	 * 获取：公告时间
	 */
	public Date getGonggaoshijian() {
		return gonggaoshijian;
	}
				
	
	/**
	 * 设置：公告文件
	 */
	 
	public void setGonggaowenjian(String gonggaowenjian) {
		this.gonggaowenjian = gonggaowenjian;
	}
	
	/**
	 * 获取：公告文件
	 */
	public String getGonggaowenjian() {
		return gonggaowenjian;
	}
				
	
	/**
	 * 设置：公告图片
	 */
	 
	public void setGonggaotupian(String gonggaotupian) {
		this.gonggaotupian = gonggaotupian;
	}
	
	/**
	 * 获取：公告图片
	 */
	public String getGonggaotupian() {
		return gonggaotupian;
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
			
}
