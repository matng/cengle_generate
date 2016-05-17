package com.hxd.dao;

import java.util.List;
import com.hxd.vo.BaseVo;
import org.apache.ibatis.session.RowBounds;

import com.hxd.bean.ZcRepair;
/**
 * 
 * <br>
 * <b>功能：</b>ZcRepairMapper<br>
 */
public interface ZcRepairMapper {

    int insert(ZcRepair record);

    int insertSelective(ZcRepair record);

    int deleteByPrimaryKey(Integer id);

    int deleteByBatch(List<Integer> ids);

    ZcRepair selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ZcRepair record);

    int updateByPrimaryKey(ZcRepair record);
    
    List<ZcRepair> selectListByPage(BaseVo page,RowBounds rb);
    
    int selectListCount(BaseVo page);
	
}
