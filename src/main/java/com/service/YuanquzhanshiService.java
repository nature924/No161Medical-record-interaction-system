package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YuanquzhanshiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YuanquzhanshiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YuanquzhanshiView;


/**
 * 院区展示
 *
 * @author 
 * @email 
 * @date 2021-04-20 11:48:28
 */
public interface YuanquzhanshiService extends IService<YuanquzhanshiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YuanquzhanshiVO> selectListVO(Wrapper<YuanquzhanshiEntity> wrapper);
   	
   	YuanquzhanshiVO selectVO(@Param("ew") Wrapper<YuanquzhanshiEntity> wrapper);
   	
   	List<YuanquzhanshiView> selectListView(Wrapper<YuanquzhanshiEntity> wrapper);
   	
   	YuanquzhanshiView selectView(@Param("ew") Wrapper<YuanquzhanshiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YuanquzhanshiEntity> wrapper);
   	
}

