package com.dao;

import com.entity.RukuxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.RukuxinxiVO;
import com.entity.view.RukuxinxiView;


/**
 * 入库信息
 * 
 * @author 
 * @email 
 * @date 2020-11-13 14:48:15
 */
public interface RukuxinxiDao extends BaseMapper<RukuxinxiEntity> {
	
	List<RukuxinxiVO> selectListVO(@Param("ew") Wrapper<RukuxinxiEntity> wrapper);
	
	RukuxinxiVO selectVO(@Param("ew") Wrapper<RukuxinxiEntity> wrapper);
	
	List<RukuxinxiView> selectListView(@Param("ew") Wrapper<RukuxinxiEntity> wrapper);

	List<RukuxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<RukuxinxiEntity> wrapper);
	
	RukuxinxiView selectView(@Param("ew") Wrapper<RukuxinxiEntity> wrapper);
	
}
