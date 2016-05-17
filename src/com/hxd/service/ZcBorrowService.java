package com.hxd.service;


import java.util.List;
import com.hxd.vo.BaseVo;
import org.apache.ibatis.session.RowBounds;

import com.hxd.bean.ZcBorrow;

/**
 * 
 * <br>
 * <b>功能：</b>ZcBorrowService<br>
 */
public interface ZcBorrowService{

    String SERVICE_NAME = "ZcBorrowService";
	
    int insertZcBorrow(ZcBorrow record);

    int insertZcBorrowSelective(ZcBorrow record);

    ZcBorrow selectZcBorrowByPrimaryKey(Integer id);

    int deleteZcBorrowByPrimaryKey(Integer id);

    int deleteZcBorrowByBatch(List<String> ids);

    int updateZcBorrowByPrimaryKeySelective(ZcBorrow record);

    int updateZcBorrowByPrimaryKey(ZcBorrow record);
    
    List<ZcBorrow> selectZcBorrowByPage(BaseVo page);
    
    int selectZcBorrowCount(BaseVo page);

}
