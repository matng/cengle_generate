package com.hxd.service;


import java.util.List;
import com.hxd.vo.BaseVo;
import org.apache.ibatis.session.RowBounds;

import com.hxd.bean.ZcIn;

/**
 * 
 * <br>
 * <b>功能：</b>ZcInService<br>
 */
public interface ZcInService{

    String SERVICE_NAME = "ZcInService";
	
    int insertZcIn(ZcIn record);

    int insertZcInSelective(ZcIn record);

    ZcIn selectZcInByPrimaryKey(Integer id);

    int deleteZcInByPrimaryKey(Integer id);

    int deleteZcInByBatch(List<String> ids);

    int updateZcInByPrimaryKeySelective(ZcIn record);

    int updateZcInByPrimaryKey(ZcIn record);
    
    List<ZcIn> selectZcInByPage(BaseVo page);
    
    int selectZcInCount(BaseVo page);

}
