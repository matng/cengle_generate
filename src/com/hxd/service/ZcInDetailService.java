package com.hxd.service;


import java.util.List;
import com.hxd.vo.BaseVo;
import org.apache.ibatis.session.RowBounds;

import com.hxd.bean.ZcInDetail;

/**
 * 
 * <br>
 * <b>功能：</b>ZcInDetailService<br>
 */
public interface ZcInDetailService{

    String SERVICE_NAME = "ZcInDetailService";
	
    int insertZcInDetail(ZcInDetail record);

    int insertZcInDetailSelective(ZcInDetail record);

    ZcInDetail selectZcInDetailByPrimaryKey(Integer id);

    int deleteZcInDetailByPrimaryKey(Integer id);

    int deleteZcInDetailByBatch(List<String> ids);

    int updateZcInDetailByPrimaryKeySelective(ZcInDetail record);

    int updateZcInDetailByPrimaryKey(ZcInDetail record);
    
    List<ZcInDetail> selectZcInDetailByPage(BaseVo page);
    
    int selectZcInDetailCount(BaseVo page);

}
