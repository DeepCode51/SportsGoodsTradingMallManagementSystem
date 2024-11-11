package com.dao;

import com.entity.PeisongxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.PeisongxinxiVO;
import com.entity.view.PeisongxinxiView;


/**
 * 配送信息
 * 
 * @author 
 * @email 
 * @date 2020-11-13 14:48:15
 */
public interface PeisongxinxiDao extends BaseMapper<PeisongxinxiEntity> {
	
	List<PeisongxinxiVO> selectListVO(@Param("ew") Wrapper<PeisongxinxiEntity> wrapper);
	
	PeisongxinxiVO selectVO(@Param("ew") Wrapper<PeisongxinxiEntity> wrapper);
	
	List<PeisongxinxiView> selectListView(@Param("ew") Wrapper<PeisongxinxiEntity> wrapper);

	List<PeisongxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<PeisongxinxiEntity> wrapper);
	
	PeisongxinxiView selectView(@Param("ew") Wrapper<PeisongxinxiEntity> wrapper);
	
}
