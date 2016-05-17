package com.hxd.dao;

import java.util.List;
import com.hxd.vo.BaseVo;
import org.apache.ibatis.session.RowBounds;

import com.hxd.bean.Power;
/**
 * 
 * <br>
 * <b>功能：</b>PowerMapper<br>
 */
public interface PowerMapper {

    int insert(Power record);

    int insertSelective(Power record);

    int deleteByPrimaryKey(Integer id);

    int deleteByBatch(List<Integer> ids);

    Power selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Power record);

    int updateByPrimaryKey(Power record);
    
    List<Power> selectListByPage(BaseVo page,RowBounds rb);
    
    int selectListCount(BaseVo page);
	
}
