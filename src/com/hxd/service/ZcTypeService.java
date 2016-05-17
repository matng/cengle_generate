package com.hxd.service;


import java.util.List;
import com.hxd.vo.BaseVo;
import org.apache.ibatis.session.RowBounds;

import com.hxd.bean.ZcType;

/**
 * 
 * <br>
 * <b>功能：</b>ZcTypeService<br>
 */
public interface ZcTypeService{

    String SERVICE_NAME = "ZcTypeService";
	
    int insertZcType(ZcType record);

    int insertZcTypeSelective(ZcType record);

    ZcType selectZcTypeByPrimaryKey(Integer id);

    int deleteZcTypeByPrimaryKey(Integer id);

    int deleteZcTypeByBatch(List<String> ids);

    int updateZcTypeByPrimaryKeySelective(ZcType record);

    int updateZcTypeByPrimaryKey(ZcType record);
    
    List<ZcType> selectZcTypeByPage(BaseVo page);
    
    int selectZcTypeCount(BaseVo page);

}
