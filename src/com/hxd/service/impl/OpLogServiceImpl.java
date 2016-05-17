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

import com.hxd.bean.OpLog;
import com.hxd.dao.OpLogMapper;
import com.hxd.service.OpLogService;
import com.hxd.vo.BaseVo;

/**
 * 
 * <br>
 * <b>功能：</b>OpLogService<br>
 */
	
@Transactional(rollbackFor = Exception.class)
@Service(OpLogService.SERVICE_NAME)
public class OpLogServiceImpl implements OpLogService {

	@Autowired
	OpLogMapper OpLogDao;
	
	private Log log = LogFactory.getLog(OpLogServiceImpl.class);
	
	

	public int insertOpLog(OpLog record) {
		// TODO Auto-generated method stub
		try {
			return OpLogDao.insert(record);
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			log.error(e);
			log.info("OpLogServiceImpl insertOpLog failed!");
		}
		return -1;
	}

	public int insertOpLogSelective(OpLog record) {
		try {
			return OpLogDao.insertSelective(record);
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			log.error(e);
			log.info("OpLogServiceImpl insertOpLogSelective failed!");
		}
		// TODO Auto-generated method stub
		return -1;
	}

	public int deleteOpLogByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		try {
			return OpLogDao.deleteByPrimaryKey(id);
		} catch (Exception e) {
			// TODO: handle exception
			log.error(e);
			e.printStackTrace();
			log.info("OpLogServiceImpl deleteOpLogByPrimaryKey failed!");
		}
		return -1;
	}

	public int deleteOpLogByBatch(List<String> ids) {
		// TODO Auto-generated method stub
		try {
			List<Integer> idList = new ArrayList<Integer>();

			for (String idString : ids) {
				idList.add(Integer.parseInt(idString));
			}
			return OpLogDao.deleteByBatch(idList);
		} catch (Exception e) {
			log.error(e);
			e.printStackTrace();
			log.info("OpLogServiceImpl deleteOpLogByPrimaryKey failed!");
		}
		return -1;
	}

	public OpLog selectOpLogByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		try {
			return OpLogDao.selectByPrimaryKey(id);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			log.error(e);
			log.info("OpLogServiceImpl selectOpLogByPrimaryKey failed!");
		}
		return null;
	}

	public int updateOpLogByPrimaryKeySelective(OpLog record) {
		// TODO Auto-generated method stub
		try {
			return OpLogDao.updateByPrimaryKeySelective(record);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			log.error(e);
			log.info("OpLogServiceImpl updateOpLogByPrimaryKeySelective failed!");
		}
		return -1;
	}

	public int updateOpLogByPrimaryKey(OpLog record) {
		// TODO Auto-generated method stub
		try {
			return OpLogDao.updateByPrimaryKey(record);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			log.error(e);
			log.info("OpLogServiceImpl updateOpLogByPrimaryKey failed!");
		}
		return -1;
	}

	public List<OpLog> selectOpLogByPage(BaseVo page) {
		try {
			RowBounds rb = new RowBounds(page.getiDisplayStart(), page.getiDisplayLength());
			return OpLogDao.selectListByPage(page,rb);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			log.error(e);
			log.info("OpLogServiceImpl selectOpLogByPage failed!");
		}
		return null;
	}

	public int selectOpLogCount(BaseVo page) {
		  try {
				return OpLogDao.selectListCount(page);
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			         log.error(e);
				log.info("OpLogServiceImpl selectOpLogCount failed!");
			}
			  
			  return -1;
	}
}
