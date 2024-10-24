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


import com.dao.YiyuangonggaoDao;
import com.entity.YiyuangonggaoEntity;
import com.service.YiyuangonggaoService;
import com.entity.vo.YiyuangonggaoVO;
import com.entity.view.YiyuangonggaoView;

@Service("yiyuangonggaoService")
public class YiyuangonggaoServiceImpl extends ServiceImpl<YiyuangonggaoDao, YiyuangonggaoEntity> implements YiyuangonggaoService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YiyuangonggaoEntity> page = this.selectPage(
                new Query<YiyuangonggaoEntity>(params).getPage(),
                new EntityWrapper<YiyuangonggaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YiyuangonggaoEntity> wrapper) {
		  Page<YiyuangonggaoView> page =new Query<YiyuangonggaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YiyuangonggaoVO> selectListVO(Wrapper<YiyuangonggaoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YiyuangonggaoVO selectVO(Wrapper<YiyuangonggaoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YiyuangonggaoView> selectListView(Wrapper<YiyuangonggaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YiyuangonggaoView selectView(Wrapper<YiyuangonggaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
