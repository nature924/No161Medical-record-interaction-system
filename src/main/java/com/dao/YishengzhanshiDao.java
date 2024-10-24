package com.dao;

import com.entity.YishengzhanshiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YishengzhanshiVO;
import com.entity.view.YishengzhanshiView;


/**
 * 医生展示
 * 
 * @author 
 * @email 
 * @date 2021-04-20 11:48:28
 */
public interface YishengzhanshiDao extends BaseMapper<YishengzhanshiEntity> {
	
	List<YishengzhanshiVO> selectListVO(@Param("ew") Wrapper<YishengzhanshiEntity> wrapper);
	
	YishengzhanshiVO selectVO(@Param("ew") Wrapper<YishengzhanshiEntity> wrapper);
	
	List<YishengzhanshiView> selectListView(@Param("ew") Wrapper<YishengzhanshiEntity> wrapper);

	List<YishengzhanshiView> selectListView(Pagination page,@Param("ew") Wrapper<YishengzhanshiEntity> wrapper);
	
	YishengzhanshiView selectView(@Param("ew") Wrapper<YishengzhanshiEntity> wrapper);
	
}
