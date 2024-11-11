package com.dao;

import com.entity.DiscussmingxingtongkuanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussmingxingtongkuanVO;
import com.entity.view.DiscussmingxingtongkuanView;


/**
 * 明星同款评论表
 * 
 * @author 
 * @email 
 * @date 2020-11-13 14:48:16
 */
public interface DiscussmingxingtongkuanDao extends BaseMapper<DiscussmingxingtongkuanEntity> {
	
	List<DiscussmingxingtongkuanVO> selectListVO(@Param("ew") Wrapper<DiscussmingxingtongkuanEntity> wrapper);
	
	DiscussmingxingtongkuanVO selectVO(@Param("ew") Wrapper<DiscussmingxingtongkuanEntity> wrapper);
	
	List<DiscussmingxingtongkuanView> selectListView(@Param("ew") Wrapper<DiscussmingxingtongkuanEntity> wrapper);

	List<DiscussmingxingtongkuanView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussmingxingtongkuanEntity> wrapper);
	
	DiscussmingxingtongkuanView selectView(@Param("ew") Wrapper<DiscussmingxingtongkuanEntity> wrapper);
	
}
