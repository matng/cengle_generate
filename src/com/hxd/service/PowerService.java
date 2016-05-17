package com.hxd.service;


import java.util.List;
import com.hxd.vo.BaseVo;
import org.apache.ibatis.session.RowBounds;

import com.hxd.bean.Power;

/**
 * 
 * <br>
 * <b>功能：</b>PowerService<br>
 */
public interface PowerService{

    String SERVICE_NAME = "PowerService";
	
    int insertPower(Power record);

    int insertPowerSelective(Power record);

    Power selectPowerByPrimaryKey(Integer id);

    int deletePowerByPrimaryKey(Integer id);

    int deletePowerByBatch(List<String> ids);

    int updatePowerByPrimaryKeySelective(Power record);

    int updatePowerByPrimaryKey(Power record);
    
    List<Power> selectPowerByPage(BaseVo page);
    
    int selectPowerCount(BaseVo page);

}
