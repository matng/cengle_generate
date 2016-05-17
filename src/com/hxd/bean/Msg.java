package com.hxd.bean;

import java.util.Date;


/**
 * 
 * <br>
 * <b>功能：</b>MsgBean<br>
 */
public class Msg {
	
		/*自增id*/	private Integer id;
	/*消息标题*/	private String title;
	/*消息内容*/	private String content;
	/*接收消息的用户UserId (用于接收站内消息)*/	private Integer receiveUid;
	/*接收消息的手机号码 (用于接收短信消息)*/	private String receivePhone;
	/*消息状态(0未读，1已读)*/	private Integer status;
	/*创建日期*/	private Date addTime;
	/*消息类型 (0,站内消息， 1手机短信消息,  2站内和手机消息)*/	private Integer msgType;
	public Integer getId() {	    return this.id;	}
	public void setId(Integer id) {	    this.id=id;	}
	public String getTitle() {	    return this.title;	}
	public void setTitle(String title) {	    this.title=title;	}
	public String getContent() {	    return this.content;	}
	public void setContent(String content) {	    this.content=content;	}
	public Integer getReceiveUid() {	    return this.receiveUid;	}
	public void setReceiveUid(Integer receiveUid) {	    this.receiveUid=receiveUid;	}
	public String getReceivePhone() {	    return this.receivePhone;	}
	public void setReceivePhone(String receivePhone) {	    this.receivePhone=receivePhone;	}
	public Integer getStatus() {	    return this.status;	}
	public void setStatus(Integer status) {	    this.status=status;	}
	public Date getAddTime() {	    return this.addTime;	}
	public void setAddTime(Date addTime) {	    this.addTime=addTime;	}
	public Integer getMsgType() {	    return this.msgType;	}
	public void setMsgType(Integer msgType) {	    this.msgType=msgType;	}

}

