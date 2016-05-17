package com.hxd.dao;

import java.util.List;
import com.hxd.vo.BaseVo;
import org.apache.ibatis.session.RowBounds;

import com.hxd.bean.ZcCheckDetail;
/**
 * 
 * <br>
 * <b>功能：</b>ZcCheckDetailMapper<br>
 */
public interface ZcCheckDetailMapper {

    int insert(ZcCheckDetail record);

    int insertSelective(ZcCheckDetail record);

    int deleteByPrimaryKey(Integer id);

    int deleteByBatch(List<Integer> ids);

    ZcCheckDetail selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ZcCheckDetail record);

    int updateByPrimaryKey(ZcCheckDetail record);
    
    List<ZcCheckDetail> selectListByPage(BaseVo page,RowBounds rb);
    
    int selectListCount(BaseVo page);
	
}
