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


import com.dao.DiscussyuanquzhanshiDao;
import com.entity.DiscussyuanquzhanshiEntity;
import com.service.DiscussyuanquzhanshiService;
import com.entity.vo.DiscussyuanquzhanshiVO;
import com.entity.view.DiscussyuanquzhanshiView;

@Service("discussyuanquzhanshiService")
public class DiscussyuanquzhanshiServiceImpl extends ServiceImpl<DiscussyuanquzhanshiDao, DiscussyuanquzhanshiEntity> implements DiscussyuanquzhanshiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussyuanquzhanshiEntity> page = this.selectPage(
                new Query<DiscussyuanquzhanshiEntity>(params).getPage(),
                new EntityWrapper<DiscussyuanquzhanshiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussyuanquzhanshiEntity> wrapper) {
		  Page<DiscussyuanquzhanshiView> page =new Query<DiscussyuanquzhanshiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussyuanquzhanshiVO> selectListVO(Wrapper<DiscussyuanquzhanshiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussyuanquzhanshiVO selectVO(Wrapper<DiscussyuanquzhanshiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussyuanquzhanshiView> selectListView(Wrapper<DiscussyuanquzhanshiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussyuanquzhanshiView selectView(Wrapper<DiscussyuanquzhanshiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
