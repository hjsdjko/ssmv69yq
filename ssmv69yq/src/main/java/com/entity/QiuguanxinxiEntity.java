package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 球馆信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-04-01 15:17:43
 */
@TableName("qiuguanxinxi")
public class QiuguanxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public QiuguanxinxiEntity() {
		
	}
	
	public QiuguanxinxiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 球馆名称
	 */
					
	private String qiuguanmingcheng;
	
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
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：球馆名称
	 */
	public void setQiuguanmingcheng(String qiuguanmingcheng) {
		this.qiuguanmingcheng = qiuguanmingcheng;
	}
	/**
	 * 获取：球馆名称
	 */
	public String getQiuguanmingcheng() {
		return qiuguanmingcheng;
	}
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
