package com.hxd.dao;

import java.util.List;
import com.hxd.vo.BaseVo;
import org.apache.ibatis.session.RowBounds;

import com.hxd.bean.OpLog;
/**
 * 
 * <br>
 * <b>功能：</b>OpLogMapper<br>
 */
public interface OpLogMapper {

    int insert(OpLog record);

    int insertSelective(OpLog record);

    int deleteByPrimaryKey(Integer id);

    int deleteByBatch(List<Integer> ids);

    OpLog selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(OpLog record);

    int updateByPrimaryKey(OpLog record);
    
    List<OpLog> selectListByPage(BaseVo page,RowBounds rb);
    
    int selectListCount(BaseVo page);
	
}
