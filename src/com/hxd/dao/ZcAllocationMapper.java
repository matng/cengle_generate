package com.hxd.dao;

import java.util.List;
import com.hxd.vo.BaseVo;
import org.apache.ibatis.session.RowBounds;

import com.hxd.bean.ZcAllocation;
/**
 * 
 * <br>
 * <b>功能：</b>ZcAllocationMapper<br>
 */
public interface ZcAllocationMapper {

    int insert(ZcAllocation record);

    int insertSelective(ZcAllocation record);

    int deleteByPrimaryKey(Integer id);

    int deleteByBatch(List<Integer> ids);

    ZcAllocation selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ZcAllocation record);

    int updateByPrimaryKey(ZcAllocation record);
    
    List<ZcAllocation> selectListByPage(BaseVo page,RowBounds rb);
    
    int selectListCount(BaseVo page);
	
}
