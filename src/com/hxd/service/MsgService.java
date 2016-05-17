package com.hxd.service;


import java.util.List;
import com.hxd.vo.BaseVo;
import org.apache.ibatis.session.RowBounds;

import com.hxd.bean.Msg;

/**
 * 
 * <br>
 * <b>功能：</b>MsgService<br>
 */
public interface MsgService{

    String SERVICE_NAME = "MsgService";
	
    int insertMsg(Msg record);

    int insertMsgSelective(Msg record);

    Msg selectMsgByPrimaryKey(Integer id);

    int deleteMsgByPrimaryKey(Integer id);

    int deleteMsgByBatch(List<String> ids);

    int updateMsgByPrimaryKeySelective(Msg record);

    int updateMsgByPrimaryKey(Msg record);
    
    List<Msg> selectMsgByPage(BaseVo page);
    
    int selectMsgCount(BaseVo page);

}
