package com.entity.vo;

import com.entity.QiuguanxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 球馆信息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-04-01 15:17:43
 */
public class QiuguanxinxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 场地名称
	 */
	
	private String changdimingcheng;
		
	/**
	 * 场地类型
	 */
	
	private String changdileixing;
		
	/**
	 * 图片
	 */
	
	private String tupian;
		
	/**
	 * 场地数量
	 */
	
	private Integer changdishuliang;
		
	/**
	 * 开放时间
	 */
	
	private String kaifangshijian;
		
	/**
	 * 咨询电话
	 */
	
	private String zixundianhua;
		
	/**
	 * 球馆介绍
	 */
	
	private String qiuguanjieshao;
				
	
	/**
	 * 设置：场地名称
	 */
	 
	public void setChangdimingcheng(String changdimingcheng) {
		this.changdimingcheng = changdimingcheng;
	}
	
	/**
	 * 获取：场地名称
	 */
	public String getChangdimingcheng() {
		return changdimingcheng;
	}
				
	
	/**
	 * 设置：场地类型
	 */
	 
	public void setChangdileixing(String changdileixing) {
		this.changdileixing = changdileixing;
	}
	
	/**
	 * 获取：场地类型
	 */
	public String getChangdileixing() {
		return changdileixing;
	}
				
	
	/**
	 * 设置：图片
	 */
	 
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
	}
				
	
	/**
	 * 设置：场地数量
	 */
	 
	public void setChangdishuliang(Integer changdishuliang) {
		this.changdishuliang = changdishuliang;
	}
	
	/**
	 * 获取：场地数量
	 */
	public Integer getChangdishuliang() {
		return changdishuliang;
	}
				
	
	/**
	 * 设置：开放时间
	 */
	 
	public void setKaifangshijian(String kaifangshijian) {
		this.kaifangshijian = kaifangshijian;
	}
	
	/**
	 * 获取：开放时间
	 */
	public String getKaifangshijian() {
		return kaifangshijian;
	}
				
	
	/**
	 * 设置：咨询电话
	 */
	 
	public void setZixundianhua(String zixundianhua) {
		this.zixundianhua = zixundianhua;
	}
	
	/**
	 * 获取：咨询电话
	 */
	public String getZixundianhua() {
		return zixundianhua;
	}
				
	
	/**
	 * 设置：球馆介绍
	 */
	 
	public void setQiuguanjieshao(String qiuguanjieshao) {
		this.qiuguanjieshao = qiuguanjieshao;
	}
	
	/**
	 * 获取：球馆介绍
	 */
	public String getQiuguanjieshao() {
		return qiuguanjieshao;
	}
			
}
