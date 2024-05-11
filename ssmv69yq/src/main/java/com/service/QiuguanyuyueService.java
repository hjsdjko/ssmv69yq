package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.QiuguanyuyueEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.QiuguanyuyueVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.QiuguanyuyueView;


/**
 * 球馆预约
 *
 * @author 
 * @email 
 * @date 2022-04-01 15:17:44
 */
public interface QiuguanyuyueService extends IService<QiuguanyuyueEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<QiuguanyuyueVO> selectListVO(Wrapper<QiuguanyuyueEntity> wrapper);
   	
   	QiuguanyuyueVO selectVO(@Param("ew") Wrapper<QiuguanyuyueEntity> wrapper);
   	
   	List<QiuguanyuyueView> selectListView(Wrapper<QiuguanyuyueEntity> wrapper);
   	
   	QiuguanyuyueView selectView(@Param("ew") Wrapper<QiuguanyuyueEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<QiuguanyuyueEntity> wrapper);
   	

}

