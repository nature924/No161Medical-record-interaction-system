package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.BingrenbingliEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.BingrenbingliVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.BingrenbingliView;


/**
 * 病人病历
 *
 * @author 
 * @email 
 * @date 2021-04-20 11:48:28
 */
public interface BingrenbingliService extends IService<BingrenbingliEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<BingrenbingliVO> selectListVO(Wrapper<BingrenbingliEntity> wrapper);
   	
   	BingrenbingliVO selectVO(@Param("ew") Wrapper<BingrenbingliEntity> wrapper);
   	
   	List<BingrenbingliView> selectListView(Wrapper<BingrenbingliEntity> wrapper);
   	
   	BingrenbingliView selectView(@Param("ew") Wrapper<BingrenbingliEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<BingrenbingliEntity> wrapper);
   	
}

