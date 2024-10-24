package com.entity.view;

import com.entity.BingrenbingliEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 病人病历
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-20 11:48:28
 */
@TableName("bingrenbingli")
public class BingrenbingliView  extends BingrenbingliEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public BingrenbingliView(){
	}
 
 	public BingrenbingliView(BingrenbingliEntity bingrenbingliEntity){
 	try {
			BeanUtils.copyProperties(this, bingrenbingliEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
