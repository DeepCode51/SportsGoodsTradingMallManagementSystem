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


import com.dao.PeisongxinxiDao;
import com.entity.PeisongxinxiEntity;
import com.service.PeisongxinxiService;
import com.entity.vo.PeisongxinxiVO;
import com.entity.view.PeisongxinxiView;

@Service("peisongxinxiService")
public class PeisongxinxiServiceImpl extends ServiceImpl<PeisongxinxiDao, PeisongxinxiEntity> implements PeisongxinxiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<PeisongxinxiEntity> page = this.selectPage(
                new Query<PeisongxinxiEntity>(params).getPage(),
                new EntityWrapper<PeisongxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<PeisongxinxiEntity> wrapper) {
		  Page<PeisongxinxiView> page =new Query<PeisongxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<PeisongxinxiVO> selectListVO(Wrapper<PeisongxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public PeisongxinxiVO selectVO(Wrapper<PeisongxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<PeisongxinxiView> selectListView(Wrapper<PeisongxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public PeisongxinxiView selectView(Wrapper<PeisongxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
