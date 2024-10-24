package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussyuanquzhanshiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussyuanquzhanshiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussyuanquzhanshiView;


/**
 * 院区展示评论表
 *
 * @author 
 * @email 
 * @date 2021-04-20 11:48:29
 */
public interface DiscussyuanquzhanshiService extends IService<DiscussyuanquzhanshiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussyuanquzhanshiVO> selectListVO(Wrapper<DiscussyuanquzhanshiEntity> wrapper);
   	
   	DiscussyuanquzhanshiVO selectVO(@Param("ew") Wrapper<DiscussyuanquzhanshiEntity> wrapper);
   	
   	List<DiscussyuanquzhanshiView> selectListView(Wrapper<DiscussyuanquzhanshiEntity> wrapper);
   	
   	DiscussyuanquzhanshiView selectView(@Param("ew") Wrapper<DiscussyuanquzhanshiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussyuanquzhanshiEntity> wrapper);
   	
}

