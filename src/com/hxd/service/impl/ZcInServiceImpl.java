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

import com.hxd.bean.ZcIn;
import com.hxd.dao.ZcInMapper;
import com.hxd.service.ZcInService;
import com.hxd.vo.BaseVo;

/**
 * 
 * <br>
 * <b>功能：</b>ZcInService<br>
 */
	
@Transactional(rollbackFor = Exception.class)
@Service(ZcInService.SERVICE_NAME)
public class ZcInServiceImpl implements ZcInService {

	@Autowired
	ZcInMapper ZcInDao;
	
	private Log log = LogFactory.getLog(ZcInServiceImpl.class);
	
	

	public int insertZcIn(ZcIn record) {
		// TODO Auto-generated method stub
		try {
			return ZcInDao.insert(record);
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			log.error(e);
			log.info("ZcInServiceImpl insertZcIn failed!");
		}
		return -1;
	}

	public int insertZcInSelective(ZcIn record) {
		try {
			return ZcInDao.insertSelective(record);
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			log.error(e);
			log.info("ZcInServiceImpl insertZcInSelective failed!");
		}
		// TODO Auto-generated method stub
		return -1;
	}

	public int deleteZcInByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		try {
			return ZcInDao.deleteByPrimaryKey(id);
		} catch (Exception e) {
			// TODO: handle exception
			log.error(e);
			e.printStackTrace();
			log.info("ZcInServiceImpl deleteZcInByPrimaryKey failed!");
		}
		return -1;
	}

	public int deleteZcInByBatch(List<String> ids) {
		// TODO Auto-generated method stub
		try {
			List<Integer> idList = new ArrayList<Integer>();

			for (String idString : ids) {
				idList.add(Integer.parseInt(idString));
			}
			return ZcInDao.deleteByBatch(idList);
		} catch (Exception e) {
			log.error(e);
			e.printStackTrace();
			log.info("ZcInServiceImpl deleteZcInByPrimaryKey failed!");
		}
		return -1;
	}

	public ZcIn selectZcInByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		try {
			return ZcInDao.selectByPrimaryKey(id);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			log.error(e);
			log.info("ZcInServiceImpl selectZcInByPrimaryKey failed!");
		}
		return null;
	}

	public int updateZcInByPrimaryKeySelective(ZcIn record) {
		// TODO Auto-generated method stub
		try {
			return ZcInDao.updateByPrimaryKeySelective(record);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			log.error(e);
			log.info("ZcInServiceImpl updateZcInByPrimaryKeySelective failed!");
		}
		return -1;
	}

	public int updateZcInByPrimaryKey(ZcIn record) {
		// TODO Auto-generated method stub
		try {
			return ZcInDao.updateByPrimaryKey(record);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			log.error(e);
			log.info("ZcInServiceImpl updateZcInByPrimaryKey failed!");
		}
		return -1;
	}

	public List<ZcIn> selectZcInByPage(BaseVo page) {
		try {
			RowBounds rb = new RowBounds(page.getiDisplayStart(), page.getiDisplayLength());
			return ZcInDao.selectListByPage(page,rb);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			log.error(e);
			log.info("ZcInServiceImpl selectZcInByPage failed!");
		}
		return null;
	}

	public int selectZcInCount(BaseVo page) {
		  try {
				return ZcInDao.selectListCount(page);
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			         log.error(e);
				log.info("ZcInServiceImpl selectZcInCount failed!");
			}
			  
			  return -1;
	}
}
