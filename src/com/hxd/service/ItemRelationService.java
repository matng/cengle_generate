package com.hxd.service;


import java.util.List;
import com.hxd.vo.BaseVo;
import org.apache.ibatis.session.RowBounds;

import com.hxd.bean.ItemRelation;

/**
 * 
 * <br>
 * <b>功能：</b>ItemRelationService<br>
 */
public interface ItemRelationService{

    String SERVICE_NAME = "ItemRelationService";
	
    int insertItemRelation(ItemRelation record);

    int insertItemRelationSelective(ItemRelation record);

    ItemRelation selectItemRelationByPrimaryKey(Integer id);

    int deleteItemRelationByPrimaryKey(Integer id);

    int deleteItemRelationByBatch(List<String> ids);

    int updateItemRelationByPrimaryKeySelective(ItemRelation record);

    int updateItemRelationByPrimaryKey(ItemRelation record);
    
    List<ItemRelation> selectItemRelationByPage(BaseVo page);
    
    int selectItemRelationCount(BaseVo page);

}
