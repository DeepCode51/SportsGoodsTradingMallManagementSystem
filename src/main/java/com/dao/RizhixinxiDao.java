package com.dao;

import com.entity.RizhixinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.RizhixinxiVO;
import com.entity.view.RizhixinxiView;


/**
 * 日志信息
 * 
 * @author 
 * @email 
 * @date 2020-11-13 14:48:15
 */
public interface RizhixinxiDao extends BaseMapper<RizhixinxiEntity> {
	
	List<RizhixinxiVO> selectListVO(@Param("ew") Wrapper<RizhixinxiEntity> wrapper);
	
	RizhixinxiVO selectVO(@Param("ew") Wrapper<RizhixinxiEntity> wrapper);
	
	List<RizhixinxiView> selectListView(@Param("ew") Wrapper<RizhixinxiEntity> wrapper);

	List<RizhixinxiView> selectListView(Pagination page,@Param("ew") Wrapper<RizhixinxiEntity> wrapper);
	
	RizhixinxiView selectView(@Param("ew") Wrapper<RizhixinxiEntity> wrapper);
	
}
