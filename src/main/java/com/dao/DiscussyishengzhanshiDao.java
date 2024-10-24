package com.dao;

import com.entity.DiscussyishengzhanshiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussyishengzhanshiVO;
import com.entity.view.DiscussyishengzhanshiView;


/**
 * 医生展示评论表
 * 
 * @author 
 * @email 
 * @date 2021-04-20 11:48:29
 */
public interface DiscussyishengzhanshiDao extends BaseMapper<DiscussyishengzhanshiEntity> {
	
	List<DiscussyishengzhanshiVO> selectListVO(@Param("ew") Wrapper<DiscussyishengzhanshiEntity> wrapper);
	
	DiscussyishengzhanshiVO selectVO(@Param("ew") Wrapper<DiscussyishengzhanshiEntity> wrapper);
	
	List<DiscussyishengzhanshiView> selectListView(@Param("ew") Wrapper<DiscussyishengzhanshiEntity> wrapper);

	List<DiscussyishengzhanshiView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussyishengzhanshiEntity> wrapper);
	
	DiscussyishengzhanshiView selectView(@Param("ew") Wrapper<DiscussyishengzhanshiEntity> wrapper);
	
}
