package com.hxd.vo;

import java.util.List;

/**
 * 
 * <br>
 * <b>功能：</b>UserBean<br>
 */
public class UserVo extends BaseVo{
	
	private List<String> idList;
		/**/	private Integer id;
	/*帐号*/	private String loginName;
	/*密码*/	private String psw;
	/*中文名*/	private String realName;
	/*姓别(0未知, 1男, 2女)*/	private Integer gender;
	/*手机号码*/	private String mobile;
	/*电子email*/	private String email;
	/*所属的部门ID*/	private Integer deptId;
	/*角色ID*/	private Integer roleId;
	/*状态（禁用，生效）*/	private Integer status;
	public Integer getId() {	    return this.id;	}
	public void setId(Integer id) {	    this.id=id;	}
	public String getLoginName() {	    return this.loginName;	}
	public void setLoginName(String loginName) {	    this.loginName=loginName;	}
	public String getPsw() {	    return this.psw;	}
	public void setPsw(String psw) {	    this.psw=psw;	}
	public String getRealName() {	    return this.realName;	}
	public void setRealName(String realName) {	    this.realName=realName;	}
	public Integer getGender() {	    return this.gender;	}
	public void setGender(Integer gender) {	    this.gender=gender;	}
	public String getMobile() {	    return this.mobile;	}
	public void setMobile(String mobile) {	    this.mobile=mobile;	}
	public String getEmail() {	    return this.email;	}
	public void setEmail(String email) {	    this.email=email;	}
	public Integer getDeptId() {	    return this.deptId;	}
	public void setDeptId(Integer deptId) {	    this.deptId=deptId;	}
	public Integer getRoleId() {	    return this.roleId;	}
	public void setRoleId(Integer roleId) {	    this.roleId=roleId;	}
	public Integer getStatus() {	    return this.status;	}
	public void setStatus(Integer status) {	    this.status=status;	}

	public List<String> getIdList() {
		return idList;
	}

	public void setIdList(List<String> idList) {
		this.idList = idList;
	}
}

