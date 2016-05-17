package com.hxd.service;


import java.util.List;
import com.hxd.vo.BaseVo;
import org.apache.ibatis.session.RowBounds;

import com.hxd.bean.ZcCheckPlan;

/**
 * 
 * <br>
 * <b>功能：</b>ZcCheckPlanService<br>
 */
public interface ZcCheckPlanService{

    String SERVICE_NAME = "ZcCheckPlanService";
	
    int insertZcCheckPlan(ZcCheckPlan record);

    int insertZcCheckPlanSelective(ZcCheckPlan record);

    ZcCheckPlan selectZcCheckPlanByPrimaryKey(Integer id);

    int deleteZcCheckPlanByPrimaryKey(Integer id);

    int deleteZcCheckPlanByBatch(List<String> ids);

    int updateZcCheckPlanByPrimaryKeySelective(ZcCheckPlan record);

    int updateZcCheckPlanByPrimaryKey(ZcCheckPlan record);
    
    List<ZcCheckPlan> selectZcCheckPlanByPage(BaseVo page);
    
    int selectZcCheckPlanCount(BaseVo page);

}
