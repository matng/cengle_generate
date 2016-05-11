package com.hxd.vo;

import java.util.Date;
import java.math.BigDecimal;

/**
 * 
 * <br>
 * <b>功能：</b>RentBean<br>
 */
public class RentVo {
	
		/*主键ID*/	private Integer id;
	/*借出时间*/	private Date startDate;
	/*预计归还时间*/	private Date expectDate;
	/*实际归还时间*/	private Date actualDate;
	/*超期天数*/	private BigDecimal overdue;
	/*预计租车金额*/	private BigDecimal expectRental;
	/*实际租车金额*/	private BigDecimal actualRental;
	/*租借部门*/	private String rentDept;
	/*租借人*/	private String rentPersoRn;
	/*挂靠项目*/	private String project;
	/*状态ID(1 正常；0 删除)*/	private Integer sId;
	public Integer getId() {	    return this.id;	}
	public void setId(Integer id) {	    this.id=id;	}
	public Date getStartDate() {	    return this.startDate;	}
	public void setStartDate(Date startDate) {	    this.startDate=startDate;	}
	public Date getExpectDate() {	    return this.expectDate;	}
	public void setExpectDate(Date expectDate) {	    this.expectDate=expectDate;	}
	public Date getActualDate() {	    return this.actualDate;	}
	public void setActualDate(Date actualDate) {	    this.actualDate=actualDate;	}
	public BigDecimal getOverdue() {	    return this.overdue;	}
	public void setOverdue(BigDecimal overdue) {	    this.overdue=overdue;	}
	public BigDecimal getExpectRental() {	    return this.expectRental;	}
	public void setExpectRental(BigDecimal expectRental) {	    this.expectRental=expectRental;	}
	public BigDecimal getActualRental() {	    return this.actualRental;	}
	public void setActualRental(BigDecimal actualRental) {	    this.actualRental=actualRental;	}
	public String getRentDept() {	    return this.rentDept;	}
	public void setRentDept(String rentDept) {	    this.rentDept=rentDept;	}
	public String getRentPersoRn() {	    return this.rentPersoRn;	}
	public void setRentPersoRn(String rentPersoRn) {	    this.rentPersoRn=rentPersoRn;	}
	public String getProject() {	    return this.project;	}
	public void setProject(String project) {	    this.project=project;	}
	public Integer getSId() {	    return this.sId;	}
	public void setSId(Integer sId) {	    this.sId=sId;	}

}

