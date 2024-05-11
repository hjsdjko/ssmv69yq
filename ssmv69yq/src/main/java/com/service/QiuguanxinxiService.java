package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.QiuguanxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.QiuguanxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.QiuguanxinxiView;


/**
 * 球馆信息
 *
 * @author 
 * @email 
 * @date 2022-04-01 15:17:43
 */
public interface QiuguanxinxiService extends IService<QiuguanxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<QiuguanxinxiVO> selectListVO(Wrapper<QiuguanxinxiEntity> wrapper);
   	
   	QiuguanxinxiVO selectVO(@Param("ew") Wrapper<QiuguanxinxiEntity> wrapper);
   	
   	List<QiuguanxinxiView> selectListView(Wrapper<QiuguanxinxiEntity> wrapper);
   	
   	QiuguanxinxiView selectView(@Param("ew") Wrapper<QiuguanxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<QiuguanxinxiEntity> wrapper);
   	

}

