package com.hxd.service;


import java.util.List;
import com.hxd.vo.BaseVo;
import org.apache.ibatis.session.RowBounds;

import com.hxd.bean.CarInfo;

/**
 * 
 * <br>
 * <b>功能：</b>CarInfoService<br>
 */
public interface CarInfoService{

	String SERVICE_NAME = "CarInfoService";
	
	int deleteCarInfoByPrimaryKey(Integer id);

    int insertCarInfoSelective(CarInfo record);

    CarInfo selectCarInfoByPrimaryKey(Integer id);

    int updateCarInfoByPrimaryKeySelective(CarInfo record);

    int updateCarInfoByPrimaryKey(CarInfo record);
    
    List<CarInfo> queryCarInfoByPage(BaseVo page);
    
    int queryCarInfoCount(BaseVo page);

}
