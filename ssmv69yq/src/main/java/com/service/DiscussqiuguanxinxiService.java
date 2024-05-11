package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussqiuguanxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussqiuguanxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussqiuguanxinxiView;


/**
 * 球馆信息评论表
 *
 * @author 
 * @email 
 * @date 2022-04-01 15:17:44
 */
public interface DiscussqiuguanxinxiService extends IService<DiscussqiuguanxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussqiuguanxinxiVO> selectListVO(Wrapper<DiscussqiuguanxinxiEntity> wrapper);
   	
   	DiscussqiuguanxinxiVO selectVO(@Param("ew") Wrapper<DiscussqiuguanxinxiEntity> wrapper);
   	
   	List<DiscussqiuguanxinxiView> selectListView(Wrapper<DiscussqiuguanxinxiEntity> wrapper);
   	
   	DiscussqiuguanxinxiView selectView(@Param("ew") Wrapper<DiscussqiuguanxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussqiuguanxinxiEntity> wrapper);
   	

}

