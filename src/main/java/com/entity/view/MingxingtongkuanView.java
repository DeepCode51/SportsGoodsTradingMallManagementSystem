package com.entity.view;

import com.entity.MingxingtongkuanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 明星同款
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2020-11-13 14:48:15
 */
@TableName("mingxingtongkuan")
public class MingxingtongkuanView  extends MingxingtongkuanEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public MingxingtongkuanView(){
	}
 
 	public MingxingtongkuanView(MingxingtongkuanEntity mingxingtongkuanEntity){
 	try {
			BeanUtils.copyProperties(this, mingxingtongkuanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
