package com.hxd.service;


import java.util.List;
import com.hxd.vo.BaseVo;
import org.apache.ibatis.session.RowBounds;

import com.hxd.bean.ZcAllocation;

/**
 * 
 * <br>
 * <b>功能：</b>ZcAllocationService<br>
 */
public interface ZcAllocationService{

    String SERVICE_NAME = "ZcAllocationService";
	
    int insertZcAllocation(ZcAllocation record);

    int insertZcAllocationSelective(ZcAllocation record);

    ZcAllocation selectZcAllocationByPrimaryKey(Integer id);

    int deleteZcAllocationByPrimaryKey(Integer id);

    int deleteZcAllocationByBatch(List<String> ids);

    int updateZcAllocationByPrimaryKeySelective(ZcAllocation record);

    int updateZcAllocationByPrimaryKey(ZcAllocation record);
    
    List<ZcAllocation> selectZcAllocationByPage(BaseVo page);
    
    int selectZcAllocationCount(BaseVo page);

}
