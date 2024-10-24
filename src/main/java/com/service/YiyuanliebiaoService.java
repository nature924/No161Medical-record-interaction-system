package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YiyuanliebiaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YiyuanliebiaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YiyuanliebiaoView;


/**
 * 医院列表
 *
 * @author 
 * @email 
 * @date 2021-04-20 11:48:28
 */
public interface YiyuanliebiaoService extends IService<YiyuanliebiaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YiyuanliebiaoVO> selectListVO(Wrapper<YiyuanliebiaoEntity> wrapper);
   	
   	YiyuanliebiaoVO selectVO(@Param("ew") Wrapper<YiyuanliebiaoEntity> wrapper);
   	
   	List<YiyuanliebiaoView> selectListView(Wrapper<YiyuanliebiaoEntity> wrapper);
   	
   	YiyuanliebiaoView selectView(@Param("ew") Wrapper<YiyuanliebiaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YiyuanliebiaoEntity> wrapper);
   	
}

