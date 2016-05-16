package com.hxd.service;


import java.util.List;
import com.hxd.vo.BaseVo;
import org.apache.ibatis.session.RowBounds;

import com.hxd.bean.Rent;

/**
 * 
 * <br>
 * <b>功能：</b>RentService<br>
 */
public interface RentService{

    String SERVICE_NAME = "RentService";
	
    int insertRent(Rent record);

    int insertRentSelective(Rent record);

    Rent selectRentByPrimaryKey(Integer id);

    int deleteRentByPrimaryKey(Integer id);

    int deleteRentByBatch(List<String> ids);

    int updateRentByPrimaryKeySelective(Rent record);

    int updateRentByPrimaryKey(Rent record);
    
    List<Rent> selectRentByPage(BaseVo page);
    
    int selectRentCount(BaseVo page);

}
