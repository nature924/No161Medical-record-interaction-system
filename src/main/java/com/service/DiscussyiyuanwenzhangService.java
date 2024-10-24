package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussyiyuanwenzhangEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussyiyuanwenzhangVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussyiyuanwenzhangView;


/**
 * 医院文章评论表
 *
 * @author 
 * @email 
 * @date 2021-04-20 11:48:29
 */
public interface DiscussyiyuanwenzhangService extends IService<DiscussyiyuanwenzhangEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussyiyuanwenzhangVO> selectListVO(Wrapper<DiscussyiyuanwenzhangEntity> wrapper);
   	
   	DiscussyiyuanwenzhangVO selectVO(@Param("ew") Wrapper<DiscussyiyuanwenzhangEntity> wrapper);
   	
   	List<DiscussyiyuanwenzhangView> selectListView(Wrapper<DiscussyiyuanwenzhangEntity> wrapper);
   	
   	DiscussyiyuanwenzhangView selectView(@Param("ew") Wrapper<DiscussyiyuanwenzhangEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussyiyuanwenzhangEntity> wrapper);
   	
}

