package com.dao;

import com.entity.YiyuanwenzhangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YiyuanwenzhangVO;
import com.entity.view.YiyuanwenzhangView;


/**
 * 医院文章
 * 
 * @author 
 * @email 
 * @date 2021-04-20 11:48:28
 */
public interface YiyuanwenzhangDao extends BaseMapper<YiyuanwenzhangEntity> {
	
	List<YiyuanwenzhangVO> selectListVO(@Param("ew") Wrapper<YiyuanwenzhangEntity> wrapper);
	
	YiyuanwenzhangVO selectVO(@Param("ew") Wrapper<YiyuanwenzhangEntity> wrapper);
	
	List<YiyuanwenzhangView> selectListView(@Param("ew") Wrapper<YiyuanwenzhangEntity> wrapper);

	List<YiyuanwenzhangView> selectListView(Pagination page,@Param("ew") Wrapper<YiyuanwenzhangEntity> wrapper);
	
	YiyuanwenzhangView selectView(@Param("ew") Wrapper<YiyuanwenzhangEntity> wrapper);
	
}
