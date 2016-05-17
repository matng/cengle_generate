package com.hxd.service;


import java.util.List;
import com.hxd.vo.BaseVo;
import org.apache.ibatis.session.RowBounds;

import com.hxd.bean.ZcRepair;

/**
 * 
 * <br>
 * <b>功能：</b>ZcRepairService<br>
 */
public interface ZcRepairService{

    String SERVICE_NAME = "ZcRepairService";
	
    int insertZcRepair(ZcRepair record);

    int insertZcRepairSelective(ZcRepair record);

    ZcRepair selectZcRepairByPrimaryKey(Integer id);

    int deleteZcRepairByPrimaryKey(Integer id);

    int deleteZcRepairByBatch(List<String> ids);

    int updateZcRepairByPrimaryKeySelective(ZcRepair record);

    int updateZcRepairByPrimaryKey(ZcRepair record);
    
    List<ZcRepair> selectZcRepairByPage(BaseVo page);
    
    int selectZcRepairCount(BaseVo page);

}
