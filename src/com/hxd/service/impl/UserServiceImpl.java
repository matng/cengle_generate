package com.hxd.service.impl;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hxd.bean.User;
import com.hxd.dao.UserMapper;
import com.hxd.service.UserService;
import com.hxd.vo.BaseVo;

/**
 * 
 * <br>
 * <b>功能：</b>UserService<br>
 */
	
@Transactional(rollbackFor = Exception.class)
@Service(UserService.SERVICE_NAME)
public class UserServiceImpl implements UserService {

	@Autowired
	UserMapper UserDao;
	
	private Log log = LogFactory.getLog(UserServiceImpl.class);
	
	

	public int insertUser(User record) {
		// TODO Auto-generated method stub
		try {
			return UserDao.insert(record);
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			log.error(e);
			log.info("UserServiceImpl insertUser failed!");
		}
		return -1;
	}

	public int insertUserSelective(User record) {
		try {
			return UserDao.insertSelective(record);
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			log.error(e);
			log.info("UserServiceImpl insertUserSelective failed!");
		}
		// TODO Auto-generated method stub
		return -1;
	}

	public int deleteUserByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		try {
			return UserDao.deleteByPrimaryKey(id);
		} catch (Exception e) {
			// TODO: handle exception
			log.error(e);
			e.printStackTrace();
			log.info("UserServiceImpl deleteUserByPrimaryKey failed!");
		}
		return -1;
	}

	public int deleteUserByBatch(List<String> ids) {
		// TODO Auto-generated method stub
		try {
			List<Integer> idList = new ArrayList<Integer>();

			for (String idString : ids) {
				idList.add(Integer.parseInt(idString));
			}
			return UserDao.deleteByBatch(idList);
		} catch (Exception e) {
			log.error(e);
			e.printStackTrace();
			log.info("UserServiceImpl deleteUserByPrimaryKey failed!");
		}
		return -1;
	}

	public User selectUserByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		try {
			return UserDao.selectByPrimaryKey(id);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			log.error(e);
			log.info("UserServiceImpl selectUserByPrimaryKey failed!");
		}
		return null;
	}

	public int updateUserByPrimaryKeySelective(User record) {
		// TODO Auto-generated method stub
		try {
			return UserDao.updateByPrimaryKeySelective(record);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			log.error(e);
			log.info("UserServiceImpl updateUserByPrimaryKeySelective failed!");
		}
		return -1;
	}

	public int updateUserByPrimaryKey(User record) {
		// TODO Auto-generated method stub
		try {
			return UserDao.updateByPrimaryKey(record);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			log.error(e);
			log.info("UserServiceImpl updateUserByPrimaryKey failed!");
		}
		return -1;
	}

	public List<User> selectUserByPage(BaseVo page) {
		try {
			RowBounds rb = new RowBounds(page.getiDisplayStart(), page.getiDisplayLength());
			return UserDao.selectListByPage(page,rb);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			log.error(e);
			log.info("UserServiceImpl selectUserByPage failed!");
		}
		return null;
	}

	public int selectUserCount(BaseVo page) {
		  try {
				return UserDao.selectListCount(page);
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			         log.error(e);
				log.info("UserServiceImpl selectUserCount failed!");
			}
			  
			  return -1;
	}
}
