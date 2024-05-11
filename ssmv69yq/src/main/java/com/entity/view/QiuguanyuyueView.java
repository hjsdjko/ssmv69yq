package com.entity.view;

import com.entity.QiuguanyuyueEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 球馆预约
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-04-01 15:17:44
 */
@TableName("qiuguanyuyue")
public class QiuguanyuyueView  extends QiuguanyuyueEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public QiuguanyuyueView(){
	}
 
 	public QiuguanyuyueView(QiuguanyuyueEntity qiuguanyuyueEntity){
 	try {
			BeanUtils.copyProperties(this, qiuguanyuyueEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
