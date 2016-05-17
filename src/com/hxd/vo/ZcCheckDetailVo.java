package com.hxd.vo;

import java.util.List;

/**
 * 
 * <br>
 * <b>功能：</b>ZcCheckDetailBean<br>
 */
public class ZcCheckDetailVo extends BaseVo{
	
	private List<String> idList;
		/**/	private Integer id;
	/*盘点计划唯一ID*/	private String planId;
	/*资产唯一ID*/	private Integer zcId;
	/*资产入库单ID*/	private Integer zcInId;
	/*入库存资产唯一ID*/	private Integer zcInDetailId;
	public Integer getId() {	    return this.id;	}
	public void setId(Integer id) {	    this.id=id;	}
	public String getPlanId() {	    return this.planId;	}
	public void setPlanId(String planId) {	    this.planId=planId;	}
	public Integer getZcId() {	    return this.zcId;	}
	public void setZcId(Integer zcId) {	    this.zcId=zcId;	}
	public Integer getZcInId() {	    return this.zcInId;	}
	public void setZcInId(Integer zcInId) {	    this.zcInId=zcInId;	}
	public Integer getZcInDetailId() {	    return this.zcInDetailId;	}
	public void setZcInDetailId(Integer zcInDetailId) {	    this.zcInDetailId=zcInDetailId;	}

	public List<String> getIdList() {
		return idList;
	}

	public void setIdList(List<String> idList) {
		this.idList = idList;
	}
}

