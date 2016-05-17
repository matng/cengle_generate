package com.hxd.service;


import java.util.List;
import com.hxd.vo.BaseVo;
import org.apache.ibatis.session.RowBounds;

import com.hxd.bean.OpLog;

/**
 * 
 * <br>
 * <b>功能：</b>OpLogService<br>
 */
public interface OpLogService{

    String SERVICE_NAME = "OpLogService";
	
    int insertOpLog(OpLog record);

    int insertOpLogSelective(OpLog record);

    OpLog selectOpLogByPrimaryKey(Integer id);

    int deleteOpLogByPrimaryKey(Integer id);

    int deleteOpLogByBatch(List<String> ids);

    int updateOpLogByPrimaryKeySelective(OpLog record);

    int updateOpLogByPrimaryKey(OpLog record);
    
    List<OpLog> selectOpLogByPage(BaseVo page);
    
    int selectOpLogCount(BaseVo page);

}
