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

import com.hxd.bean.Location;
import com.hxd.dao.LocationMapper;
import com.hxd.service.LocationService;
import com.hxd.vo.BaseVo;

/**
 * 
 * <br>
 * <b>功能：</b>LocationService<br>
 */
	
@Transactional(rollbackFor = Exception.class)
@Service(LocationService.SERVICE_NAME)
public class LocationServiceImpl implements LocationService {

	@Autowired
	LocationMapper LocationDao;
	
	private Log log = LogFactory.getLog(LocationServiceImpl.class);
	
	

	public int insertLocation(Location record) {
		// TODO Auto-generated method stub
		try {
			return LocationDao.insert(record);
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			log.error(e);
			log.info("LocationServiceImpl insertLocation failed!");
		}
		return -1;
	}

	public int insertLocationSelective(Location record) {
		try {
			return LocationDao.insertSelective(record);
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			log.error(e);
			log.info("LocationServiceImpl insertLocationSelective failed!");
		}
		// TODO Auto-generated method stub
		return -1;
	}

	public int deleteLocationByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		try {
			return LocationDao.deleteByPrimaryKey(id);
		} catch (Exception e) {
			// TODO: handle exception
			log.error(e);
			e.printStackTrace();
			log.info("LocationServiceImpl deleteLocationByPrimaryKey failed!");
		}
		return -1;
	}

	public int deleteLocationByBatch(List<String> ids) {
		// TODO Auto-generated method stub
		try {
			List<Integer> idList = new ArrayList<Integer>();

			for (String idString : ids) {
				idList.add(Integer.parseInt(idString));
			}
			return LocationDao.deleteByBatch(idList);
		} catch (Exception e) {
			log.error(e);
			e.printStackTrace();
			log.info("LocationServiceImpl deleteLocationByPrimaryKey failed!");
		}
		return -1;
	}

	public Location selectLocationByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		try {
			return LocationDao.selectByPrimaryKey(id);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			log.error(e);
			log.info("LocationServiceImpl selectLocationByPrimaryKey failed!");
		}
		return null;
	}

	public int updateLocationByPrimaryKeySelective(Location record) {
		// TODO Auto-generated method stub
		try {
			return LocationDao.updateByPrimaryKeySelective(record);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			log.error(e);
			log.info("LocationServiceImpl updateLocationByPrimaryKeySelective failed!");
		}
		return -1;
	}

	public int updateLocationByPrimaryKey(Location record) {
		// TODO Auto-generated method stub
		try {
			return LocationDao.updateByPrimaryKey(record);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			log.error(e);
			log.info("LocationServiceImpl updateLocationByPrimaryKey failed!");
		}
		return -1;
	}

	public List<Location> selectLocationByPage(BaseVo page) {
		try {
			RowBounds rb = new RowBounds(page.getiDisplayStart(), page.getiDisplayLength());
			return LocationDao.selectListByPage(page,rb);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			log.error(e);
			log.info("LocationServiceImpl selectLocationByPage failed!");
		}
		return null;
	}

	public int selectLocationCount(BaseVo page) {
		  try {
				return LocationDao.selectListCount(page);
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			         log.error(e);
				log.info("LocationServiceImpl selectLocationCount failed!");
			}
			  
			  return -1;
	}
}
