package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussyishengzhanshiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussyishengzhanshiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussyishengzhanshiView;


/**
 * 医生展示评论表
 *
 * @author 
 * @email 
 * @date 2021-04-20 11:48:29
 */
public interface DiscussyishengzhanshiService extends IService<DiscussyishengzhanshiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussyishengzhanshiVO> selectListVO(Wrapper<DiscussyishengzhanshiEntity> wrapper);
   	
   	DiscussyishengzhanshiVO selectVO(@Param("ew") Wrapper<DiscussyishengzhanshiEntity> wrapper);
   	
   	List<DiscussyishengzhanshiView> selectListView(Wrapper<DiscussyishengzhanshiEntity> wrapper);
   	
   	DiscussyishengzhanshiView selectView(@Param("ew") Wrapper<DiscussyishengzhanshiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussyishengzhanshiEntity> wrapper);
   	
}

