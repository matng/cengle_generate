package com.hxd.vo;

import java.util.List;
import java.util.Date;

/**
 * 
 * <br>
 * <b>功能：</b>ZcInBean<br>
 */
public class ZcInVo extends BaseVo{
	
	private List<String> idList;
		/**/	private Integer id;
	/*入库单号*/	private String rukuSN;
	/*存放地点ID*/	private Integer locatId;
	/*其它属性*/	private Object extendInfo;
	/*填单时间*/	private Date addtime;
	/*填单人*/	private Integer addByUid;
	public Integer getId() {	    return this.id;	}
	public void setId(Integer id) {	    this.id=id;	}
	public String getRukuSN() {	    return this.rukuSN;	}
	public void setRukuSN(String rukuSN) {	    this.rukuSN=rukuSN;	}
	public Integer getLocatId() {	    return this.locatId;	}
	public void setLocatId(Integer locatId) {	    this.locatId=locatId;	}
	public Object getExtendInfo() {	    return this.extendInfo;	}
	public void setExtendInfo(Object extendInfo) {	    this.extendInfo=extendInfo;	}
	public Date getAddtime() {	    return this.addtime;	}
	public void setAddtime(Date addtime) {	    this.addtime=addtime;	}
	public Integer getAddByUid() {	    return this.addByUid;	}
	public void setAddByUid(Integer addByUid) {	    this.addByUid=addByUid;	}

	public List<String> getIdList() {
		return idList;
	}

	public void setIdList(List<String> idList) {
		this.idList = idList;
	}
}

