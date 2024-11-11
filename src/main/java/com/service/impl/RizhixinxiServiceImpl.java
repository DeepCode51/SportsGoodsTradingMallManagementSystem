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


import com.dao.RizhixinxiDao;
import com.entity.RizhixinxiEntity;
import com.service.RizhixinxiService;
import com.entity.vo.RizhixinxiVO;
import com.entity.view.RizhixinxiView;

@Service("rizhixinxiService")
public class RizhixinxiServiceImpl extends ServiceImpl<RizhixinxiDao, RizhixinxiEntity> implements RizhixinxiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<RizhixinxiEntity> page = this.selectPage(
                new Query<RizhixinxiEntity>(params).getPage(),
                new EntityWrapper<RizhixinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<RizhixinxiEntity> wrapper) {
		  Page<RizhixinxiView> page =new Query<RizhixinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<RizhixinxiVO> selectListVO(Wrapper<RizhixinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public RizhixinxiVO selectVO(Wrapper<RizhixinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<RizhixinxiView> selectListView(Wrapper<RizhixinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public RizhixinxiView selectView(Wrapper<RizhixinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
