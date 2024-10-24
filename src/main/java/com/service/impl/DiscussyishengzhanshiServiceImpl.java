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


import com.dao.DiscussyishengzhanshiDao;
import com.entity.DiscussyishengzhanshiEntity;
import com.service.DiscussyishengzhanshiService;
import com.entity.vo.DiscussyishengzhanshiVO;
import com.entity.view.DiscussyishengzhanshiView;

@Service("discussyishengzhanshiService")
public class DiscussyishengzhanshiServiceImpl extends ServiceImpl<DiscussyishengzhanshiDao, DiscussyishengzhanshiEntity> implements DiscussyishengzhanshiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussyishengzhanshiEntity> page = this.selectPage(
                new Query<DiscussyishengzhanshiEntity>(params).getPage(),
                new EntityWrapper<DiscussyishengzhanshiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussyishengzhanshiEntity> wrapper) {
		  Page<DiscussyishengzhanshiView> page =new Query<DiscussyishengzhanshiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussyishengzhanshiVO> selectListVO(Wrapper<DiscussyishengzhanshiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussyishengzhanshiVO selectVO(Wrapper<DiscussyishengzhanshiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussyishengzhanshiView> selectListView(Wrapper<DiscussyishengzhanshiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussyishengzhanshiView selectView(Wrapper<DiscussyishengzhanshiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
