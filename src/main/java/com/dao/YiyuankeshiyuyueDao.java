package com.dao;

import com.entity.YiyuankeshiyuyueEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YiyuankeshiyuyueVO;
import com.entity.view.YiyuankeshiyuyueView;


/**
 * 医院科室预约
 * 
 * @author 
 * @email 
 * @date 2021-04-20 11:48:28
 */
public interface YiyuankeshiyuyueDao extends BaseMapper<YiyuankeshiyuyueEntity> {
	
	List<YiyuankeshiyuyueVO> selectListVO(@Param("ew") Wrapper<YiyuankeshiyuyueEntity> wrapper);
	
	YiyuankeshiyuyueVO selectVO(@Param("ew") Wrapper<YiyuankeshiyuyueEntity> wrapper);
	
	List<YiyuankeshiyuyueView> selectListView(@Param("ew") Wrapper<YiyuankeshiyuyueEntity> wrapper);

	List<YiyuankeshiyuyueView> selectListView(Pagination page,@Param("ew") Wrapper<YiyuankeshiyuyueEntity> wrapper);
	
	YiyuankeshiyuyueView selectView(@Param("ew") Wrapper<YiyuankeshiyuyueEntity> wrapper);
	
}
