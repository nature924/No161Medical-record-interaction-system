package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YishengzhanshiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YishengzhanshiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YishengzhanshiView;


/**
 * 医生展示
 *
 * @author 
 * @email 
 * @date 2021-04-20 11:48:28
 */
public interface YishengzhanshiService extends IService<YishengzhanshiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YishengzhanshiVO> selectListVO(Wrapper<YishengzhanshiEntity> wrapper);
   	
   	YishengzhanshiVO selectVO(@Param("ew") Wrapper<YishengzhanshiEntity> wrapper);
   	
   	List<YishengzhanshiView> selectListView(Wrapper<YishengzhanshiEntity> wrapper);
   	
   	YishengzhanshiView selectView(@Param("ew") Wrapper<YishengzhanshiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YishengzhanshiEntity> wrapper);
   	
}

