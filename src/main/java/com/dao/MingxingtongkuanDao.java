package com.dao;

import com.entity.MingxingtongkuanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.MingxingtongkuanVO;
import com.entity.view.MingxingtongkuanView;


/**
 * 明星同款
 * 
 * @author 
 * @email 
 * @date 2020-11-13 14:48:15
 */
public interface MingxingtongkuanDao extends BaseMapper<MingxingtongkuanEntity> {
	
	List<MingxingtongkuanVO> selectListVO(@Param("ew") Wrapper<MingxingtongkuanEntity> wrapper);
	
	MingxingtongkuanVO selectVO(@Param("ew") Wrapper<MingxingtongkuanEntity> wrapper);
	
	List<MingxingtongkuanView> selectListView(@Param("ew") Wrapper<MingxingtongkuanEntity> wrapper);

	List<MingxingtongkuanView> selectListView(Pagination page,@Param("ew") Wrapper<MingxingtongkuanEntity> wrapper);
	
	MingxingtongkuanView selectView(@Param("ew") Wrapper<MingxingtongkuanEntity> wrapper);
	
}
