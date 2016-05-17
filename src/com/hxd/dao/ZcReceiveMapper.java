package com.hxd.dao;

import java.util.List;
import com.hxd.vo.BaseVo;
import org.apache.ibatis.session.RowBounds;

import com.hxd.bean.ZcReceive;
/**
 * 
 * <br>
 * <b>功能：</b>ZcReceiveMapper<br>
 */
public interface ZcReceiveMapper {

    int insert(ZcReceive record);

    int insertSelective(ZcReceive record);

    int deleteByPrimaryKey(Integer id);

    int deleteByBatch(List<Integer> ids);

    ZcReceive selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ZcReceive record);

    int updateByPrimaryKey(ZcReceive record);
    
    List<ZcReceive> selectListByPage(BaseVo page,RowBounds rb);
    
    int selectListCount(BaseVo page);
	
}
