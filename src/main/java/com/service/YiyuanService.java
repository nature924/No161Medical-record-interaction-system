package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YiyuanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YiyuanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YiyuanView;


/**
 * 医院
 *
 * @author 
 * @email 
 * @date 2021-04-20 11:48:28
 */
public interface YiyuanService extends IService<YiyuanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YiyuanVO> selectListVO(Wrapper<YiyuanEntity> wrapper);
   	
   	YiyuanVO selectVO(@Param("ew") Wrapper<YiyuanEntity> wrapper);
   	
   	List<YiyuanView> selectListView(Wrapper<YiyuanEntity> wrapper);
   	
   	YiyuanView selectView(@Param("ew") Wrapper<YiyuanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YiyuanEntity> wrapper);
   	
}

