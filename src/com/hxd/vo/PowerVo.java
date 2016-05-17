package com.hxd.vo;

import java.util.List;

/**
 * 
 * <br>
 * <b>功能：</b>PowerBean<br>
 */
public class PowerVo extends BaseVo{
	
	private List<String> idList;
		/**/	private Integer id;
	/*权限拥有者(用户user ，角色role),可以分配到角色或个人*/	private String owner;
	/*权限拥有者唯一ID*/	private Integer ownerId;
	/*可以访问的资源(模块module,菜单menu,按钮btn)*/	private String resource;
	/*资源唯一ID*/	private Integer resourceId;
	/*状态(禁用，生效)*/	private Integer status;
	public Integer getId() {	    return this.id;	}
	public void setId(Integer id) {	    this.id=id;	}
	public String getOwner() {	    return this.owner;	}
	public void setOwner(String owner) {	    this.owner=owner;	}
	public Integer getOwnerId() {	    return this.ownerId;	}
	public void setOwnerId(Integer ownerId) {	    this.ownerId=ownerId;	}
	public String getResource() {	    return this.resource;	}
	public void setResource(String resource) {	    this.resource=resource;	}
	public Integer getResourceId() {	    return this.resourceId;	}
	public void setResourceId(Integer resourceId) {	    this.resourceId=resourceId;	}
	public Integer getStatus() {	    return this.status;	}
	public void setStatus(Integer status) {	    this.status=status;	}

	public List<String> getIdList() {
		return idList;
	}

	public void setIdList(List<String> idList) {
		this.idList = idList;
	}
}

