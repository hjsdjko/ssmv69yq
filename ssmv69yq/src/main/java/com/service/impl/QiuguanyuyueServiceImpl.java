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


import com.dao.QiuguanyuyueDao;
import com.entity.QiuguanyuyueEntity;
import com.service.QiuguanyuyueService;
import com.entity.vo.QiuguanyuyueVO;
import com.entity.view.QiuguanyuyueView;

@Service("qiuguanyuyueService")
public class QiuguanyuyueServiceImpl extends ServiceImpl<QiuguanyuyueDao, QiuguanyuyueEntity> implements QiuguanyuyueService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<QiuguanyuyueEntity> page = this.selectPage(
                new Query<QiuguanyuyueEntity>(params).getPage(),
                new EntityWrapper<QiuguanyuyueEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<QiuguanyuyueEntity> wrapper) {
		  Page<QiuguanyuyueView> page =new Query<QiuguanyuyueView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<QiuguanyuyueVO> selectListVO(Wrapper<QiuguanyuyueEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public QiuguanyuyueVO selectVO(Wrapper<QiuguanyuyueEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<QiuguanyuyueView> selectListView(Wrapper<QiuguanyuyueEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public QiuguanyuyueView selectView(Wrapper<QiuguanyuyueEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
