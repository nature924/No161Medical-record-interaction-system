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


import com.dao.YiyuankeshiyuyueDao;
import com.entity.YiyuankeshiyuyueEntity;
import com.service.YiyuankeshiyuyueService;
import com.entity.vo.YiyuankeshiyuyueVO;
import com.entity.view.YiyuankeshiyuyueView;

@Service("yiyuankeshiyuyueService")
public class YiyuankeshiyuyueServiceImpl extends ServiceImpl<YiyuankeshiyuyueDao, YiyuankeshiyuyueEntity> implements YiyuankeshiyuyueService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YiyuankeshiyuyueEntity> page = this.selectPage(
                new Query<YiyuankeshiyuyueEntity>(params).getPage(),
                new EntityWrapper<YiyuankeshiyuyueEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YiyuankeshiyuyueEntity> wrapper) {
		  Page<YiyuankeshiyuyueView> page =new Query<YiyuankeshiyuyueView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YiyuankeshiyuyueVO> selectListVO(Wrapper<YiyuankeshiyuyueEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YiyuankeshiyuyueVO selectVO(Wrapper<YiyuankeshiyuyueEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YiyuankeshiyuyueView> selectListView(Wrapper<YiyuankeshiyuyueEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YiyuankeshiyuyueView selectView(Wrapper<YiyuankeshiyuyueEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
