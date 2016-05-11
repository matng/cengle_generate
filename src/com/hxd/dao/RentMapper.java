package com.hxd.dao;

import java.util.List;
import com.hxd.vo.BaseVo;
import org.apache.ibatis.session.RowBounds;

import com.hxd.bean.Rent;
/**
 * 
 * <br>
 * <b>功能：</b>RentMapper<br>
 */
public interface RentMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(Rent record);

    int insertSelective(Rent record);

    Rent selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Rent record);

    int updateByPrimaryKey(Rent record);
    
    List<Rent> queryRentListByPage(BaseVo page,RowBounds rb);
    
    int queryRentListCount(BaseVo page);
	
}
