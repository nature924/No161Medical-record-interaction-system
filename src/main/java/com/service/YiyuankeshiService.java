package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YiyuankeshiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YiyuankeshiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YiyuankeshiView;


/**
 * 医院科室
 *
 * @author 
 * @email 
 * @date 2021-04-20 11:48:28
 */
public interface YiyuankeshiService extends IService<YiyuankeshiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YiyuankeshiVO> selectListVO(Wrapper<YiyuankeshiEntity> wrapper);
   	
   	YiyuankeshiVO selectVO(@Param("ew") Wrapper<YiyuankeshiEntity> wrapper);
   	
   	List<YiyuankeshiView> selectListView(Wrapper<YiyuankeshiEntity> wrapper);
   	
   	YiyuankeshiView selectView(@Param("ew") Wrapper<YiyuankeshiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YiyuankeshiEntity> wrapper);
   	
}

