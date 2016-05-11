package com.cg.service.impl;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.base.service.BaseServiceImpl;
import com.cg.dao.MatngDao;
import com.cg.service.MatngService;

/**
 * 
 * <br>
 * <b>功能：</b>MatngService<br>
 */
@Service("matngService")
public class  MatngServiceImpl  extends BaseServiceImpl implements MatngService {
  private final static Logger log= Logger.getLogger(MatngServiceImpl.class);
	

	@Autowired
    private MatngDao dao;

		
	public MatngDao getDao() {
		return dao;
	}

	

}
