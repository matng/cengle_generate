package com.hxd.bean;

import java.util.Date;


/**
 * 
 * <br>
 * <b>功能：</b>CarInfoBean<br>
 */
public class CarInfo {
	
		/*主键ID*/	private Integer id;
	/*租借ID*/	private Integer rentId;
	/*车牌*/	private String plateNum;
	/*品牌*/	private String brand;
	/*车型*/	private String model;
	/*状态（1 闲置；2 预约  3  借出；4  维修；5  报废）*/	private Integer status;
	/*图片地址*/	private String imgUrl;
	/*状态ID（1 正常；0 删除）*/	private Integer sId;
	/*创建日期*/	private Date createDate;
	/*删除日期*/	private Date delDate;
	/*排序ID*/	private Integer orderId;
	public Integer getId() {	    return this.id;	}
	public void setId(Integer id) {	    this.id=id;	}
	public Integer getRentId() {	    return this.rentId;	}
	public void setRentId(Integer rentId) {	    this.rentId=rentId;	}
	public String getPlateNum() {	    return this.plateNum;	}
	public void setPlateNum(String plateNum) {	    this.plateNum=plateNum;	}
	public String getBrand() {	    return this.brand;	}
	public void setBrand(String brand) {	    this.brand=brand;	}
	public String getModel() {	    return this.model;	}
	public void setModel(String model) {	    this.model=model;	}
	public Integer getStatus() {	    return this.status;	}
	public void setStatus(Integer status) {	    this.status=status;	}
	public String getImgUrl() {	    return this.imgUrl;	}
	public void setImgUrl(String imgUrl) {	    this.imgUrl=imgUrl;	}
	public Integer getSId() {	    return this.sId;	}
	public void setSId(Integer sId) {	    this.sId=sId;	}
	public Date getCreateDate() {	    return this.createDate;	}
	public void setCreateDate(Date createDate) {	    this.createDate=createDate;	}
	public Date getDelDate() {	    return this.delDate;	}
	public void setDelDate(Date delDate) {	    this.delDate=delDate;	}
	public Integer getOrderId() {	    return this.orderId;	}
	public void setOrderId(Integer orderId) {	    this.orderId=orderId;	}

}

