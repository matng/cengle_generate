package com.hxd.bean;



/**
 * 
 * <br>
 * <b>功能：</b>RoleBean<br>
 */
public class Role {
	
		/*唯一id*/	private Integer id;
	/*角色名称*/	private String roleName;
	/*描述*/	private String roleDesc;
	/*状态(禁用，生效)*/	private Integer status;
	public Integer getId() {	    return this.id;	}
	public void setId(Integer id) {	    this.id=id;	}
	public String getRoleName() {	    return this.roleName;	}
	public void setRoleName(String roleName) {	    this.roleName=roleName;	}
	public String getRoleDesc() {	    return this.roleDesc;	}
	public void setRoleDesc(String roleDesc) {	    this.roleDesc=roleDesc;	}
	public Integer getStatus() {	    return this.status;	}
	public void setStatus(Integer status) {	    this.status=status;	}

}

