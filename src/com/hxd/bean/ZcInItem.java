package com.hxd.bean;

import java.math.BigDecimal;


/**
 * 
 * <br>
 * <b>功能：</b>ZcInItemBean<br>
 */
public class ZcInItem {
	
		/*入库类目唯一ID*/	private Integer id;
	/*资产入库单唯一ID*/	private Integer zcInId;
	/*所添加的资产唯一ID*/	private Integer zcId;
	/*单价*/	private BigDecimal unitPrice;
	/*入库数量*/	private Integer amount;
	public Integer getId() {	    return this.id;	}
	public void setId(Integer id) {	    this.id=id;	}
	public Integer getZcInId() {	    return this.zcInId;	}
	public void setZcInId(Integer zcInId) {	    this.zcInId=zcInId;	}
	public Integer getZcId() {	    return this.zcId;	}
	public void setZcId(Integer zcId) {	    this.zcId=zcId;	}
	public BigDecimal getUnitPrice() {	    return this.unitPrice;	}
	public void setUnitPrice(BigDecimal unitPrice) {	    this.unitPrice=unitPrice;	}
	public Integer getAmount() {	    return this.amount;	}
	public void setAmount(Integer amount) {	    this.amount=amount;	}

}

