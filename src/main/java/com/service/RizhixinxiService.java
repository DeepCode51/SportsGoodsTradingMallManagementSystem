package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.RizhixinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.RizhixinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.RizhixinxiView;


/**
 * 日志信息
 *
 * @author 
 * @email 
 * @date 2020-11-13 14:48:15
 */
public interface RizhixinxiService extends IService<RizhixinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<RizhixinxiVO> selectListVO(Wrapper<RizhixinxiEntity> wrapper);
   	
   	RizhixinxiVO selectVO(@Param("ew") Wrapper<RizhixinxiEntity> wrapper);
   	
   	List<RizhixinxiView> selectListView(Wrapper<RizhixinxiEntity> wrapper);
   	
   	RizhixinxiView selectView(@Param("ew") Wrapper<RizhixinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<RizhixinxiEntity> wrapper);
   	
}

