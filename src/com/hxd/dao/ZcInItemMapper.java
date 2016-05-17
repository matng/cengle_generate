package com.hxd.dao;

import java.util.List;
import com.hxd.vo.BaseVo;
import org.apache.ibatis.session.RowBounds;

import com.hxd.bean.ZcInItem;
/**
 * 
 * <br>
 * <b>功能：</b>ZcInItemMapper<br>
 */
public interface ZcInItemMapper {

    int insert(ZcInItem record);

    int insertSelective(ZcInItem record);

    int deleteByPrimaryKey(Integer id);

    int deleteByBatch(List<Integer> ids);

    ZcInItem selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ZcInItem record);

    int updateByPrimaryKey(ZcInItem record);
    
    List<ZcInItem> selectListByPage(BaseVo page,RowBounds rb);
    
    int selectListCount(BaseVo page);
	
}
