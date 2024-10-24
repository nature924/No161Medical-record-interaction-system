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


import com.dao.YiyuanDao;
import com.entity.YiyuanEntity;
import com.service.YiyuanService;
import com.entity.vo.YiyuanVO;
import com.entity.view.YiyuanView;

@Service("yiyuanService")
public class YiyuanServiceImpl extends ServiceImpl<YiyuanDao, YiyuanEntity> implements YiyuanService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YiyuanEntity> page = this.selectPage(
                new Query<YiyuanEntity>(params).getPage(),
                new EntityWrapper<YiyuanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YiyuanEntity> wrapper) {
		  Page<YiyuanView> page =new Query<YiyuanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YiyuanVO> selectListVO(Wrapper<YiyuanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YiyuanVO selectVO(Wrapper<YiyuanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YiyuanView> selectListView(Wrapper<YiyuanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YiyuanView selectView(Wrapper<YiyuanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
