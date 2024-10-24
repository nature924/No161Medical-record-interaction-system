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


import com.dao.BingrenbingliDao;
import com.entity.BingrenbingliEntity;
import com.service.BingrenbingliService;
import com.entity.vo.BingrenbingliVO;
import com.entity.view.BingrenbingliView;

@Service("bingrenbingliService")
public class BingrenbingliServiceImpl extends ServiceImpl<BingrenbingliDao, BingrenbingliEntity> implements BingrenbingliService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<BingrenbingliEntity> page = this.selectPage(
                new Query<BingrenbingliEntity>(params).getPage(),
                new EntityWrapper<BingrenbingliEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<BingrenbingliEntity> wrapper) {
		  Page<BingrenbingliView> page =new Query<BingrenbingliView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<BingrenbingliVO> selectListVO(Wrapper<BingrenbingliEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public BingrenbingliVO selectVO(Wrapper<BingrenbingliEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<BingrenbingliView> selectListView(Wrapper<BingrenbingliEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public BingrenbingliView selectView(Wrapper<BingrenbingliEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
