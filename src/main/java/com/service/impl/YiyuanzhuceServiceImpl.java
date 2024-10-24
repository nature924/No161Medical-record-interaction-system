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


import com.dao.YiyuanzhuceDao;
import com.entity.YiyuanzhuceEntity;
import com.service.YiyuanzhuceService;
import com.entity.vo.YiyuanzhuceVO;
import com.entity.view.YiyuanzhuceView;

@Service("yiyuanzhuceService")
public class YiyuanzhuceServiceImpl extends ServiceImpl<YiyuanzhuceDao, YiyuanzhuceEntity> implements YiyuanzhuceService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YiyuanzhuceEntity> page = this.selectPage(
                new Query<YiyuanzhuceEntity>(params).getPage(),
                new EntityWrapper<YiyuanzhuceEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YiyuanzhuceEntity> wrapper) {
		  Page<YiyuanzhuceView> page =new Query<YiyuanzhuceView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YiyuanzhuceVO> selectListVO(Wrapper<YiyuanzhuceEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YiyuanzhuceVO selectVO(Wrapper<YiyuanzhuceEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YiyuanzhuceView> selectListView(Wrapper<YiyuanzhuceEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YiyuanzhuceView selectView(Wrapper<YiyuanzhuceEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
