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

import com.hxd.bean.CarInfo;
import com.hxd.dao.CarInfoMapper;
import com.hxd.service.CarInfoService;
import com.hxd.vo.BaseVo;

/**
 * 
 * <br>
 * <b>功能：</b>CarInfoService<br>
 */
	
@Transactional(rollbackFor = Exception.class)
@Service(CarInfoService.SERVICE_NAME)
public class CarInfoServiceImpl implements CarInfoService {

	@Autowired
	CarInfoMapper CarInfoDao;
	
	private Log log = LogFactory.getLog(CarInfoServiceImpl.class);
	
	

	public int insertCarInfo(CarInfo record) {
		// TODO Auto-generated method stub
		try {
			return CarInfoDao.insert(record);
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			log.error(e);
			log.info("CarInfoServiceImpl insertCarInfo failed!");
		}
		return -1;
	}

	public int insertCarInfoSelective(CarInfo record) {
		try {
			return CarInfoDao.insertSelective(record);
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			log.error(e);
			log.info("CarInfoServiceImpl insertCarInfoSelective failed!");
		}
		// TODO Auto-generated method stub
		return -1;
	}

	public int deleteCarInfoByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		try {
			return CarInfoDao.deleteByPrimaryKey(id);
		} catch (Exception e) {
			// TODO: handle exception
			log.error(e);
			e.printStackTrace();
			log.info("CarInfoServiceImpl deleteCarInfoByPrimaryKey failed!");
		}
		return -1;
	}

	public int deleteCarInfoByBatch(List<String> ids) {
		// TODO Auto-generated method stub
		try {
			List<Integer> idList = new ArrayList<Integer>();

			for (String idString : ids) {
				idList.add(Integer.parseInt(idString));
			}
			return CarInfoDao.deleteByBatch(idList);
		} catch (Exception e) {
			log.error(e);
			e.printStackTrace();
			log.info("CarInfoServiceImpl deleteCarInfoByPrimaryKey failed!");
		}
		return -1;
	}

	public CarInfo selectCarInfoByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		try {
			return CarInfoDao.selectByPrimaryKey(id);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			log.error(e);
			log.info("CarInfoServiceImpl selectCarInfoByPrimaryKey failed!");
		}
		return null;
	}

	public int updateCarInfoByPrimaryKeySelective(CarInfo record) {
		// TODO Auto-generated method stub
		try {
			return CarInfoDao.updateByPrimaryKeySelective(record);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			log.error(e);
			log.info("CarInfoServiceImpl updateCarInfoByPrimaryKeySelective failed!");
		}
		return -1;
	}

	public int updateCarInfoByPrimaryKey(CarInfo record) {
		// TODO Auto-generated method stub
		try {
			return CarInfoDao.updateByPrimaryKey(record);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			log.error(e);
			log.info("CarInfoServiceImpl updateCarInfoByPrimaryKey failed!");
		}
		return -1;
	}

	public List<CarInfo> selectCarInfoByPage(BaseVo page) {
		try {
			RowBounds rb = new RowBounds(page.getiDisplayStart(), page.getiDisplayLength());
			return CarInfoDao.selectListByPage(page,rb);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			log.error(e);
			log.info("CarInfoServiceImpl selectCarInfoByPage failed!");
		}
		return null;
	}

	public int selectCarInfoCount(BaseVo page) {
		  try {
				return CarInfoDao.selectListCount(page);
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			         log.error(e);
				log.info("CarInfoServiceImpl selectCarInfoCount failed!");
			}
			  
			  return -1;
	}
}
