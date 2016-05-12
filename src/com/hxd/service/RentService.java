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

    int updateRentByPrimaryKeySelective(Rent record);

    int updateRentByPrimaryKey(Rent record);
    
    List<Rent> queryRentByPage(BaseVo page);
    
    int queryRentCount(BaseVo page);

}
