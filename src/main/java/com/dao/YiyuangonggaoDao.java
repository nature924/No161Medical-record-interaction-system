package com.dao;

import com.entity.YiyuangonggaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YiyuangonggaoVO;
import com.entity.view.YiyuangonggaoView;


/**
 * 医院公告
 * 
 * @author 
 * @email 
 * @date 2021-04-20 11:48:28
 */
public interface YiyuangonggaoDao extends BaseMapper<YiyuangonggaoEntity> {
	
	List<YiyuangonggaoVO> selectListVO(@Param("ew") Wrapper<YiyuangonggaoEntity> wrapper);
	
	YiyuangonggaoVO selectVO(@Param("ew") Wrapper<YiyuangonggaoEntity> wrapper);
	
	List<YiyuangonggaoView> selectListView(@Param("ew") Wrapper<YiyuangonggaoEntity> wrapper);

	List<YiyuangonggaoView> selectListView(Pagination page,@Param("ew") Wrapper<YiyuangonggaoEntity> wrapper);
	
	YiyuangonggaoView selectView(@Param("ew") Wrapper<YiyuangonggaoEntity> wrapper);
	
}
