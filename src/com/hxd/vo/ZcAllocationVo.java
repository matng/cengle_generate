package com.hxd.vo;

import java.util.List;
import java.util.Date;

/**
 * 
 * <br>
 * <b>功能：</b>ZcAllocationBean<br>
 */
public class ZcAllocationVo extends BaseVo{
	
	private List<String> idList;
		/**/	private Integer id;
	/*调出部门id*/	private Integer outDeptId;
	/*调入部门ID*/	private Integer inDeptId;
	/*监管部门id*/	private Integer checkDeptID;
	/*调拨说明*/	private String tip;
	/*创建日期*/	private Date addTime;
	/*填单人*/	private Integer addByUid;
	public Integer getId() {	    return this.id;	}
	public void setId(Integer id) {	    this.id=id;	}
	public Integer getOutDeptId() {	    return this.outDeptId;	}
	public void setOutDeptId(Integer outDeptId) {	    this.outDeptId=outDeptId;	}
	public Integer getInDeptId() {	    return this.inDeptId;	}
	public void setInDeptId(Integer inDeptId) {	    this.inDeptId=inDeptId;	}
	public Integer getCheckDeptID() {	    return this.checkDeptID;	}
	public void setCheckDeptID(Integer checkDeptID) {	    this.checkDeptID=checkDeptID;	}
	public String getTip() {	    return this.tip;	}
	public void setTip(String tip) {	    this.tip=tip;	}
	public Date getAddTime() {	    return this.addTime;	}
	public void setAddTime(Date addTime) {	    this.addTime=addTime;	}
	public Integer getAddByUid() {	    return this.addByUid;	}
	public void setAddByUid(Integer addByUid) {	    this.addByUid=addByUid;	}

	public List<String> getIdList() {
		return idList;
	}

	public void setIdList(List<String> idList) {
		this.idList = idList;
	}
}

