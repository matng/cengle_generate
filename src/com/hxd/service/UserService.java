package com.hxd.service;


import java.util.List;
import com.hxd.vo.BaseVo;
import org.apache.ibatis.session.RowBounds;

import com.hxd.bean.User;

/**
 * 
 * <br>
 * <b>功能：</b>UserService<br>
 */
public interface UserService{

    String SERVICE_NAME = "UserService";
	
    int insertUser(User record);

    int insertUserSelective(User record);

    User selectUserByPrimaryKey(Integer id);

    int deleteUserByPrimaryKey(Integer id);

    int deleteUserByBatch(List<String> ids);

    int updateUserByPrimaryKeySelective(User record);

    int updateUserByPrimaryKey(User record);
    
    List<User> selectUserByPage(BaseVo page);
    
    int selectUserCount(BaseVo page);

}
