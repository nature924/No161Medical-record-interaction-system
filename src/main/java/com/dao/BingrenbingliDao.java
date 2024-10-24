package com.dao;

import com.entity.BingrenbingliEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.BingrenbingliVO;
import com.entity.view.BingrenbingliView;


/**
 * 病人病历
 * 
 * @author 
 * @email 
 * @date 2021-04-20 11:48:28
 */
public interface BingrenbingliDao extends BaseMapper<BingrenbingliEntity> {
	
	List<BingrenbingliVO> selectListVO(@Param("ew") Wrapper<BingrenbingliEntity> wrapper);
	
	BingrenbingliVO selectVO(@Param("ew") Wrapper<BingrenbingliEntity> wrapper);
	
	List<BingrenbingliView> selectListView(@Param("ew") Wrapper<BingrenbingliEntity> wrapper);

	List<BingrenbingliView> selectListView(Pagination page,@Param("ew") Wrapper<BingrenbingliEntity> wrapper);
	
	BingrenbingliView selectView(@Param("ew") Wrapper<BingrenbingliEntity> wrapper);
	
}
