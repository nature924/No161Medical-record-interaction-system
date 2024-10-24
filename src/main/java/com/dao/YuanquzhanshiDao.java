package com.dao;

import com.entity.YuanquzhanshiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YuanquzhanshiVO;
import com.entity.view.YuanquzhanshiView;


/**
 * 院区展示
 * 
 * @author 
 * @email 
 * @date 2021-04-20 11:48:28
 */
public interface YuanquzhanshiDao extends BaseMapper<YuanquzhanshiEntity> {
	
	List<YuanquzhanshiVO> selectListVO(@Param("ew") Wrapper<YuanquzhanshiEntity> wrapper);
	
	YuanquzhanshiVO selectVO(@Param("ew") Wrapper<YuanquzhanshiEntity> wrapper);
	
	List<YuanquzhanshiView> selectListView(@Param("ew") Wrapper<YuanquzhanshiEntity> wrapper);

	List<YuanquzhanshiView> selectListView(Pagination page,@Param("ew") Wrapper<YuanquzhanshiEntity> wrapper);
	
	YuanquzhanshiView selectView(@Param("ew") Wrapper<YuanquzhanshiEntity> wrapper);
	
}
