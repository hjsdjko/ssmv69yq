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
import java.io.IOException;

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

import com.entity.QiuguanxinxiEntity;
import com.entity.view.QiuguanxinxiView;

import com.service.QiuguanxinxiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;
import com.service.StoreupService;
import com.entity.StoreupEntity;

/**
 * 球馆信息
 * 后端接口
 * @author 
 * @email 
 * @date 2022-04-01 15:17:43
 */
@RestController
@RequestMapping("/qiuguanxinxi")
public class QiuguanxinxiController {
    @Autowired
    private QiuguanxinxiService qiuguanxinxiService;


    @Autowired
    private StoreupService storeupService;

    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,QiuguanxinxiEntity qiuguanxinxi, 
		HttpServletRequest request){

        EntityWrapper<QiuguanxinxiEntity> ew = new EntityWrapper<QiuguanxinxiEntity>();
		PageUtils page = qiuguanxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, qiuguanxinxi), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,QiuguanxinxiEntity qiuguanxinxi, 
		HttpServletRequest request){
        EntityWrapper<QiuguanxinxiEntity> ew = new EntityWrapper<QiuguanxinxiEntity>();
		PageUtils page = qiuguanxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, qiuguanxinxi), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( QiuguanxinxiEntity qiuguanxinxi){
       	EntityWrapper<QiuguanxinxiEntity> ew = new EntityWrapper<QiuguanxinxiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( qiuguanxinxi, "qiuguanxinxi")); 
        return R.ok().put("data", qiuguanxinxiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(QiuguanxinxiEntity qiuguanxinxi){
        EntityWrapper< QiuguanxinxiEntity> ew = new EntityWrapper< QiuguanxinxiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( qiuguanxinxi, "qiuguanxinxi")); 
		QiuguanxinxiView qiuguanxinxiView =  qiuguanxinxiService.selectView(ew);
		return R.ok("查询球馆信息成功").put("data", qiuguanxinxiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        QiuguanxinxiEntity qiuguanxinxi = qiuguanxinxiService.selectById(id);
        return R.ok().put("data", qiuguanxinxi);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        QiuguanxinxiEntity qiuguanxinxi = qiuguanxinxiService.selectById(id);
        return R.ok().put("data", qiuguanxinxi);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody QiuguanxinxiEntity qiuguanxinxi, HttpServletRequest request){
    	qiuguanxinxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(qiuguanxinxi);

        qiuguanxinxiService.insert(qiuguanxinxi);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody QiuguanxinxiEntity qiuguanxinxi, HttpServletRequest request){
    	qiuguanxinxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(qiuguanxinxi);

        qiuguanxinxiService.insert(qiuguanxinxi);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody QiuguanxinxiEntity qiuguanxinxi, HttpServletRequest request){
        //ValidatorUtils.validateEntity(qiuguanxinxi);
        qiuguanxinxiService.updateById(qiuguanxinxi);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        qiuguanxinxiService.deleteBatchIds(Arrays.asList(ids));
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
		
		Wrapper<QiuguanxinxiEntity> wrapper = new EntityWrapper<QiuguanxinxiEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}


		int count = qiuguanxinxiService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	







}
