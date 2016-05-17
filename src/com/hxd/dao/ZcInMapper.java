package com.hxd.dao;

import java.util.List;
import com.hxd.vo.BaseVo;
import org.apache.ibatis.session.RowBounds;

import com.hxd.bean.ZcIn;
/**
 * 
 * <br>
 * <b>功能：</b>ZcInMapper<br>
 */
public interface ZcInMapper {

    int insert(ZcIn record);

    int insertSelective(ZcIn record);

    int deleteByPrimaryKey(Integer id);

    int deleteByBatch(List<Integer> ids);

    ZcIn selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ZcIn record);

    int updateByPrimaryKey(ZcIn record);
    
    List<ZcIn> selectListByPage(BaseVo page,RowBounds rb);
    
    int selectListCount(BaseVo page);
	
}
