package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.YiyuankeshiyuyueEntity;
import com.entity.view.YiyuankeshiyuyueView;

import com.service.YiyuankeshiyuyueService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 医院科室预约
 * 后端接口
 * @author 
 * @email 
 * @date 2021-04-20 11:48:28
 */
@RestController
@RequestMapping("/yiyuankeshiyuyue")
public class YiyuankeshiyuyueController {
    @Autowired
    private YiyuankeshiyuyueService yiyuankeshiyuyueService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,YiyuankeshiyuyueEntity yiyuankeshiyuyue,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yiyuan")) {
			yiyuankeshiyuyue.setYiyuanbianhao((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("yonghu")) {
			yiyuankeshiyuyue.setZhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<YiyuankeshiyuyueEntity> ew = new EntityWrapper<YiyuankeshiyuyueEntity>();
		PageUtils page = yiyuankeshiyuyueService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, yiyuankeshiyuyue), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,YiyuankeshiyuyueEntity yiyuankeshiyuyue, HttpServletRequest request){
        EntityWrapper<YiyuankeshiyuyueEntity> ew = new EntityWrapper<YiyuankeshiyuyueEntity>();
		PageUtils page = yiyuankeshiyuyueService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, yiyuankeshiyuyue), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( YiyuankeshiyuyueEntity yiyuankeshiyuyue){
       	EntityWrapper<YiyuankeshiyuyueEntity> ew = new EntityWrapper<YiyuankeshiyuyueEntity>();
      	ew.allEq(MPUtil.allEQMapPre( yiyuankeshiyuyue, "yiyuankeshiyuyue")); 
        return R.ok().put("data", yiyuankeshiyuyueService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(YiyuankeshiyuyueEntity yiyuankeshiyuyue){
        EntityWrapper< YiyuankeshiyuyueEntity> ew = new EntityWrapper< YiyuankeshiyuyueEntity>();
 		ew.allEq(MPUtil.allEQMapPre( yiyuankeshiyuyue, "yiyuankeshiyuyue")); 
		YiyuankeshiyuyueView yiyuankeshiyuyueView =  yiyuankeshiyuyueService.selectView(ew);
		return R.ok("查询医院科室预约成功").put("data", yiyuankeshiyuyueView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        YiyuankeshiyuyueEntity yiyuankeshiyuyue = yiyuankeshiyuyueService.selectById(id);
        return R.ok().put("data", yiyuankeshiyuyue);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        YiyuankeshiyuyueEntity yiyuankeshiyuyue = yiyuankeshiyuyueService.selectById(id);
        return R.ok().put("data", yiyuankeshiyuyue);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody YiyuankeshiyuyueEntity yiyuankeshiyuyue, HttpServletRequest request){
    	yiyuankeshiyuyue.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(yiyuankeshiyuyue);
        yiyuankeshiyuyueService.insert(yiyuankeshiyuyue);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody YiyuankeshiyuyueEntity yiyuankeshiyuyue, HttpServletRequest request){
    	yiyuankeshiyuyue.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(yiyuankeshiyuyue);
        yiyuankeshiyuyueService.insert(yiyuankeshiyuyue);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody YiyuankeshiyuyueEntity yiyuankeshiyuyue, HttpServletRequest request){
        //ValidatorUtils.validateEntity(yiyuankeshiyuyue);
        yiyuankeshiyuyueService.updateById(yiyuankeshiyuyue);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        yiyuankeshiyuyueService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<YiyuankeshiyuyueEntity> wrapper = new EntityWrapper<YiyuankeshiyuyueEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yiyuan")) {
			wrapper.eq("yiyuanbianhao", (String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("yonghu")) {
			wrapper.eq("zhanghao", (String)request.getSession().getAttribute("username"));
		}

		int count = yiyuankeshiyuyueService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	


}
