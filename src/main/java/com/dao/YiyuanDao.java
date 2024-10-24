package com.dao;

import com.entity.YiyuanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YiyuanVO;
import com.entity.view.YiyuanView;


/**
 * 医院
 * 
 * @author 
 * @email 
 * @date 2021-04-20 11:48:28
 */
public interface YiyuanDao extends BaseMapper<YiyuanEntity> {
	
	List<YiyuanVO> selectListVO(@Param("ew") Wrapper<YiyuanEntity> wrapper);
	
	YiyuanVO selectVO(@Param("ew") Wrapper<YiyuanEntity> wrapper);
	
	List<YiyuanView> selectListView(@Param("ew") Wrapper<YiyuanEntity> wrapper);

	List<YiyuanView> selectListView(Pagination page,@Param("ew") Wrapper<YiyuanEntity> wrapper);
	
	YiyuanView selectView(@Param("ew") Wrapper<YiyuanEntity> wrapper);
	
}
