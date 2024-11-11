package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussmingxingtongkuanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussmingxingtongkuanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussmingxingtongkuanView;


/**
 * 明星同款评论表
 *
 * @author 
 * @email 
 * @date 2020-11-13 14:48:16
 */
public interface DiscussmingxingtongkuanService extends IService<DiscussmingxingtongkuanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussmingxingtongkuanVO> selectListVO(Wrapper<DiscussmingxingtongkuanEntity> wrapper);
   	
   	DiscussmingxingtongkuanVO selectVO(@Param("ew") Wrapper<DiscussmingxingtongkuanEntity> wrapper);
   	
   	List<DiscussmingxingtongkuanView> selectListView(Wrapper<DiscussmingxingtongkuanEntity> wrapper);
   	
   	DiscussmingxingtongkuanView selectView(@Param("ew") Wrapper<DiscussmingxingtongkuanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussmingxingtongkuanEntity> wrapper);
   	
}

