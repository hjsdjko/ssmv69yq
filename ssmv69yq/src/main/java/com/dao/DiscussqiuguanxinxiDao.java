package com.dao;

import com.entity.DiscussqiuguanxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussqiuguanxinxiVO;
import com.entity.view.DiscussqiuguanxinxiView;


/**
 * 球馆信息评论表
 * 
 * @author 
 * @email 
 * @date 2022-04-01 15:17:44
 */
public interface DiscussqiuguanxinxiDao extends BaseMapper<DiscussqiuguanxinxiEntity> {
	
	List<DiscussqiuguanxinxiVO> selectListVO(@Param("ew") Wrapper<DiscussqiuguanxinxiEntity> wrapper);
	
	DiscussqiuguanxinxiVO selectVO(@Param("ew") Wrapper<DiscussqiuguanxinxiEntity> wrapper);
	
	List<DiscussqiuguanxinxiView> selectListView(@Param("ew") Wrapper<DiscussqiuguanxinxiEntity> wrapper);

	List<DiscussqiuguanxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussqiuguanxinxiEntity> wrapper);
	
	DiscussqiuguanxinxiView selectView(@Param("ew") Wrapper<DiscussqiuguanxinxiEntity> wrapper);
	

}
