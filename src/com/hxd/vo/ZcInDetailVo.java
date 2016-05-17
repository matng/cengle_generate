package com.hxd.vo;

import java.util.List;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 
 * <br>
 * <b>功能：</b>ZcInDetailBean<br>
 */
public class ZcInDetailVo extends BaseVo{
	
	private List<String> idList;
		/*唯一ID*/	private Integer id;
	/*资产ID*/	private Integer zcId;
	/*资产入库单ID*/	private Integer zcInId;
	/*入库存资产类目唯一ID(关联表zcInItem)*/	private Integer zcInItemId;
	/*电子标签唯一序列号*/	private String tagSN;
	/*财务导入的资产唯一标识号*/	private String cwSN;
	/*单价*/	private BigDecimal unitPrice;
	/*数量*/	private Integer amount;
	/*入库时间*/	private Date addTime;
	/*资产唯一序列号(例如宏信达财务部笔记本电脑序号为00001：HXD-CWB-BJBDN-00001 )*/	private String zcSNSerial;
	/*资产状态 (0闲置，1在用，2维修，3借用，4报废)*/	private Integer status;
	/*存放地点唯一ID*/	private Integer localId;
	/*使用部门ID*/	private Integer useDeptId;
	/*使用人的UserId*/	private Integer useUid;
	/*保修日期*/	private Date baoxiuDate;
	public Integer getId() {	    return this.id;	}
	public void setId(Integer id) {	    this.id=id;	}
	public Integer getZcId() {	    return this.zcId;	}
	public void setZcId(Integer zcId) {	    this.zcId=zcId;	}
	public Integer getZcInId() {	    return this.zcInId;	}
	public void setZcInId(Integer zcInId) {	    this.zcInId=zcInId;	}
	public Integer getZcInItemId() {	    return this.zcInItemId;	}
	public void setZcInItemId(Integer zcInItemId) {	    this.zcInItemId=zcInItemId;	}
	public String getTagSN() {	    return this.tagSN;	}
	public void setTagSN(String tagSN) {	    this.tagSN=tagSN;	}
	public String getCwSN() {	    return this.cwSN;	}
	public void setCwSN(String cwSN) {	    this.cwSN=cwSN;	}
	public BigDecimal getUnitPrice() {	    return this.unitPrice;	}
	public void setUnitPrice(BigDecimal unitPrice) {	    this.unitPrice=unitPrice;	}
	public Integer getAmount() {	    return this.amount;	}
	public void setAmount(Integer amount) {	    this.amount=amount;	}
	public Date getAddTime() {	    return this.addTime;	}
	public void setAddTime(Date addTime) {	    this.addTime=addTime;	}
	public String getZcSNSerial() {	    return this.zcSNSerial;	}
	public void setZcSNSerial(String zcSNSerial) {	    this.zcSNSerial=zcSNSerial;	}
	public Integer getStatus() {	    return this.status;	}
	public void setStatus(Integer status) {	    this.status=status;	}
	public Integer getLocalId() {	    return this.localId;	}
	public void setLocalId(Integer localId) {	    this.localId=localId;	}
	public Integer getUseDeptId() {	    return this.useDeptId;	}
	public void setUseDeptId(Integer useDeptId) {	    this.useDeptId=useDeptId;	}
	public Integer getUseUid() {	    return this.useUid;	}
	public void setUseUid(Integer useUid) {	    this.useUid=useUid;	}
	public Date getBaoxiuDate() {	    return this.baoxiuDate;	}
	public void setBaoxiuDate(Date baoxiuDate) {	    this.baoxiuDate=baoxiuDate;	}

	public List<String> getIdList() {
		return idList;
	}

	public void setIdList(List<String> idList) {
		this.idList = idList;
	}
}

