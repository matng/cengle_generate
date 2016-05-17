package com.hxd.vo;

import java.util.List;
import java.util.Date;

/**
 * 
 * <br>
 * <b>功能：</b>ZcBorrowBean<br>
 */
public class ZcBorrowVo extends BaseVo{
	
	private List<String> idList;
		/**/	private Integer id;
	/*借用开始日期*/	private Date startDate;
	/*借用结束日期*/	private Date endDate;
	/*借用部门*/	private Integer borrowDeptId;
	/*借用人UserId*/	private Integer borrowUid;
	/*说明*/	private String tip;
	/*创建日期*/	private Date addTime;
	/*填写借用单人的userId*/	private Integer addByUid;
	public Integer getId() {	    return this.id;	}
	public void setId(Integer id) {	    this.id=id;	}
	public Date getStartDate() {	    return this.startDate;	}
	public void setStartDate(Date startDate) {	    this.startDate=startDate;	}
	public Date getEndDate() {	    return this.endDate;	}
	public void setEndDate(Date endDate) {	    this.endDate=endDate;	}
	public Integer getBorrowDeptId() {	    return this.borrowDeptId;	}
	public void setBorrowDeptId(Integer borrowDeptId) {	    this.borrowDeptId=borrowDeptId;	}
	public Integer getBorrowUid() {	    return this.borrowUid;	}
	public void setBorrowUid(Integer borrowUid) {	    this.borrowUid=borrowUid;	}
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

