package com.hxd.dao;

import java.util.List;
import com.hxd.vo.BaseVo;
import org.apache.ibatis.session.RowBounds;

import com.hxd.bean.Location;
/**
 * 
 * <br>
 * <b>功能：</b>LocationMapper<br>
 */
public interface LocationMapper {

    int insert(Location record);

    int insertSelective(Location record);

    int deleteByPrimaryKey(Integer id);

    int deleteByBatch(List<Integer> ids);

    Location selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Location record);

    int updateByPrimaryKey(Location record);
    
    List<Location> selectListByPage(BaseVo page,RowBounds rb);
    
    int selectListCount(BaseVo page);
	
}
