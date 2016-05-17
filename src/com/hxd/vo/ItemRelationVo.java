package com.hxd.vo;

import java.util.List;

/**
 * 
 * <br>
 * <b>功能：</b>ItemRelationBean<br>
 */
public class ItemRelationVo extends BaseVo{
	
	private List<String> idList;
		/**/	private Integer id;
	/*资产台账表单唯一ID(主要关联，领用表zcReceive，调拨表， 借用表，维修表，报废表)*/	private Integer relationId;
	/*关联类型(1.领用表zcReceive，2.调拨表， 3.借用表，4.维修表，5.报废表)*/	private Integer relationType;
	/*已审核入库的资产ID(关联表zcInDetail)*/	private Integer zcInDetailId;
	public Integer getId() {	    return this.id;	}
	public void setId(Integer id) {	    this.id=id;	}
	public Integer getRelationId() {	    return this.relationId;	}
	public void setRelationId(Integer relationId) {	    this.relationId=relationId;	}
	public Integer getRelationType() {	    return this.relationType;	}
	public void setRelationType(Integer relationType) {	    this.relationType=relationType;	}
	public Integer getZcInDetailId() {	    return this.zcInDetailId;	}
	public void setZcInDetailId(Integer zcInDetailId) {	    this.zcInDetailId=zcInDetailId;	}

	public List<String> getIdList() {
		return idList;
	}

	public void setIdList(List<String> idList) {
		this.idList = idList;
	}
}

