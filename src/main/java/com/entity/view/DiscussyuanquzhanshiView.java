package com.entity.view;

import com.entity.DiscussyuanquzhanshiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 院区展示评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-20 11:48:29
 */
@TableName("discussyuanquzhanshi")
public class DiscussyuanquzhanshiView  extends DiscussyuanquzhanshiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscussyuanquzhanshiView(){
	}
 
 	public DiscussyuanquzhanshiView(DiscussyuanquzhanshiEntity discussyuanquzhanshiEntity){
 	try {
			BeanUtils.copyProperties(this, discussyuanquzhanshiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
