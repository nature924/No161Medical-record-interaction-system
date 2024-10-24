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
 * 医院公告
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-04-20 11:48:28
 */
@TableName("yiyuangonggao")
public class YiyuangonggaoEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public YiyuangonggaoEntity() {
		
	}
	
	public YiyuangonggaoEntity(T t) {
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
	 * 标题
	 */
					
	private String biaoti;
	
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
	 * 设置：标题
	 */
	public void setBiaoti(String biaoti) {
		this.biaoti = biaoti;
	}
	/**
	 * 获取：标题
	 */
	public String getBiaoti() {
		return biaoti;
	}
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
