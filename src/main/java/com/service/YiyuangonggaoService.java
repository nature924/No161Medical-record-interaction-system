package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YiyuangonggaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YiyuangonggaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YiyuangonggaoView;


/**
 * 医院公告
 *
 * @author 
 * @email 
 * @date 2021-04-20 11:48:28
 */
public interface YiyuangonggaoService extends IService<YiyuangonggaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YiyuangonggaoVO> selectListVO(Wrapper<YiyuangonggaoEntity> wrapper);
   	
   	YiyuangonggaoVO selectVO(@Param("ew") Wrapper<YiyuangonggaoEntity> wrapper);
   	
   	List<YiyuangonggaoView> selectListView(Wrapper<YiyuangonggaoEntity> wrapper);
   	
   	YiyuangonggaoView selectView(@Param("ew") Wrapper<YiyuangonggaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YiyuangonggaoEntity> wrapper);
   	
}

