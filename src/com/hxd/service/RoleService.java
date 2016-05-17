package com.hxd.service;


import java.util.List;
import com.hxd.vo.BaseVo;
import org.apache.ibatis.session.RowBounds;

import com.hxd.bean.Role;

/**
 * 
 * <br>
 * <b>功能：</b>RoleService<br>
 */
public interface RoleService{

    String SERVICE_NAME = "RoleService";
	
    int insertRole(Role record);

    int insertRoleSelective(Role record);

    Role selectRoleByPrimaryKey(Integer id);

    int deleteRoleByPrimaryKey(Integer id);

    int deleteRoleByBatch(List<String> ids);

    int updateRoleByPrimaryKeySelective(Role record);

    int updateRoleByPrimaryKey(Role record);
    
    List<Role> selectRoleByPage(BaseVo page);
    
    int selectRoleCount(BaseVo page);

}
