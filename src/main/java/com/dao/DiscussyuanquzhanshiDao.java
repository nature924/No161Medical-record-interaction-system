package com.dao;

import com.entity.DiscussyuanquzhanshiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussyuanquzhanshiVO;
import com.entity.view.DiscussyuanquzhanshiView;


/**
 * 院区展示评论表
 * 
 * @author 
 * @email 
 * @date 2021-04-20 11:48:29
 */
public interface DiscussyuanquzhanshiDao extends BaseMapper<DiscussyuanquzhanshiEntity> {
	
	List<DiscussyuanquzhanshiVO> selectListVO(@Param("ew") Wrapper<DiscussyuanquzhanshiEntity> wrapper);
	
	DiscussyuanquzhanshiVO selectVO(@Param("ew") Wrapper<DiscussyuanquzhanshiEntity> wrapper);
	
	List<DiscussyuanquzhanshiView> selectListView(@Param("ew") Wrapper<DiscussyuanquzhanshiEntity> wrapper);

	List<DiscussyuanquzhanshiView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussyuanquzhanshiEntity> wrapper);
	
	DiscussyuanquzhanshiView selectView(@Param("ew") Wrapper<DiscussyuanquzhanshiEntity> wrapper);
	
}
