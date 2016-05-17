package com.hxd.bean;

import java.util.Date;
import java.math.BigDecimal;


/**
 * 
 * <br>
 * <b>功能：</b>ZcRepairBean<br>
 */
public class ZcRepair {
	
		/**/	private Integer id;
	/*报修日期*/	private Date repairDate;
	/*报修部门ID*/	private Integer repairDeptId;
	/*维修类型*/	private String repairType;
	/*联系人*/	private String contactUser;
	/*联系电话*/	private String contactPhone;
	/*维修费用*/	private BigDecimal repairCost;
	/*故障描述*/	private String tip;
	/*填单日期*/	private Date addTime;
	/*填单人userId*/	private Integer addByUid;
	public Integer getId() {	    return this.id;	}
	public void setId(Integer id) {	    this.id=id;	}
	public Date getRepairDate() {	    return this.repairDate;	}
	public void setRepairDate(Date repairDate) {	    this.repairDate=repairDate;	}
	public Integer getRepairDeptId() {	    return this.repairDeptId;	}
	public void setRepairDeptId(Integer repairDeptId) {	    this.repairDeptId=repairDeptId;	}
	public String getRepairType() {	    return this.repairType;	}
	public void setRepairType(String repairType) {	    this.repairType=repairType;	}
	public String getContactUser() {	    return this.contactUser;	}
	public void setContactUser(String contactUser) {	    this.contactUser=contactUser;	}
	public String getContactPhone() {	    return this.contactPhone;	}
	public void setContactPhone(String contactPhone) {	    this.contactPhone=contactPhone;	}
	public BigDecimal getRepairCost() {	    return this.repairCost;	}
	public void setRepairCost(BigDecimal repairCost) {	    this.repairCost=repairCost;	}
	public String getTip() {	    return this.tip;	}
	public void setTip(String tip) {	    this.tip=tip;	}
	public Date getAddTime() {	    return this.addTime;	}
	public void setAddTime(Date addTime) {	    this.addTime=addTime;	}
	public Integer getAddByUid() {	    return this.addByUid;	}
	public void setAddByUid(Integer addByUid) {	    this.addByUid=addByUid;	}

}

