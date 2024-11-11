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


import com.dao.DiscussmingxingtongkuanDao;
import com.entity.DiscussmingxingtongkuanEntity;
import com.service.DiscussmingxingtongkuanService;
import com.entity.vo.DiscussmingxingtongkuanVO;
import com.entity.view.DiscussmingxingtongkuanView;

@Service("discussmingxingtongkuanService")
public class DiscussmingxingtongkuanServiceImpl extends ServiceImpl<DiscussmingxingtongkuanDao, DiscussmingxingtongkuanEntity> implements DiscussmingxingtongkuanService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussmingxingtongkuanEntity> page = this.selectPage(
                new Query<DiscussmingxingtongkuanEntity>(params).getPage(),
                new EntityWrapper<DiscussmingxingtongkuanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussmingxingtongkuanEntity> wrapper) {
		  Page<DiscussmingxingtongkuanView> page =new Query<DiscussmingxingtongkuanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussmingxingtongkuanVO> selectListVO(Wrapper<DiscussmingxingtongkuanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussmingxingtongkuanVO selectVO(Wrapper<DiscussmingxingtongkuanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussmingxingtongkuanView> selectListView(Wrapper<DiscussmingxingtongkuanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussmingxingtongkuanView selectView(Wrapper<DiscussmingxingtongkuanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
