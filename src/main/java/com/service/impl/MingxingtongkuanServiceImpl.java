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


import com.dao.MingxingtongkuanDao;
import com.entity.MingxingtongkuanEntity;
import com.service.MingxingtongkuanService;
import com.entity.vo.MingxingtongkuanVO;
import com.entity.view.MingxingtongkuanView;

@Service("mingxingtongkuanService")
public class MingxingtongkuanServiceImpl extends ServiceImpl<MingxingtongkuanDao, MingxingtongkuanEntity> implements MingxingtongkuanService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<MingxingtongkuanEntity> page = this.selectPage(
                new Query<MingxingtongkuanEntity>(params).getPage(),
                new EntityWrapper<MingxingtongkuanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<MingxingtongkuanEntity> wrapper) {
		  Page<MingxingtongkuanView> page =new Query<MingxingtongkuanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<MingxingtongkuanVO> selectListVO(Wrapper<MingxingtongkuanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public MingxingtongkuanVO selectVO(Wrapper<MingxingtongkuanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<MingxingtongkuanView> selectListView(Wrapper<MingxingtongkuanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public MingxingtongkuanView selectView(Wrapper<MingxingtongkuanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
