package com.hxd.dao;

import java.util.List;
import com.hxd.vo.BaseVo;
import org.apache.ibatis.session.RowBounds;

import com.hxd.bean.ZcType;
/**
 * 
 * <br>
 * <b>功能：</b>ZcTypeMapper<br>
 */
public interface ZcTypeMapper {

    int insert(ZcType record);

    int insertSelective(ZcType record);

    int deleteByPrimaryKey(Integer id);

    int deleteByBatch(List<Integer> ids);

    ZcType selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ZcType record);

    int updateByPrimaryKey(ZcType record);
    
    List<ZcType> selectListByPage(BaseVo page,RowBounds rb);
    
    int selectListCount(BaseVo page);
	
}
