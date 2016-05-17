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

import com.hxd.bean.Power;
import com.hxd.dao.PowerMapper;
import com.hxd.service.PowerService;
import com.hxd.vo.BaseVo;

/**
 * 
 * <br>
 * <b>功能：</b>PowerService<br>
 */
	
@Transactional(rollbackFor = Exception.class)
@Service(PowerService.SERVICE_NAME)
public class PowerServiceImpl implements PowerService {

	@Autowired
	PowerMapper PowerDao;
	
	private Log log = LogFactory.getLog(PowerServiceImpl.class);
	
	

	public int insertPower(Power record) {
		// TODO Auto-generated method stub
		try {
			return PowerDao.insert(record);
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			log.error(e);
			log.info("PowerServiceImpl insertPower failed!");
		}
		return -1;
	}

	public int insertPowerSelective(Power record) {
		try {
			return PowerDao.insertSelective(record);
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			log.error(e);
			log.info("PowerServiceImpl insertPowerSelective failed!");
		}
		// TODO Auto-generated method stub
		return -1;
	}

	public int deletePowerByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		try {
			return PowerDao.deleteByPrimaryKey(id);
		} catch (Exception e) {
			// TODO: handle exception
			log.error(e);
			e.printStackTrace();
			log.info("PowerServiceImpl deletePowerByPrimaryKey failed!");
		}
		return -1;
	}

	public int deletePowerByBatch(List<String> ids) {
		// TODO Auto-generated method stub
		try {
			List<Integer> idList = new ArrayList<Integer>();

			for (String idString : ids) {
				idList.add(Integer.parseInt(idString));
			}
			return PowerDao.deleteByBatch(idList);
		} catch (Exception e) {
			log.error(e);
			e.printStackTrace();
			log.info("PowerServiceImpl deletePowerByPrimaryKey failed!");
		}
		return -1;
	}

	public Power selectPowerByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		try {
			return PowerDao.selectByPrimaryKey(id);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			log.error(e);
			log.info("PowerServiceImpl selectPowerByPrimaryKey failed!");
		}
		return null;
	}

	public int updatePowerByPrimaryKeySelective(Power record) {
		// TODO Auto-generated method stub
		try {
			return PowerDao.updateByPrimaryKeySelective(record);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			log.error(e);
			log.info("PowerServiceImpl updatePowerByPrimaryKeySelective failed!");
		}
		return -1;
	}

	public int updatePowerByPrimaryKey(Power record) {
		// TODO Auto-generated method stub
		try {
			return PowerDao.updateByPrimaryKey(record);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			log.error(e);
			log.info("PowerServiceImpl updatePowerByPrimaryKey failed!");
		}
		return -1;
	}

	public List<Power> selectPowerByPage(BaseVo page) {
		try {
			RowBounds rb = new RowBounds(page.getiDisplayStart(), page.getiDisplayLength());
			return PowerDao.selectListByPage(page,rb);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			log.error(e);
			log.info("PowerServiceImpl selectPowerByPage failed!");
		}
		return null;
	}

	public int selectPowerCount(BaseVo page) {
		  try {
				return PowerDao.selectListCount(page);
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			         log.error(e);
				log.info("PowerServiceImpl selectPowerCount failed!");
			}
			  
			  return -1;
	}
}
