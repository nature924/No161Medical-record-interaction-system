package com.dao;

import com.entity.YiyuanzhuceEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YiyuanzhuceVO;
import com.entity.view.YiyuanzhuceView;


/**
 * 医院注册
 * 
 * @author 
 * @email 
 * @date 2021-04-20 11:48:28
 */
public interface YiyuanzhuceDao extends BaseMapper<YiyuanzhuceEntity> {
	
	List<YiyuanzhuceVO> selectListVO(@Param("ew") Wrapper<YiyuanzhuceEntity> wrapper);
	
	YiyuanzhuceVO selectVO(@Param("ew") Wrapper<YiyuanzhuceEntity> wrapper);
	
	List<YiyuanzhuceView> selectListView(@Param("ew") Wrapper<YiyuanzhuceEntity> wrapper);

	List<YiyuanzhuceView> selectListView(Pagination page,@Param("ew") Wrapper<YiyuanzhuceEntity> wrapper);
	
	YiyuanzhuceView selectView(@Param("ew") Wrapper<YiyuanzhuceEntity> wrapper);
	
}
