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


import com.dao.YiyuanwenzhangDao;
import com.entity.YiyuanwenzhangEntity;
import com.service.YiyuanwenzhangService;
import com.entity.vo.YiyuanwenzhangVO;
import com.entity.view.YiyuanwenzhangView;

@Service("yiyuanwenzhangService")
public class YiyuanwenzhangServiceImpl extends ServiceImpl<YiyuanwenzhangDao, YiyuanwenzhangEntity> implements YiyuanwenzhangService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YiyuanwenzhangEntity> page = this.selectPage(
                new Query<YiyuanwenzhangEntity>(params).getPage(),
                new EntityWrapper<YiyuanwenzhangEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YiyuanwenzhangEntity> wrapper) {
		  Page<YiyuanwenzhangView> page =new Query<YiyuanwenzhangView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YiyuanwenzhangVO> selectListVO(Wrapper<YiyuanwenzhangEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YiyuanwenzhangVO selectVO(Wrapper<YiyuanwenzhangEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YiyuanwenzhangView> selectListView(Wrapper<YiyuanwenzhangEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YiyuanwenzhangView selectView(Wrapper<YiyuanwenzhangEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
