package com.hxd.bean;

import java.math.BigDecimal;


/**
 * 
 * <br>
 * <b>功能：</b>ZcTypeBean<br>
 */
public class ZcType {
	
		/*唯一ID*/	private Integer id;
	/*父ID(为0是根)*/	private Integer pid;
	/*分类编号*/	private String typeSN;
	/*分类名称*/	private String typeName;
	/*折旧方式*/	private String zjMethod;
	/*残值率*/	private BigDecimal cZL;
	/*使用年限*/	private Integer limitYear;
	/*排序号(0-9999)*/	private Integer sortNum;
	/*备注*/	private String tip;
	/*状态(备用字段)*/	private Integer status;
	public Integer getId() {	    return this.id;	}
	public void setId(Integer id) {	    this.id=id;	}
	public Integer getPid() {	    return this.pid;	}
	public void setPid(Integer pid) {	    this.pid=pid;	}
	public String getTypeSN() {	    return this.typeSN;	}
	public void setTypeSN(String typeSN) {	    this.typeSN=typeSN;	}
	public String getTypeName() {	    return this.typeName;	}
	public void setTypeName(String typeName) {	    this.typeName=typeName;	}
	public String getZjMethod() {	    return this.zjMethod;	}
	public void setZjMethod(String zjMethod) {	    this.zjMethod=zjMethod;	}
	public BigDecimal getCZL() {	    return this.cZL;	}
	public void setCZL(BigDecimal cZL) {	    this.cZL=cZL;	}
	public Integer getLimitYear() {	    return this.limitYear;	}
	public void setLimitYear(Integer limitYear) {	    this.limitYear=limitYear;	}
	public Integer getSortNum() {	    return this.sortNum;	}
	public void setSortNum(Integer sortNum) {	    this.sortNum=sortNum;	}
	public String getTip() {	    return this.tip;	}
	public void setTip(String tip) {	    this.tip=tip;	}
	public Integer getStatus() {	    return this.status;	}
	public void setStatus(Integer status) {	    this.status=status;	}

}

