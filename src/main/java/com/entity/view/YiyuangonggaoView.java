package com.entity.view;

import com.entity.YiyuangonggaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 医院公告
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-20 11:48:28
 */
@TableName("yiyuangonggao")
public class YiyuangonggaoView  extends YiyuangonggaoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public YiyuangonggaoView(){
	}
 
 	public YiyuangonggaoView(YiyuangonggaoEntity yiyuangonggaoEntity){
 	try {
			BeanUtils.copyProperties(this, yiyuangonggaoEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
