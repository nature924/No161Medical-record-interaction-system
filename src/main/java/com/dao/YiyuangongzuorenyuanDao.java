package com.dao;

import com.entity.YiyuangongzuorenyuanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YiyuangongzuorenyuanVO;
import com.entity.view.YiyuangongzuorenyuanView;


/**
 * 医院工作人员
 * 
 * @author 
 * @email 
 * @date 2021-04-20 11:48:28
 */
public interface YiyuangongzuorenyuanDao extends BaseMapper<YiyuangongzuorenyuanEntity> {
	
	List<YiyuangongzuorenyuanVO> selectListVO(@Param("ew") Wrapper<YiyuangongzuorenyuanEntity> wrapper);
	
	YiyuangongzuorenyuanVO selectVO(@Param("ew") Wrapper<YiyuangongzuorenyuanEntity> wrapper);
	
	List<YiyuangongzuorenyuanView> selectListView(@Param("ew") Wrapper<YiyuangongzuorenyuanEntity> wrapper);

	List<YiyuangongzuorenyuanView> selectListView(Pagination page,@Param("ew") Wrapper<YiyuangongzuorenyuanEntity> wrapper);
	
	YiyuangongzuorenyuanView selectView(@Param("ew") Wrapper<YiyuangongzuorenyuanEntity> wrapper);
	
}
