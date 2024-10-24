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


import com.dao.YiyuanliebiaoDao;
import com.entity.YiyuanliebiaoEntity;
import com.service.YiyuanliebiaoService;
import com.entity.vo.YiyuanliebiaoVO;
import com.entity.view.YiyuanliebiaoView;

@Service("yiyuanliebiaoService")
public class YiyuanliebiaoServiceImpl extends ServiceImpl<YiyuanliebiaoDao, YiyuanliebiaoEntity> implements YiyuanliebiaoService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YiyuanliebiaoEntity> page = this.selectPage(
                new Query<YiyuanliebiaoEntity>(params).getPage(),
                new EntityWrapper<YiyuanliebiaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YiyuanliebiaoEntity> wrapper) {
		  Page<YiyuanliebiaoView> page =new Query<YiyuanliebiaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YiyuanliebiaoVO> selectListVO(Wrapper<YiyuanliebiaoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YiyuanliebiaoVO selectVO(Wrapper<YiyuanliebiaoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YiyuanliebiaoView> selectListView(Wrapper<YiyuanliebiaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YiyuanliebiaoView selectView(Wrapper<YiyuanliebiaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
