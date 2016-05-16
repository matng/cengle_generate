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
	
    int insertCarInfo(CarInfo record);

    int insertCarInfoSelective(CarInfo record);

    CarInfo selectCarInfoByPrimaryKey(Integer id);

    int deleteCarInfoByPrimaryKey(Integer id);

    int deleteCarInfoByBatch(List<String> ids);

    int updateCarInfoByPrimaryKeySelective(CarInfo record);

    int updateCarInfoByPrimaryKey(CarInfo record);
    
    List<CarInfo> selectCarInfoByPage(BaseVo page);
    
    int selectCarInfoCount(BaseVo page);

}
