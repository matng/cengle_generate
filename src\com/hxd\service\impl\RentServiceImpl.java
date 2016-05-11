package com.hxd.service.impl;

import java.util.List;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hxd.bean.Rent;
import com.hxd.dao.RentMapper;
import com.hxd.service.RentService;
import com.hxd.vo.BaseVo;

/**
 * 
 * <br>
 * <b>功能：</b>RentService<br>
 */
	
@Transactional(rollbackFor = Exception.class)
@Service(RentService.SERVICE_NAME)
public class RentServiceImpl implements RentService {

	@Autowired
	RentMapper RentDao;
	
	private Log log = LogFactory.getLog(RentServiceImpl.class);
	
	public int deleteRentByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		try {
			return RentDao.deleteByPrimaryKey(id);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			log.info("RentServiceImpl deleteRentByPrimaryKey failed!");
		}
		return -1;
	}

	public int insertRent(Rent record) {
		// TODO Auto-generated method stub
		try {
			return RentDao.insert(record);
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			log.info("RentServiceImpl insertRent failed!");
		}
		return -1;
	}

	public int insertRentSelective(Rent record) {
		try {
			return RentDao.insertSelective(record);
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			log.info("RentServiceImpl insertRentSelective failed!");
		}
		// TODO Auto-generated method stub
		return -1;
	}

	public Rent selectRentByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		try {
			return RentDao.selectByPrimaryKey(id);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			log.info("RentServiceImpl selectRentByPrimaryKey failed!");
		}
		return null;
	}

	public int updateRentByPrimaryKeySelective(Rent record) {
		// TODO Auto-generated method stub
		try {
			return RentDao.updateByPrimaryKeySelective(record);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			log.info("RentServiceImpl updateRentByPrimaryKeySelective failed!");
		}
		return -1;
	}

	public int updateRentByPrimaryKey(Rent record) {
		// TODO Auto-generated method stub
		try {
			return RentDao.updateByPrimaryKey(record);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			log.info("RentServiceImpl updateRentByPrimaryKey failed!");
		}
		return -1;
	}

	public List<Rent> queryRentListByPage(BaseVo page) {
		try {
			RowBounds rb = new RowBounds(page.getiDisplayStart(), page.getiDisplayLength());
			return RentDao.queryRentByPage(page,rb);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			log.info("RentServiceImpl queryRentByPage failed!");
		}
		return null;
	}

	public int queryRentCount(BaseVo page) {
		  try {
				return RentDao.queryRentListCount(page);
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
				log.info("RentServiceImpl queryRentCount failed!");
			}
			  
			  return -1;
	}
}
