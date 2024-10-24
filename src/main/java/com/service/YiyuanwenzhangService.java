package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YiyuanwenzhangEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YiyuanwenzhangVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YiyuanwenzhangView;


/**
 * 医院文章
 *
 * @author 
 * @email 
 * @date 2021-04-20 11:48:28
 */
public interface YiyuanwenzhangService extends IService<YiyuanwenzhangEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YiyuanwenzhangVO> selectListVO(Wrapper<YiyuanwenzhangEntity> wrapper);
   	
   	YiyuanwenzhangVO selectVO(@Param("ew") Wrapper<YiyuanwenzhangEntity> wrapper);
   	
   	List<YiyuanwenzhangView> selectListView(Wrapper<YiyuanwenzhangEntity> wrapper);
   	
   	YiyuanwenzhangView selectView(@Param("ew") Wrapper<YiyuanwenzhangEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YiyuanwenzhangEntity> wrapper);
   	
}

