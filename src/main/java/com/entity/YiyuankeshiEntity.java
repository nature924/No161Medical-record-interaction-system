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
 * 医院科室
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-04-20 11:48:28
 */
@TableName("yiyuankeshi")
public class YiyuankeshiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public YiyuankeshiEntity() {
		
	}
	
	public YiyuankeshiEntity(T t) {
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
	 * 科室名称
	 */
					
	private String keshimingcheng;
	
	/**
	 * 科室类型
	 */
					
	private String keshileixing;
	
	/**
	 * 科室简介
	 */
					
	private String keshijianjie;
	
	/**
	 * 科室人员
	 */
					
	private String keshirenyuan;
	
	/**
	 * 科室图片
	 */
					
	private String keshitupian;
	
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
	 * 设置：科室名称
	 */
	public void setKeshimingcheng(String keshimingcheng) {
		this.keshimingcheng = keshimingcheng;
	}
	/**
	 * 获取：科室名称
	 */
	public String getKeshimingcheng() {
		return keshimingcheng;
	}
	/**
	 * 设置：科室类型
	 */
	public void setKeshileixing(String keshileixing) {
		this.keshileixing = keshileixing;
	}
	/**
	 * 获取：科室类型
	 */
	public String getKeshileixing() {
		return keshileixing;
	}
	/**
	 * 设置：科室简介
	 */
	public void setKeshijianjie(String keshijianjie) {
		this.keshijianjie = keshijianjie;
	}
	/**
	 * 获取：科室简介
	 */
	public String getKeshijianjie() {
		return keshijianjie;
	}
	/**
	 * 设置：科室人员
	 */
	public void setKeshirenyuan(String keshirenyuan) {
		this.keshirenyuan = keshirenyuan;
	}
	/**
	 * 获取：科室人员
	 */
	public String getKeshirenyuan() {
		return keshirenyuan;
	}
	/**
	 * 设置：科室图片
	 */
	public void setKeshitupian(String keshitupian) {
		this.keshitupian = keshitupian;
	}
	/**
	 * 获取：科室图片
	 */
	public String getKeshitupian() {
		return keshitupian;
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
