package com.entity.view;

import com.entity.PeisongxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 配送信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2020-11-13 14:48:15
 */
@TableName("peisongxinxi")
public class PeisongxinxiView  extends PeisongxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public PeisongxinxiView(){
	}
 
 	public PeisongxinxiView(PeisongxinxiEntity peisongxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, peisongxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
