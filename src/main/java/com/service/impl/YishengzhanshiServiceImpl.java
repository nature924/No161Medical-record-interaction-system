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


import com.dao.YishengzhanshiDao;
import com.entity.YishengzhanshiEntity;
import com.service.YishengzhanshiService;
import com.entity.vo.YishengzhanshiVO;
import com.entity.view.YishengzhanshiView;

@Service("yishengzhanshiService")
public class YishengzhanshiServiceImpl extends ServiceImpl<YishengzhanshiDao, YishengzhanshiEntity> implements YishengzhanshiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YishengzhanshiEntity> page = this.selectPage(
                new Query<YishengzhanshiEntity>(params).getPage(),
                new EntityWrapper<YishengzhanshiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YishengzhanshiEntity> wrapper) {
		  Page<YishengzhanshiView> page =new Query<YishengzhanshiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YishengzhanshiVO> selectListVO(Wrapper<YishengzhanshiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YishengzhanshiVO selectVO(Wrapper<YishengzhanshiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YishengzhanshiView> selectListView(Wrapper<YishengzhanshiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YishengzhanshiView selectView(Wrapper<YishengzhanshiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
