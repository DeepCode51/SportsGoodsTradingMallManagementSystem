package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.MingxingtongkuanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.MingxingtongkuanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.MingxingtongkuanView;


/**
 * 明星同款
 *
 * @author 
 * @email 
 * @date 2020-11-13 14:48:15
 */
public interface MingxingtongkuanService extends IService<MingxingtongkuanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<MingxingtongkuanVO> selectListVO(Wrapper<MingxingtongkuanEntity> wrapper);
   	
   	MingxingtongkuanVO selectVO(@Param("ew") Wrapper<MingxingtongkuanEntity> wrapper);
   	
   	List<MingxingtongkuanView> selectListView(Wrapper<MingxingtongkuanEntity> wrapper);
   	
   	MingxingtongkuanView selectView(@Param("ew") Wrapper<MingxingtongkuanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<MingxingtongkuanEntity> wrapper);
   	
}

