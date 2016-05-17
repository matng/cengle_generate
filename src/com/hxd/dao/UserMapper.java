package com.hxd.dao;

import java.util.List;
import com.hxd.vo.BaseVo;
import org.apache.ibatis.session.RowBounds;

import com.hxd.bean.User;
/**
 * 
 * <br>
 * <b>功能：</b>UserMapper<br>
 */
public interface UserMapper {

    int insert(User record);

    int insertSelective(User record);

    int deleteByPrimaryKey(Integer id);

    int deleteByBatch(List<Integer> ids);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
    
    List<User> selectListByPage(BaseVo page,RowBounds rb);
    
    int selectListCount(BaseVo page);
	
}
