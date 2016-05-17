package com.hxd.bean;



/**
 * 
 * <br>
 * <b>功能：</b>CompanyDeptBean<br>
 */
public class CompanyDept {
	
		/*唯一ID*/	private Integer id;
	/*父ID(为0是根)*/	private Integer pid;
	/*部门名称*/	private String deptName;
	/*部门负责人*/	private String deptLeader;
	/*联系电话*/	private String phone;
	/*排序号(0-9999)*/	private Integer sortNum;
	/*备注*/	private String tip;
	/*状态(禁用，生效)*/	private Integer status;
	public Integer getId() {	    return this.id;	}
	public void setId(Integer id) {	    this.id=id;	}
	public Integer getPid() {	    return this.pid;	}
	public void setPid(Integer pid) {	    this.pid=pid;	}
	public String getDeptName() {	    return this.deptName;	}
	public void setDeptName(String deptName) {	    this.deptName=deptName;	}
	public String getDeptLeader() {	    return this.deptLeader;	}
	public void setDeptLeader(String deptLeader) {	    this.deptLeader=deptLeader;	}
	public String getPhone() {	    return this.phone;	}
	public void setPhone(String phone) {	    this.phone=phone;	}
	public Integer getSortNum() {	    return this.sortNum;	}
	public void setSortNum(Integer sortNum) {	    this.sortNum=sortNum;	}
	public String getTip() {	    return this.tip;	}
	public void setTip(String tip) {	    this.tip=tip;	}
	public Integer getStatus() {	    return this.status;	}
	public void setStatus(Integer status) {	    this.status=status;	}

}

