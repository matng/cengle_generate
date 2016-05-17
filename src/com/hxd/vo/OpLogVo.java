package com.hxd.vo;

import java.util.List;
import java.util.Date;

/**
 * 
 * <br>
 * <b>功能：</b>OpLogBean<br>
 */
public class OpLogVo extends BaseVo{
	
	private List<String> idList;
		/*唯一ID*/	private Integer id;
	/*日志标题*/	private String title;
	/*日志内容(65500长度)*/	private String content;
	/*执行方法耗时*/	private Integer elapsed;
	/*登录IP*/	private String loginIp;
	/*操作用户ID*/	private Integer userId;
	/*登录帐号*/	private String loginName;
	/*操作时间*/	private Date opTime;
	public Integer getId() {	    return this.id;	}
	public void setId(Integer id) {	    this.id=id;	}
	public String getTitle() {	    return this.title;	}
	public void setTitle(String title) {	    this.title=title;	}
	public String getContent() {	    return this.content;	}
	public void setContent(String content) {	    this.content=content;	}
	public Integer getElapsed() {	    return this.elapsed;	}
	public void setElapsed(Integer elapsed) {	    this.elapsed=elapsed;	}
	public String getLoginIp() {	    return this.loginIp;	}
	public void setLoginIp(String loginIp) {	    this.loginIp=loginIp;	}
	public Integer getUserId() {	    return this.userId;	}
	public void setUserId(Integer userId) {	    this.userId=userId;	}
	public String getLoginName() {	    return this.loginName;	}
	public void setLoginName(String loginName) {	    this.loginName=loginName;	}
	public Date getOpTime() {	    return this.opTime;	}
	public void setOpTime(Date opTime) {	    this.opTime=opTime;	}

	public List<String> getIdList() {
		return idList;
	}

	public void setIdList(List<String> idList) {
		this.idList = idList;
	}
}

