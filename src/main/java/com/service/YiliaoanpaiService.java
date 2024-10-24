package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YiliaoanpaiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YiliaoanpaiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YiliaoanpaiView;


/**
 * 医疗安排
 *
 * @author 
 * @email 
 * @date 2021-04-20 11:48:28
 */
public interface YiliaoanpaiService extends IService<YiliaoanpaiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YiliaoanpaiVO> selectListVO(Wrapper<YiliaoanpaiEntity> wrapper);
   	
   	YiliaoanpaiVO selectVO(@Param("ew") Wrapper<YiliaoanpaiEntity> wrapper);
   	
   	List<YiliaoanpaiView> selectListView(Wrapper<YiliaoanpaiEntity> wrapper);
   	
   	YiliaoanpaiView selectView(@Param("ew") Wrapper<YiliaoanpaiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YiliaoanpaiEntity> wrapper);
   	
}

