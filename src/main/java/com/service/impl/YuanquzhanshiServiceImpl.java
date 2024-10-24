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


import com.dao.YuanquzhanshiDao;
import com.entity.YuanquzhanshiEntity;
import com.service.YuanquzhanshiService;
import com.entity.vo.YuanquzhanshiVO;
import com.entity.view.YuanquzhanshiView;

@Service("yuanquzhanshiService")
public class YuanquzhanshiServiceImpl extends ServiceImpl<YuanquzhanshiDao, YuanquzhanshiEntity> implements YuanquzhanshiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YuanquzhanshiEntity> page = this.selectPage(
                new Query<YuanquzhanshiEntity>(params).getPage(),
                new EntityWrapper<YuanquzhanshiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YuanquzhanshiEntity> wrapper) {
		  Page<YuanquzhanshiView> page =new Query<YuanquzhanshiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YuanquzhanshiVO> selectListVO(Wrapper<YuanquzhanshiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YuanquzhanshiVO selectVO(Wrapper<YuanquzhanshiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YuanquzhanshiView> selectListView(Wrapper<YuanquzhanshiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YuanquzhanshiView selectView(Wrapper<YuanquzhanshiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
