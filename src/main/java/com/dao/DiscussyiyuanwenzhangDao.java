package com.dao;

import com.entity.DiscussyiyuanwenzhangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussyiyuanwenzhangVO;
import com.entity.view.DiscussyiyuanwenzhangView;


/**
 * 医院文章评论表
 * 
 * @author 
 * @email 
 * @date 2021-04-20 11:48:29
 */
public interface DiscussyiyuanwenzhangDao extends BaseMapper<DiscussyiyuanwenzhangEntity> {
	
	List<DiscussyiyuanwenzhangVO> selectListVO(@Param("ew") Wrapper<DiscussyiyuanwenzhangEntity> wrapper);
	
	DiscussyiyuanwenzhangVO selectVO(@Param("ew") Wrapper<DiscussyiyuanwenzhangEntity> wrapper);
	
	List<DiscussyiyuanwenzhangView> selectListView(@Param("ew") Wrapper<DiscussyiyuanwenzhangEntity> wrapper);

	List<DiscussyiyuanwenzhangView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussyiyuanwenzhangEntity> wrapper);
	
	DiscussyiyuanwenzhangView selectView(@Param("ew") Wrapper<DiscussyiyuanwenzhangEntity> wrapper);
	
}
