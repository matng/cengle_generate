package com.hxd.service;


import java.util.List;
import com.hxd.vo.BaseVo;
import org.apache.ibatis.session.RowBounds;

import com.hxd.bean.ZcInItem;

/**
 * 
 * <br>
 * <b>功能：</b>ZcInItemService<br>
 */
public interface ZcInItemService{

    String SERVICE_NAME = "ZcInItemService";
	
    int insertZcInItem(ZcInItem record);

    int insertZcInItemSelective(ZcInItem record);

    ZcInItem selectZcInItemByPrimaryKey(Integer id);

    int deleteZcInItemByPrimaryKey(Integer id);

    int deleteZcInItemByBatch(List<String> ids);

    int updateZcInItemByPrimaryKeySelective(ZcInItem record);

    int updateZcInItemByPrimaryKey(ZcInItem record);
    
    List<ZcInItem> selectZcInItemByPage(BaseVo page);
    
    int selectZcInItemCount(BaseVo page);

}
