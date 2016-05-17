package com.hxd.vo;

import java.util.List;

/**
 * 
 * <br>
 * <b>功能：</b>LocationBean<br>
 */
public class LocationVo extends BaseVo{
	
	private List<String> idList;
		/**/	private Integer id;
	/**/	private Integer deptId;
	/*存放地点编号*/	private String locSN;
	/*地点名称*/	private String locName;
	/*备注*/	private String tip;
	/*状态*/	private Integer status;
	public Integer getId() {	    return this.id;	}
	public void setId(Integer id) {	    this.id=id;	}
	public Integer getDeptId() {	    return this.deptId;	}
	public void setDeptId(Integer deptId) {	    this.deptId=deptId;	}
	public String getLocSN() {	    return this.locSN;	}
	public void setLocSN(String locSN) {	    this.locSN=locSN;	}
	public String getLocName() {	    return this.locName;	}
	public void setLocName(String locName) {	    this.locName=locName;	}
	public String getTip() {	    return this.tip;	}
	public void setTip(String tip) {	    this.tip=tip;	}
	public Integer getStatus() {	    return this.status;	}
	public void setStatus(Integer status) {	    this.status=status;	}

	public List<String> getIdList() {
		return idList;
	}

	public void setIdList(List<String> idList) {
		this.idList = idList;
	}
}

