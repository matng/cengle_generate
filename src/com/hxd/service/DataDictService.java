package com.hxd.service;


import java.util.List;
import com.hxd.vo.BaseVo;
import org.apache.ibatis.session.RowBounds;

import com.hxd.bean.DataDict;

/**
 * 
 * <br>
 * <b>功能：</b>DataDictService<br>
 */
public interface DataDictService{

    String SERVICE_NAME = "DataDictService";
	
    int insertDataDict(DataDict record);

    int insertDataDictSelective(DataDict record);

    DataDict selectDataDictByPrimaryKey(Integer id);

    int deleteDataDictByPrimaryKey(Integer id);

    int deleteDataDictByBatch(List<String> ids);

    int updateDataDictByPrimaryKeySelective(DataDict record);

    int updateDataDictByPrimaryKey(DataDict record);
    
    List<DataDict> selectDataDictByPage(BaseVo page);
    
    int selectDataDictCount(BaseVo page);

}
