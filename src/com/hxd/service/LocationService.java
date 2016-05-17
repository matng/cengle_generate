package com.hxd.service;


import java.util.List;
import com.hxd.vo.BaseVo;
import org.apache.ibatis.session.RowBounds;

import com.hxd.bean.Location;

/**
 * 
 * <br>
 * <b>功能：</b>LocationService<br>
 */
public interface LocationService{

    String SERVICE_NAME = "LocationService";
	
    int insertLocation(Location record);

    int insertLocationSelective(Location record);

    Location selectLocationByPrimaryKey(Integer id);

    int deleteLocationByPrimaryKey(Integer id);

    int deleteLocationByBatch(List<String> ids);

    int updateLocationByPrimaryKeySelective(Location record);

    int updateLocationByPrimaryKey(Location record);
    
    List<Location> selectLocationByPage(BaseVo page);
    
    int selectLocationCount(BaseVo page);

}
