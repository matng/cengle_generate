package com.hxd.dao;

import java.util.List;
import com.hxd.vo.BaseVo;
import org.apache.ibatis.session.RowBounds;

import com.hxd.bean.CompanyDept;
/**
 * 
 * <br>
 * <b>功能：</b>CompanyDeptMapper<br>
 */
public interface CompanyDeptMapper {

    int insert(CompanyDept record);

    int insertSelective(CompanyDept record);

    int deleteByPrimaryKey(Integer id);

    int deleteByBatch(List<Integer> ids);

    CompanyDept selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CompanyDept record);

    int updateByPrimaryKey(CompanyDept record);
    
    List<CompanyDept> selectListByPage(BaseVo page,RowBounds rb);
    
    int selectListCount(BaseVo page);
	
}
