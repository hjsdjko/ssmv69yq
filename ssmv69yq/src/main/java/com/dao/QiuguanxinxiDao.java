package com.dao;

import com.entity.QiuguanxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.QiuguanxinxiVO;
import com.entity.view.QiuguanxinxiView;


/**
 * 球馆信息
 * 
 * @author 
 * @email 
 * @date 2022-04-01 15:17:43
 */
public interface QiuguanxinxiDao extends BaseMapper<QiuguanxinxiEntity> {
	
	List<QiuguanxinxiVO> selectListVO(@Param("ew") Wrapper<QiuguanxinxiEntity> wrapper);
	
	QiuguanxinxiVO selectVO(@Param("ew") Wrapper<QiuguanxinxiEntity> wrapper);
	
	List<QiuguanxinxiView> selectListView(@Param("ew") Wrapper<QiuguanxinxiEntity> wrapper);

	List<QiuguanxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<QiuguanxinxiEntity> wrapper);
	
	QiuguanxinxiView selectView(@Param("ew") Wrapper<QiuguanxinxiEntity> wrapper);
	

}
