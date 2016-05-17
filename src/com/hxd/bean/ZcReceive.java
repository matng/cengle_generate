package com.hxd.bean;

import java.util.Date;


/**
 * 
 * <br>
 * <b>功能：</b>ZcReceiveBean<br>
 */
public class ZcReceive {
	
		/**/	private Integer id;
	/*领用标题*/	private String title;
	/*申请部门*/	private Integer receiveDeptId;
	/*紧急程度*/	private String urgency;
	/*数量*/	private Integer amount;
	/*用途说明*/	private String tip;
	/*申请时间*/	private Date addtime;
	/*申请人*/	private Integer addByUid;
	public Integer getId() {	    return this.id;	}
	public void setId(Integer id) {	    this.id=id;	}
	public String getTitle() {	    return this.title;	}
	public void setTitle(String title) {	    this.title=title;	}
	public Integer getReceiveDeptId() {	    return this.receiveDeptId;	}
	public void setReceiveDeptId(Integer receiveDeptId) {	    this.receiveDeptId=receiveDeptId;	}
	public String getUrgency() {	    return this.urgency;	}
	public void setUrgency(String urgency) {	    this.urgency=urgency;	}
	public Integer getAmount() {	    return this.amount;	}
	public void setAmount(Integer amount) {	    this.amount=amount;	}
	public String getTip() {	    return this.tip;	}
	public void setTip(String tip) {	    this.tip=tip;	}
	public Date getAddtime() {	    return this.addtime;	}
	public void setAddtime(Date addtime) {	    this.addtime=addtime;	}
	public Integer getAddByUid() {	    return this.addByUid;	}
	public void setAddByUid(Integer addByUid) {	    this.addByUid=addByUid;	}

}

