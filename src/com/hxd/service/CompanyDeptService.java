package com.hxd.service;


import java.util.List;
import com.hxd.vo.BaseVo;
import org.apache.ibatis.session.RowBounds;

import com.hxd.bean.CompanyDept;

/**
 * 
 * <br>
 * <b>功能：</b>CompanyDeptService<br>
 */
public interface CompanyDeptService{

    String SERVICE_NAME = "CompanyDeptService";
	
    int insertCompanyDept(CompanyDept record);

    int insertCompanyDeptSelective(CompanyDept record);

    CompanyDept selectCompanyDeptByPrimaryKey(Integer id);

    int deleteCompanyDeptByPrimaryKey(Integer id);

    int deleteCompanyDeptByBatch(List<String> ids);

    int updateCompanyDeptByPrimaryKeySelective(CompanyDept record);

    int updateCompanyDeptByPrimaryKey(CompanyDept record);
    
    List<CompanyDept> selectCompanyDeptByPage(BaseVo page);
    
    int selectCompanyDeptCount(BaseVo page);

}
