package com.dao;

import com.entity.YiyuankeshiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YiyuankeshiVO;
import com.entity.view.YiyuankeshiView;


/**
 * 医院科室
 * 
 * @author 
 * @email 
 * @date 2021-04-20 11:48:28
 */
public interface YiyuankeshiDao extends BaseMapper<YiyuankeshiEntity> {
	
	List<YiyuankeshiVO> selectListVO(@Param("ew") Wrapper<YiyuankeshiEntity> wrapper);
	
	YiyuankeshiVO selectVO(@Param("ew") Wrapper<YiyuankeshiEntity> wrapper);
	
	List<YiyuankeshiView> selectListView(@Param("ew") Wrapper<YiyuankeshiEntity> wrapper);

	List<YiyuankeshiView> selectListView(Pagination page,@Param("ew") Wrapper<YiyuankeshiEntity> wrapper);
	
	YiyuankeshiView selectView(@Param("ew") Wrapper<YiyuankeshiEntity> wrapper);
	
}
