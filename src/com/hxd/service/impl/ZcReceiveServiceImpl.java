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

import com.hxd.bean.ZcReceive;
import com.hxd.dao.ZcReceiveMapper;
import com.hxd.service.ZcReceiveService;
import com.hxd.vo.BaseVo;

/**
 * 
 * <br>
 * <b>功能：</b>ZcReceiveService<br>
 */
	
@Transactional(rollbackFor = Exception.class)
@Service(ZcReceiveService.SERVICE_NAME)
public class ZcReceiveServiceImpl implements ZcReceiveService {

	@Autowired
	ZcReceiveMapper ZcReceiveDao;
	
	private Log log = LogFactory.getLog(ZcReceiveServiceImpl.class);
	
	

	public int insertZcReceive(ZcReceive record) {
		// TODO Auto-generated method stub
		try {
			return ZcReceiveDao.insert(record);
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			log.error(e);
			log.info("ZcReceiveServiceImpl insertZcReceive failed!");
		}
		return -1;
	}

	public int insertZcReceiveSelective(ZcReceive record) {
		try {
			return ZcReceiveDao.insertSelective(record);
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			log.error(e);
			log.info("ZcReceiveServiceImpl insertZcReceiveSelective failed!");
		}
		// TODO Auto-generated method stub
		return -1;
	}

	public int deleteZcReceiveByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		try {
			return ZcReceiveDao.deleteByPrimaryKey(id);
		} catch (Exception e) {
			// TODO: handle exception
			log.error(e);
			e.printStackTrace();
			log.info("ZcReceiveServiceImpl deleteZcReceiveByPrimaryKey failed!");
		}
		return -1;
	}

	public int deleteZcReceiveByBatch(List<String> ids) {
		// TODO Auto-generated method stub
		try {
			List<Integer> idList = new ArrayList<Integer>();

			for (String idString : ids) {
				idList.add(Integer.parseInt(idString));
			}
			return ZcReceiveDao.deleteByBatch(idList);
		} catch (Exception e) {
			log.error(e);
			e.printStackTrace();
			log.info("ZcReceiveServiceImpl deleteZcReceiveByPrimaryKey failed!");
		}
		return -1;
	}

	public ZcReceive selectZcReceiveByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		try {
			return ZcReceiveDao.selectByPrimaryKey(id);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			log.error(e);
			log.info("ZcReceiveServiceImpl selectZcReceiveByPrimaryKey failed!");
		}
		return null;
	}

	public int updateZcReceiveByPrimaryKeySelective(ZcReceive record) {
		// TODO Auto-generated method stub
		try {
			return ZcReceiveDao.updateByPrimaryKeySelective(record);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			log.error(e);
			log.info("ZcReceiveServiceImpl updateZcReceiveByPrimaryKeySelective failed!");
		}
		return -1;
	}

	public int updateZcReceiveByPrimaryKey(ZcReceive record) {
		// TODO Auto-generated method stub
		try {
			return ZcReceiveDao.updateByPrimaryKey(record);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			log.error(e);
			log.info("ZcReceiveServiceImpl updateZcReceiveByPrimaryKey failed!");
		}
		return -1;
	}

	public List<ZcReceive> selectZcReceiveByPage(BaseVo page) {
		try {
			RowBounds rb = new RowBounds(page.getiDisplayStart(), page.getiDisplayLength());
			return ZcReceiveDao.selectListByPage(page,rb);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			log.error(e);
			log.info("ZcReceiveServiceImpl selectZcReceiveByPage failed!");
		}
		return null;
	}

	public int selectZcReceiveCount(BaseVo page) {
		  try {
				return ZcReceiveDao.selectListCount(page);
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			         log.error(e);
				log.info("ZcReceiveServiceImpl selectZcReceiveCount failed!");
			}
			  
			  return -1;
	}
}
