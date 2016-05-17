package com.hxd.dao;

import java.util.List;
import com.hxd.vo.BaseVo;
import org.apache.ibatis.session.RowBounds;

import com.hxd.bean.ItemRelation;
/**
 * 
 * <br>
 * <b>功能：</b>ItemRelationMapper<br>
 */
public interface ItemRelationMapper {

    int insert(ItemRelation record);

    int insertSelective(ItemRelation record);

    int deleteByPrimaryKey(Integer id);

    int deleteByBatch(List<Integer> ids);

    ItemRelation selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ItemRelation record);

    int updateByPrimaryKey(ItemRelation record);
    
    List<ItemRelation> selectListByPage(BaseVo page,RowBounds rb);
    
    int selectListCount(BaseVo page);
	
}
