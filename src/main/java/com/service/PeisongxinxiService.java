package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.PeisongxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.PeisongxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.PeisongxinxiView;


/**
 * 配送信息
 *
 * @author 
 * @email 
 * @date 2020-11-13 14:48:15
 */
public interface PeisongxinxiService extends IService<PeisongxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<PeisongxinxiVO> selectListVO(Wrapper<PeisongxinxiEntity> wrapper);
   	
   	PeisongxinxiVO selectVO(@Param("ew") Wrapper<PeisongxinxiEntity> wrapper);
   	
   	List<PeisongxinxiView> selectListView(Wrapper<PeisongxinxiEntity> wrapper);
   	
   	PeisongxinxiView selectView(@Param("ew") Wrapper<PeisongxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<PeisongxinxiEntity> wrapper);
   	
}

