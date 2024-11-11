package com.entity.view;

import com.entity.DiscussmingxingtongkuanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 明星同款评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2020-11-13 14:48:16
 */
@TableName("discussmingxingtongkuan")
public class DiscussmingxingtongkuanView  extends DiscussmingxingtongkuanEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscussmingxingtongkuanView(){
	}
 
 	public DiscussmingxingtongkuanView(DiscussmingxingtongkuanEntity discussmingxingtongkuanEntity){
 	try {
			BeanUtils.copyProperties(this, discussmingxingtongkuanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
