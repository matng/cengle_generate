package com.cg.service.impl;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.base.service.BaseServiceImpl;
import com.cg.dao.UserDao;
import com.cg.service.UserService;

/**
 * 
 * <br>
 * <b>功能：</b>UserService<br>
 */
@Service("userService")
public class  UserServiceImpl  extends BaseServiceImpl implements UserService {
  private final static Logger log= Logger.getLogger(UserServiceImpl.class);
	

	@Autowired
    private UserDao dao;

		
	public UserDao getDao() {
		return dao;
	}

	

}
