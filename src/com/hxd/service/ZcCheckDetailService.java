package com.hxd.service;


import java.util.List;
import com.hxd.vo.BaseVo;
import org.apache.ibatis.session.RowBounds;

import com.hxd.bean.ZcCheckDetail;

/**
 * 
 * <br>
 * <b>功能：</b>ZcCheckDetailService<br>
 */
public interface ZcCheckDetailService{

    String SERVICE_NAME = "ZcCheckDetailService";
	
    int insertZcCheckDetail(ZcCheckDetail record);

    int insertZcCheckDetailSelective(ZcCheckDetail record);

    ZcCheckDetail selectZcCheckDetailByPrimaryKey(Integer id);

    int deleteZcCheckDetailByPrimaryKey(Integer id);

    int deleteZcCheckDetailByBatch(List<String> ids);

    int updateZcCheckDetailByPrimaryKeySelective(ZcCheckDetail record);

    int updateZcCheckDetailByPrimaryKey(ZcCheckDetail record);
    
    List<ZcCheckDetail> selectZcCheckDetailByPage(BaseVo page);
    
    int selectZcCheckDetailCount(BaseVo page);

}
