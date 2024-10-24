package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YiyuankeshiyuyueEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YiyuankeshiyuyueVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YiyuankeshiyuyueView;


/**
 * 医院科室预约
 *
 * @author 
 * @email 
 * @date 2021-04-20 11:48:28
 */
public interface YiyuankeshiyuyueService extends IService<YiyuankeshiyuyueEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YiyuankeshiyuyueVO> selectListVO(Wrapper<YiyuankeshiyuyueEntity> wrapper);
   	
   	YiyuankeshiyuyueVO selectVO(@Param("ew") Wrapper<YiyuankeshiyuyueEntity> wrapper);
   	
   	List<YiyuankeshiyuyueView> selectListView(Wrapper<YiyuankeshiyuyueEntity> wrapper);
   	
   	YiyuankeshiyuyueView selectView(@Param("ew") Wrapper<YiyuankeshiyuyueEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YiyuankeshiyuyueEntity> wrapper);
   	
}

