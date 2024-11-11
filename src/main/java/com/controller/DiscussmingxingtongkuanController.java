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
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.DiscussmingxingtongkuanEntity;
import com.entity.view.DiscussmingxingtongkuanView;

import com.service.DiscussmingxingtongkuanService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 明星同款评论表
 * 后端接口
 * @author 
 * @email 
 * @date 2020-11-13 14:48:16
 */
@RestController
@RequestMapping("/discussmingxingtongkuan")
public class DiscussmingxingtongkuanController {
    @Autowired
    private DiscussmingxingtongkuanService discussmingxingtongkuanService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,DiscussmingxingtongkuanEntity discussmingxingtongkuan, HttpServletRequest request){

        EntityWrapper<DiscussmingxingtongkuanEntity> ew = new EntityWrapper<DiscussmingxingtongkuanEntity>();
		PageUtils page = discussmingxingtongkuanService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, discussmingxingtongkuan), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,DiscussmingxingtongkuanEntity discussmingxingtongkuan, HttpServletRequest request){
        EntityWrapper<DiscussmingxingtongkuanEntity> ew = new EntityWrapper<DiscussmingxingtongkuanEntity>();
		PageUtils page = discussmingxingtongkuanService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, discussmingxingtongkuan), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( DiscussmingxingtongkuanEntity discussmingxingtongkuan){
       	EntityWrapper<DiscussmingxingtongkuanEntity> ew = new EntityWrapper<DiscussmingxingtongkuanEntity>();
      	ew.allEq(MPUtil.allEQMapPre( discussmingxingtongkuan, "discussmingxingtongkuan")); 
        return R.ok().put("data", discussmingxingtongkuanService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(DiscussmingxingtongkuanEntity discussmingxingtongkuan){
        EntityWrapper< DiscussmingxingtongkuanEntity> ew = new EntityWrapper< DiscussmingxingtongkuanEntity>();
 		ew.allEq(MPUtil.allEQMapPre( discussmingxingtongkuan, "discussmingxingtongkuan")); 
		DiscussmingxingtongkuanView discussmingxingtongkuanView =  discussmingxingtongkuanService.selectView(ew);
		return R.ok("查询明星同款评论表成功").put("data", discussmingxingtongkuanView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        DiscussmingxingtongkuanEntity discussmingxingtongkuan = discussmingxingtongkuanService.selectById(id);
        return R.ok().put("data", discussmingxingtongkuan);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        DiscussmingxingtongkuanEntity discussmingxingtongkuan = discussmingxingtongkuanService.selectById(id);
        return R.ok().put("data", discussmingxingtongkuan);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody DiscussmingxingtongkuanEntity discussmingxingtongkuan, HttpServletRequest request){
    	discussmingxingtongkuan.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(discussmingxingtongkuan);

        discussmingxingtongkuanService.insert(discussmingxingtongkuan);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody DiscussmingxingtongkuanEntity discussmingxingtongkuan, HttpServletRequest request){
    	discussmingxingtongkuan.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(discussmingxingtongkuan);

        discussmingxingtongkuanService.insert(discussmingxingtongkuan);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody DiscussmingxingtongkuanEntity discussmingxingtongkuan, HttpServletRequest request){
        //ValidatorUtils.validateEntity(discussmingxingtongkuan);
        discussmingxingtongkuanService.updateById(discussmingxingtongkuan);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        discussmingxingtongkuanService.deleteBatchIds(Arrays.asList(ids));
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
		
		Wrapper<DiscussmingxingtongkuanEntity> wrapper = new EntityWrapper<DiscussmingxingtongkuanEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}


		int count = discussmingxingtongkuanService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	


}
