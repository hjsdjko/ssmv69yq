package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.DiscussqiuguanxinxiDao;
import com.entity.DiscussqiuguanxinxiEntity;
import com.service.DiscussqiuguanxinxiService;
import com.entity.vo.DiscussqiuguanxinxiVO;
import com.entity.view.DiscussqiuguanxinxiView;

@Service("discussqiuguanxinxiService")
public class DiscussqiuguanxinxiServiceImpl extends ServiceImpl<DiscussqiuguanxinxiDao, DiscussqiuguanxinxiEntity> implements DiscussqiuguanxinxiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussqiuguanxinxiEntity> page = this.selectPage(
                new Query<DiscussqiuguanxinxiEntity>(params).getPage(),
                new EntityWrapper<DiscussqiuguanxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussqiuguanxinxiEntity> wrapper) {
		  Page<DiscussqiuguanxinxiView> page =new Query<DiscussqiuguanxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussqiuguanxinxiVO> selectListVO(Wrapper<DiscussqiuguanxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussqiuguanxinxiVO selectVO(Wrapper<DiscussqiuguanxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussqiuguanxinxiView> selectListView(Wrapper<DiscussqiuguanxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussqiuguanxinxiView selectView(Wrapper<DiscussqiuguanxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
