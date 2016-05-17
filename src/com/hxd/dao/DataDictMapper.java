package com.hxd.dao;

import java.util.List;
import com.hxd.vo.BaseVo;
import org.apache.ibatis.session.RowBounds;

import com.hxd.bean.DataDict;
/**
 * 
 * <br>
 * <b>功能：</b>DataDictMapper<br>
 */
public interface DataDictMapper {

    int insert(DataDict record);

    int insertSelective(DataDict record);

    int deleteByPrimaryKey(Integer id);

    int deleteByBatch(List<Integer> ids);

    DataDict selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(DataDict record);

    int updateByPrimaryKey(DataDict record);
    
    List<DataDict> selectListByPage(BaseVo page,RowBounds rb);
    
    int selectListCount(BaseVo page);
	
}
