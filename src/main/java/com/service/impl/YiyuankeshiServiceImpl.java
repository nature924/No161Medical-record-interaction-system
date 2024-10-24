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


import com.dao.YiyuankeshiDao;
import com.entity.YiyuankeshiEntity;
import com.service.YiyuankeshiService;
import com.entity.vo.YiyuankeshiVO;
import com.entity.view.YiyuankeshiView;

@Service("yiyuankeshiService")
public class YiyuankeshiServiceImpl extends ServiceImpl<YiyuankeshiDao, YiyuankeshiEntity> implements YiyuankeshiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YiyuankeshiEntity> page = this.selectPage(
                new Query<YiyuankeshiEntity>(params).getPage(),
                new EntityWrapper<YiyuankeshiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YiyuankeshiEntity> wrapper) {
		  Page<YiyuankeshiView> page =new Query<YiyuankeshiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YiyuankeshiVO> selectListVO(Wrapper<YiyuankeshiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YiyuankeshiVO selectVO(Wrapper<YiyuankeshiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YiyuankeshiView> selectListView(Wrapper<YiyuankeshiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YiyuankeshiView selectView(Wrapper<YiyuankeshiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
