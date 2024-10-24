package com.dao;

import com.entity.YiliaoanpaiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YiliaoanpaiVO;
import com.entity.view.YiliaoanpaiView;


/**
 * 医疗安排
 * 
 * @author 
 * @email 
 * @date 2021-04-20 11:48:28
 */
public interface YiliaoanpaiDao extends BaseMapper<YiliaoanpaiEntity> {
	
	List<YiliaoanpaiVO> selectListVO(@Param("ew") Wrapper<YiliaoanpaiEntity> wrapper);
	
	YiliaoanpaiVO selectVO(@Param("ew") Wrapper<YiliaoanpaiEntity> wrapper);
	
	List<YiliaoanpaiView> selectListView(@Param("ew") Wrapper<YiliaoanpaiEntity> wrapper);

	List<YiliaoanpaiView> selectListView(Pagination page,@Param("ew") Wrapper<YiliaoanpaiEntity> wrapper);
	
	YiliaoanpaiView selectView(@Param("ew") Wrapper<YiliaoanpaiEntity> wrapper);
	
}
