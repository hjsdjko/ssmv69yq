package com.entity.view;

import com.entity.QiuguanxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 球馆信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-04-01 15:17:43
 */
@TableName("qiuguanxinxi")
public class QiuguanxinxiView  extends QiuguanxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public QiuguanxinxiView(){
	}
 
 	public QiuguanxinxiView(QiuguanxinxiEntity qiuguanxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, qiuguanxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
