package com.hxd.bean;



/**
 * 
 * <br>
 * <b>功能：</b>DataDictBean<br>
 */
public class DataDict {
	
		/*唯 一id*/	private Integer id;
	/*父ID(为0是根)*/	private Integer pid;
	/*字典编码*/	private String dictSN;
	/*键值名称*/	private String dictName;
	/*数据属性（有多个就用json格式存储）*/	private Object attribute;
	/*排序号(0-9999)*/	private Integer sortNum;
	/*状态*/	private Integer status;
	public Integer getId() {	    return this.id;	}
	public void setId(Integer id) {	    this.id=id;	}
	public Integer getPid() {	    return this.pid;	}
	public void setPid(Integer pid) {	    this.pid=pid;	}
	public String getDictSN() {	    return this.dictSN;	}
	public void setDictSN(String dictSN) {	    this.dictSN=dictSN;	}
	public String getDictName() {	    return this.dictName;	}
	public void setDictName(String dictName) {	    this.dictName=dictName;	}
	public Object getAttribute() {	    return this.attribute;	}
	public void setAttribute(Object attribute) {	    this.attribute=attribute;	}
	public Integer getSortNum() {	    return this.sortNum;	}
	public void setSortNum(Integer sortNum) {	    this.sortNum=sortNum;	}
	public Integer getStatus() {	    return this.status;	}
	public void setStatus(Integer status) {	    this.status=status;	}

}

