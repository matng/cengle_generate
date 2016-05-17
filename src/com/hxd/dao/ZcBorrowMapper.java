package com.hxd.dao;

import java.util.List;
import com.hxd.vo.BaseVo;
import org.apache.ibatis.session.RowBounds;

import com.hxd.bean.ZcBorrow;
/**
 * 
 * <br>
 * <b>功能：</b>ZcBorrowMapper<br>
 */
public interface ZcBorrowMapper {

    int insert(ZcBorrow record);

    int insertSelective(ZcBorrow record);

    int deleteByPrimaryKey(Integer id);

    int deleteByBatch(List<Integer> ids);

    ZcBorrow selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ZcBorrow record);

    int updateByPrimaryKey(ZcBorrow record);
    
    List<ZcBorrow> selectListByPage(BaseVo page,RowBounds rb);
    
    int selectListCount(BaseVo page);
	
}
