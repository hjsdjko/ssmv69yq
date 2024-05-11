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


import com.dao.QiuguanxinxiDao;
import com.entity.QiuguanxinxiEntity;
import com.service.QiuguanxinxiService;
import com.entity.vo.QiuguanxinxiVO;
import com.entity.view.QiuguanxinxiView;

@Service("qiuguanxinxiService")
public class QiuguanxinxiServiceImpl extends ServiceImpl<QiuguanxinxiDao, QiuguanxinxiEntity> implements QiuguanxinxiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<QiuguanxinxiEntity> page = this.selectPage(
                new Query<QiuguanxinxiEntity>(params).getPage(),
                new EntityWrapper<QiuguanxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<QiuguanxinxiEntity> wrapper) {
		  Page<QiuguanxinxiView> page =new Query<QiuguanxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<QiuguanxinxiVO> selectListVO(Wrapper<QiuguanxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public QiuguanxinxiVO selectVO(Wrapper<QiuguanxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<QiuguanxinxiView> selectListView(Wrapper<QiuguanxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public QiuguanxinxiView selectView(Wrapper<QiuguanxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
