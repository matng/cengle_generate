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

import com.hxd.bean.Msg;
import com.hxd.dao.MsgMapper;
import com.hxd.service.MsgService;
import com.hxd.vo.BaseVo;

/**
 * 
 * <br>
 * <b>功能：</b>MsgService<br>
 */
	
@Transactional(rollbackFor = Exception.class)
@Service(MsgService.SERVICE_NAME)
public class MsgServiceImpl implements MsgService {

	@Autowired
	MsgMapper MsgDao;
	
	private Log log = LogFactory.getLog(MsgServiceImpl.class);
	
	

	public int insertMsg(Msg record) {
		// TODO Auto-generated method stub
		try {
			return MsgDao.insert(record);
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			log.error(e);
			log.info("MsgServiceImpl insertMsg failed!");
		}
		return -1;
	}

	public int insertMsgSelective(Msg record) {
		try {
			return MsgDao.insertSelective(record);
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			log.error(e);
			log.info("MsgServiceImpl insertMsgSelective failed!");
		}
		// TODO Auto-generated method stub
		return -1;
	}

	public int deleteMsgByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		try {
			return MsgDao.deleteByPrimaryKey(id);
		} catch (Exception e) {
			// TODO: handle exception
			log.error(e);
			e.printStackTrace();
			log.info("MsgServiceImpl deleteMsgByPrimaryKey failed!");
		}
		return -1;
	}

	public int deleteMsgByBatch(List<String> ids) {
		// TODO Auto-generated method stub
		try {
			List<Integer> idList = new ArrayList<Integer>();

			for (String idString : ids) {
				idList.add(Integer.parseInt(idString));
			}
			return MsgDao.deleteByBatch(idList);
		} catch (Exception e) {
			log.error(e);
			e.printStackTrace();
			log.info("MsgServiceImpl deleteMsgByPrimaryKey failed!");
		}
		return -1;
	}

	public Msg selectMsgByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		try {
			return MsgDao.selectByPrimaryKey(id);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			log.error(e);
			log.info("MsgServiceImpl selectMsgByPrimaryKey failed!");
		}
		return null;
	}

	public int updateMsgByPrimaryKeySelective(Msg record) {
		// TODO Auto-generated method stub
		try {
			return MsgDao.updateByPrimaryKeySelective(record);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			log.error(e);
			log.info("MsgServiceImpl updateMsgByPrimaryKeySelective failed!");
		}
		return -1;
	}

	public int updateMsgByPrimaryKey(Msg record) {
		// TODO Auto-generated method stub
		try {
			return MsgDao.updateByPrimaryKey(record);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			log.error(e);
			log.info("MsgServiceImpl updateMsgByPrimaryKey failed!");
		}
		return -1;
	}

	public List<Msg> selectMsgByPage(BaseVo page) {
		try {
			RowBounds rb = new RowBounds(page.getiDisplayStart(), page.getiDisplayLength());
			return MsgDao.selectListByPage(page,rb);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			log.error(e);
			log.info("MsgServiceImpl selectMsgByPage failed!");
		}
		return null;
	}

	public int selectMsgCount(BaseVo page) {
		  try {
				return MsgDao.selectListCount(page);
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			         log.error(e);
				log.info("MsgServiceImpl selectMsgCount failed!");
			}
			  
			  return -1;
	}
}
