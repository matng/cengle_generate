package com.hxd.dao;

import java.util.List;
import com.hxd.vo.BaseVo;
import org.apache.ibatis.session.RowBounds;

import com.hxd.bean.Role;
/**
 * 
 * <br>
 * <b>功能：</b>RoleMapper<br>
 */
public interface RoleMapper {

    int insert(Role record);

    int insertSelective(Role record);

    int deleteByPrimaryKey(Integer id);

    int deleteByBatch(List<Integer> ids);

    Role selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Role record);

    int updateByPrimaryKey(Role record);
    
    List<Role> selectListByPage(BaseVo page,RowBounds rb);
    
    int selectListCount(BaseVo page);
	
}
