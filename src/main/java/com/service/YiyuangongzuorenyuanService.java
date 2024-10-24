package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YiyuangongzuorenyuanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YiyuangongzuorenyuanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YiyuangongzuorenyuanView;


/**
 * 医院工作人员
 *
 * @author 
 * @email 
 * @date 2021-04-20 11:48:28
 */
public interface YiyuangongzuorenyuanService extends IService<YiyuangongzuorenyuanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YiyuangongzuorenyuanVO> selectListVO(Wrapper<YiyuangongzuorenyuanEntity> wrapper);
   	
   	YiyuangongzuorenyuanVO selectVO(@Param("ew") Wrapper<YiyuangongzuorenyuanEntity> wrapper);
   	
   	List<YiyuangongzuorenyuanView> selectListView(Wrapper<YiyuangongzuorenyuanEntity> wrapper);
   	
   	YiyuangongzuorenyuanView selectView(@Param("ew") Wrapper<YiyuangongzuorenyuanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YiyuangongzuorenyuanEntity> wrapper);
   	
}

