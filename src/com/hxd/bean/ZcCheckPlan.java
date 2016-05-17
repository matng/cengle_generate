package com.hxd.bean;

import java.util.Date;


/**
 * 
 * <br>
 * <b>功能：</b>ZcCheckPlanBean<br>
 */
public class ZcCheckPlan {
	
		/**/	private Integer id;
	/*盘点单号*/	private String planNo;
	/*计划名称*/	private String planName;
	/*盘点日期*/	private Date planDate;
	/*盘点负责人的UserId*/	private Integer planByUid;
	/*备注说明*/	private String tip;
	/*创建时间*/	private Date addTime;
	/*创建人的UserId*/	private Integer addByUid;
	public Integer getId() {	    return this.id;	}
	public void setId(Integer id) {	    this.id=id;	}
	public String getPlanNo() {	    return this.planNo;	}
	public void setPlanNo(String planNo) {	    this.planNo=planNo;	}
	public String getPlanName() {	    return this.planName;	}
	public void setPlanName(String planName) {	    this.planName=planName;	}
	public Date getPlanDate() {	    return this.planDate;	}
	public void setPlanDate(Date planDate) {	    this.planDate=planDate;	}
	public Integer getPlanByUid() {	    return this.planByUid;	}
	public void setPlanByUid(Integer planByUid) {	    this.planByUid=planByUid;	}
	public String getTip() {	    return this.tip;	}
	public void setTip(String tip) {	    this.tip=tip;	}
	public Date getAddTime() {	    return this.addTime;	}
	public void setAddTime(Date addTime) {	    this.addTime=addTime;	}
	public Integer getAddByUid() {	    return this.addByUid;	}
	public void setAddByUid(Integer addByUid) {	    this.addByUid=addByUid;	}

}

