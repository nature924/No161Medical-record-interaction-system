package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YiyuanzhuceEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YiyuanzhuceVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YiyuanzhuceView;


/**
 * 医院注册
 *
 * @author 
 * @email 
 * @date 2021-04-20 11:48:28
 */
public interface YiyuanzhuceService extends IService<YiyuanzhuceEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YiyuanzhuceVO> selectListVO(Wrapper<YiyuanzhuceEntity> wrapper);
   	
   	YiyuanzhuceVO selectVO(@Param("ew") Wrapper<YiyuanzhuceEntity> wrapper);
   	
   	List<YiyuanzhuceView> selectListView(Wrapper<YiyuanzhuceEntity> wrapper);
   	
   	YiyuanzhuceView selectView(@Param("ew") Wrapper<YiyuanzhuceEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YiyuanzhuceEntity> wrapper);
   	
}

