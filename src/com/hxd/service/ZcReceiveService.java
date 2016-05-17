package com.hxd.service;


import java.util.List;
import com.hxd.vo.BaseVo;
import org.apache.ibatis.session.RowBounds;

import com.hxd.bean.ZcReceive;

/**
 * 
 * <br>
 * <b>功能：</b>ZcReceiveService<br>
 */
public interface ZcReceiveService{

    String SERVICE_NAME = "ZcReceiveService";
	
    int insertZcReceive(ZcReceive record);

    int insertZcReceiveSelective(ZcReceive record);

    ZcReceive selectZcReceiveByPrimaryKey(Integer id);

    int deleteZcReceiveByPrimaryKey(Integer id);

    int deleteZcReceiveByBatch(List<String> ids);

    int updateZcReceiveByPrimaryKeySelective(ZcReceive record);

    int updateZcReceiveByPrimaryKey(ZcReceive record);
    
    List<ZcReceive> selectZcReceiveByPage(BaseVo page);
    
    int selectZcReceiveCount(BaseVo page);

}
