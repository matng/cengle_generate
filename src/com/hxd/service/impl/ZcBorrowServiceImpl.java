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

import com.hxd.bean.ZcBorrow;
import com.hxd.dao.ZcBorrowMapper;
import com.hxd.service.ZcBorrowService;
import com.hxd.vo.BaseVo;

/**
 * 
 * <br>
 * <b>功能：</b>ZcBorrowService<br>
 */
	
@Transactional(rollbackFor = Exception.class)
@Service(ZcBorrowService.SERVICE_NAME)
public class ZcBorrowServiceImpl implements ZcBorrowService {

	@Autowired
	ZcBorrowMapper ZcBorrowDao;
	
	private Log log = LogFactory.getLog(ZcBorrowServiceImpl.class);
	
	

	public int insertZcBorrow(ZcBorrow record) {
		// TODO Auto-generated method stub
		try {
			return ZcBorrowDao.insert(record);
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			log.error(e);
			log.info("ZcBorrowServiceImpl insertZcBorrow failed!");
		}
		return -1;
	}

	public int insertZcBorrowSelective(ZcBorrow record) {
		try {
			return ZcBorrowDao.insertSelective(record);
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			log.error(e);
			log.info("ZcBorrowServiceImpl insertZcBorrowSelective failed!");
		}
		// TODO Auto-generated method stub
		return -1;
	}

	public int deleteZcBorrowByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		try {
			return ZcBorrowDao.deleteByPrimaryKey(id);
		} catch (Exception e) {
			// TODO: handle exception
			log.error(e);
			e.printStackTrace();
			log.info("ZcBorrowServiceImpl deleteZcBorrowByPrimaryKey failed!");
		}
		return -1;
	}

	public int deleteZcBorrowByBatch(List<String> ids) {
		// TODO Auto-generated method stub
		try {
			List<Integer> idList = new ArrayList<Integer>();

			for (String idString : ids) {
				idList.add(Integer.parseInt(idString));
			}
			return ZcBorrowDao.deleteByBatch(idList);
		} catch (Exception e) {
			log.error(e);
			e.printStackTrace();
			log.info("ZcBorrowServiceImpl deleteZcBorrowByPrimaryKey failed!");
		}
		return -1;
	}

	public ZcBorrow selectZcBorrowByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		try {
			return ZcBorrowDao.selectByPrimaryKey(id);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			log.error(e);
			log.info("ZcBorrowServiceImpl selectZcBorrowByPrimaryKey failed!");
		}
		return null;
	}

	public int updateZcBorrowByPrimaryKeySelective(ZcBorrow record) {
		// TODO Auto-generated method stub
		try {
			return ZcBorrowDao.updateByPrimaryKeySelective(record);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			log.error(e);
			log.info("ZcBorrowServiceImpl updateZcBorrowByPrimaryKeySelective failed!");
		}
		return -1;
	}

	public int updateZcBorrowByPrimaryKey(ZcBorrow record) {
		// TODO Auto-generated method stub
		try {
			return ZcBorrowDao.updateByPrimaryKey(record);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			log.error(e);
			log.info("ZcBorrowServiceImpl updateZcBorrowByPrimaryKey failed!");
		}
		return -1;
	}

	public List<ZcBorrow> selectZcBorrowByPage(BaseVo page) {
		try {
			RowBounds rb = new RowBounds(page.getiDisplayStart(), page.getiDisplayLength());
			return ZcBorrowDao.selectListByPage(page,rb);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			log.error(e);
			log.info("ZcBorrowServiceImpl selectZcBorrowByPage failed!");
		}
		return null;
	}

	public int selectZcBorrowCount(BaseVo page) {
		  try {
				return ZcBorrowDao.selectListCount(page);
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			         log.error(e);
				log.info("ZcBorrowServiceImpl selectZcBorrowCount failed!");
			}
			  
			  return -1;
	}
}
