package com.hxd.dao;

import java.util.List;
import com.hxd.vo.BaseVo;
import org.apache.ibatis.session.RowBounds;

import com.hxd.bean.ZcInDetail;
/**
 * 
 * <br>
 * <b>功能：</b>ZcInDetailMapper<br>
 */
public interface ZcInDetailMapper {

    int insert(ZcInDetail record);

    int insertSelective(ZcInDetail record);

    int deleteByPrimaryKey(Integer id);

    int deleteByBatch(List<Integer> ids);

    ZcInDetail selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ZcInDetail record);

    int updateByPrimaryKey(ZcInDetail record);
    
    List<ZcInDetail> selectListByPage(BaseVo page,RowBounds rb);
    
    int selectListCount(BaseVo page);
	
}
