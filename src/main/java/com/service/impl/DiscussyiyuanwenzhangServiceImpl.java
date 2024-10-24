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


import com.dao.DiscussyiyuanwenzhangDao;
import com.entity.DiscussyiyuanwenzhangEntity;
import com.service.DiscussyiyuanwenzhangService;
import com.entity.vo.DiscussyiyuanwenzhangVO;
import com.entity.view.DiscussyiyuanwenzhangView;

@Service("discussyiyuanwenzhangService")
public class DiscussyiyuanwenzhangServiceImpl extends ServiceImpl<DiscussyiyuanwenzhangDao, DiscussyiyuanwenzhangEntity> implements DiscussyiyuanwenzhangService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussyiyuanwenzhangEntity> page = this.selectPage(
                new Query<DiscussyiyuanwenzhangEntity>(params).getPage(),
                new EntityWrapper<DiscussyiyuanwenzhangEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussyiyuanwenzhangEntity> wrapper) {
		  Page<DiscussyiyuanwenzhangView> page =new Query<DiscussyiyuanwenzhangView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussyiyuanwenzhangVO> selectListVO(Wrapper<DiscussyiyuanwenzhangEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussyiyuanwenzhangVO selectVO(Wrapper<DiscussyiyuanwenzhangEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussyiyuanwenzhangView> selectListView(Wrapper<DiscussyiyuanwenzhangEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussyiyuanwenzhangView selectView(Wrapper<DiscussyiyuanwenzhangEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
