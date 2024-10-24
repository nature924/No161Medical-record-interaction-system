package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.YiliaoanpaiDao;
import com.entity.YiliaoanpaiEntity;
import com.service.YiliaoanpaiService;
import com.entity.vo.YiliaoanpaiVO;
import com.entity.view.YiliaoanpaiView;

@Service("yiliaoanpaiService")
public class YiliaoanpaiServiceImpl extends ServiceImpl<YiliaoanpaiDao, YiliaoanpaiEntity> implements YiliaoanpaiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YiliaoanpaiEntity> page = this.selectPage(
                new Query<YiliaoanpaiEntity>(params).getPage(),
                new EntityWrapper<YiliaoanpaiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YiliaoanpaiEntity> wrapper) {
		  Page<YiliaoanpaiView> page =new Query<YiliaoanpaiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YiliaoanpaiVO> selectListVO(Wrapper<YiliaoanpaiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YiliaoanpaiVO selectVO(Wrapper<YiliaoanpaiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YiliaoanpaiView> selectListView(Wrapper<YiliaoanpaiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YiliaoanpaiView selectView(Wrapper<YiliaoanpaiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
