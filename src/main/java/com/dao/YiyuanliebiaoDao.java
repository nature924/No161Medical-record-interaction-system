package com.dao;

import com.entity.YiyuanliebiaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YiyuanliebiaoVO;
import com.entity.view.YiyuanliebiaoView;


/**
 * 医院列表
 * 
 * @author 
 * @email 
 * @date 2021-04-20 11:48:28
 */
public interface YiyuanliebiaoDao extends BaseMapper<YiyuanliebiaoEntity> {
	
	List<YiyuanliebiaoVO> selectListVO(@Param("ew") Wrapper<YiyuanliebiaoEntity> wrapper);
	
	YiyuanliebiaoVO selectVO(@Param("ew") Wrapper<YiyuanliebiaoEntity> wrapper);
	
	List<YiyuanliebiaoView> selectListView(@Param("ew") Wrapper<YiyuanliebiaoEntity> wrapper);

	List<YiyuanliebiaoView> selectListView(Pagination page,@Param("ew") Wrapper<YiyuanliebiaoEntity> wrapper);
	
	YiyuanliebiaoView selectView(@Param("ew") Wrapper<YiyuanliebiaoEntity> wrapper);
	
}
