package com.dao;

import com.entity.QiuguanyuyueEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.QiuguanyuyueVO;
import com.entity.view.QiuguanyuyueView;


/**
 * 球馆预约
 * 
 * @author 
 * @email 
 * @date 2022-04-01 15:17:44
 */
public interface QiuguanyuyueDao extends BaseMapper<QiuguanyuyueEntity> {
	
	List<QiuguanyuyueVO> selectListVO(@Param("ew") Wrapper<QiuguanyuyueEntity> wrapper);
	
	QiuguanyuyueVO selectVO(@Param("ew") Wrapper<QiuguanyuyueEntity> wrapper);
	
	List<QiuguanyuyueView> selectListView(@Param("ew") Wrapper<QiuguanyuyueEntity> wrapper);

	List<QiuguanyuyueView> selectListView(Pagination page,@Param("ew") Wrapper<QiuguanyuyueEntity> wrapper);
	
	QiuguanyuyueView selectView(@Param("ew") Wrapper<QiuguanyuyueEntity> wrapper);
	

}
