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

import com.hxd.bean.ZcRepair;
import com.hxd.dao.ZcRepairMapper;
import com.hxd.service.ZcRepairService;
import com.hxd.vo.BaseVo;

/**
 * 
 * <br>
 * <b>功能：</b>ZcRepairService<br>
 */
	
@Transactional(rollbackFor = Exception.class)
@Service(ZcRepairService.SERVICE_NAME)
public class ZcRepairServiceImpl implements ZcRepairService {

	@Autowired
	ZcRepairMapper ZcRepairDao;
	
	private Log log = LogFactory.getLog(ZcRepairServiceImpl.class);
	
	

	public int insertZcRepair(ZcRepair record) {
		// TODO Auto-generated method stub
		try {
			return ZcRepairDao.insert(record);
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			log.error(e);
			log.info("ZcRepairServiceImpl insertZcRepair failed!");
		}
		return -1;
	}

	public int insertZcRepairSelective(ZcRepair record) {
		try {
			return ZcRepairDao.insertSelective(record);
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			log.error(e);
			log.info("ZcRepairServiceImpl insertZcRepairSelective failed!");
		}
		// TODO Auto-generated method stub
		return -1;
	}

	public int deleteZcRepairByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		try {
			return ZcRepairDao.deleteByPrimaryKey(id);
		} catch (Exception e) {
			// TODO: handle exception
			log.error(e);
			e.printStackTrace();
			log.info("ZcRepairServiceImpl deleteZcRepairByPrimaryKey failed!");
		}
		return -1;
	}

	public int deleteZcRepairByBatch(List<String> ids) {
		// TODO Auto-generated method stub
		try {
			List<Integer> idList = new ArrayList<Integer>();

			for (String idString : ids) {
				idList.add(Integer.parseInt(idString));
			}
			return ZcRepairDao.deleteByBatch(idList);
		} catch (Exception e) {
			log.error(e);
			e.printStackTrace();
			log.info("ZcRepairServiceImpl deleteZcRepairByPrimaryKey failed!");
		}
		return -1;
	}

	public ZcRepair selectZcRepairByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		try {
			return ZcRepairDao.selectByPrimaryKey(id);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			log.error(e);
			log.info("ZcRepairServiceImpl selectZcRepairByPrimaryKey failed!");
		}
		return null;
	}

	public int updateZcRepairByPrimaryKeySelective(ZcRepair record) {
		// TODO Auto-generated method stub
		try {
			return ZcRepairDao.updateByPrimaryKeySelective(record);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			log.error(e);
			log.info("ZcRepairServiceImpl updateZcRepairByPrimaryKeySelective failed!");
		}
		return -1;
	}

	public int updateZcRepairByPrimaryKey(ZcRepair record) {
		// TODO Auto-generated method stub
		try {
			return ZcRepairDao.updateByPrimaryKey(record);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			log.error(e);
			log.info("ZcRepairServiceImpl updateZcRepairByPrimaryKey failed!");
		}
		return -1;
	}

	public List<ZcRepair> selectZcRepairByPage(BaseVo page) {
		try {
			RowBounds rb = new RowBounds(page.getiDisplayStart(), page.getiDisplayLength());
			return ZcRepairDao.selectListByPage(page,rb);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			log.error(e);
			log.info("ZcRepairServiceImpl selectZcRepairByPage failed!");
		}
		return null;
	}

	public int selectZcRepairCount(BaseVo page) {
		  try {
				return ZcRepairDao.selectListCount(page);
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			         log.error(e);
				log.info("ZcRepairServiceImpl selectZcRepairCount failed!");
			}
			  
			  return -1;
	}
}
