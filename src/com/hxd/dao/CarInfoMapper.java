package com.hxd.dao;

import java.util.List;
import com.hxd.vo.BaseVo;
import org.apache.ibatis.session.RowBounds;

import com.hxd.bean.CarInfo;
/**
 * 
 * <br>
 * <b>功能：</b>CarInfoMapper<br>
 */
public interface CarInfoMapper {

    int insert(CarInfo record);

    int insertSelective(CarInfo record);

    int deleteByPrimaryKey(Integer id);

    int deleteByBatch(List<Integer> ids);

    CarInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CarInfo record);

    int updateByPrimaryKey(CarInfo record);
    
    List<CarInfo> selectListByPage(BaseVo page,RowBounds rb);
    
    int selectListCount(BaseVo page);
	
}
