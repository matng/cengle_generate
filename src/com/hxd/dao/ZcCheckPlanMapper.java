package com.hxd.dao;

import java.util.List;
import com.hxd.vo.BaseVo;
import org.apache.ibatis.session.RowBounds;

import com.hxd.bean.ZcCheckPlan;
/**
 * 
 * <br>
 * <b>功能：</b>ZcCheckPlanMapper<br>
 */
public interface ZcCheckPlanMapper {

    int insert(ZcCheckPlan record);

    int insertSelective(ZcCheckPlan record);

    int deleteByPrimaryKey(Integer id);

    int deleteByBatch(List<Integer> ids);

    ZcCheckPlan selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ZcCheckPlan record);

    int updateByPrimaryKey(ZcCheckPlan record);
    
    List<ZcCheckPlan> selectListByPage(BaseVo page,RowBounds rb);
    
    int selectListCount(BaseVo page);
	
}
