package com.hxd.dao;

import java.util.List;
import com.hxd.vo.BaseVo;
import org.apache.ibatis.session.RowBounds;

import com.hxd.bean.Msg;
/**
 * 
 * <br>
 * <b>功能：</b>MsgMapper<br>
 */
public interface MsgMapper {

    int insert(Msg record);

    int insertSelective(Msg record);

    int deleteByPrimaryKey(Integer id);

    int deleteByBatch(List<Integer> ids);

    Msg selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Msg record);

    int updateByPrimaryKey(Msg record);
    
    List<Msg> selectListByPage(BaseVo page,RowBounds rb);
    
    int selectListCount(BaseVo page);
	
}
