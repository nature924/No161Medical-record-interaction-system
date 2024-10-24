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


import com.dao.YiyuangongzuorenyuanDao;
import com.entity.YiyuangongzuorenyuanEntity;
import com.service.YiyuangongzuorenyuanService;
import com.entity.vo.YiyuangongzuorenyuanVO;
import com.entity.view.YiyuangongzuorenyuanView;

@Service("yiyuangongzuorenyuanService")
public class YiyuangongzuorenyuanServiceImpl extends ServiceImpl<YiyuangongzuorenyuanDao, YiyuangongzuorenyuanEntity> implements YiyuangongzuorenyuanService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YiyuangongzuorenyuanEntity> page = this.selectPage(
                new Query<YiyuangongzuorenyuanEntity>(params).getPage(),
                new EntityWrapper<YiyuangongzuorenyuanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YiyuangongzuorenyuanEntity> wrapper) {
		  Page<YiyuangongzuorenyuanView> page =new Query<YiyuangongzuorenyuanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YiyuangongzuorenyuanVO> selectListVO(Wrapper<YiyuangongzuorenyuanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YiyuangongzuorenyuanVO selectVO(Wrapper<YiyuangongzuorenyuanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YiyuangongzuorenyuanView> selectListView(Wrapper<YiyuangongzuorenyuanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YiyuangongzuorenyuanView selectView(Wrapper<YiyuangongzuorenyuanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
