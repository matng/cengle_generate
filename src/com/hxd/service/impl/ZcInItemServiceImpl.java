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

import com.hxd.bean.ZcInItem;
import com.hxd.dao.ZcInItemMapper;
import com.hxd.service.ZcInItemService;
import com.hxd.vo.BaseVo;

/**
 * 
 * <br>
 * <b>功能：</b>ZcInItemService<br>
 */
	
@Transactional(rollbackFor = Exception.class)
@Service(ZcInItemService.SERVICE_NAME)
public class ZcInItemServiceImpl implements ZcInItemService {

	@Autowired
	ZcInItemMapper ZcInItemDao;
	
	private Log log = LogFactory.getLog(ZcInItemServiceImpl.class);
	
	

	public int insertZcInItem(ZcInItem record) {
		// TODO Auto-generated method stub
		try {
			return ZcInItemDao.insert(record);
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			log.error(e);
			log.info("ZcInItemServiceImpl insertZcInItem failed!");
		}
		return -1;
	}

	public int insertZcInItemSelective(ZcInItem record) {
		try {
			return ZcInItemDao.insertSelective(record);
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			log.error(e);
			log.info("ZcInItemServiceImpl insertZcInItemSelective failed!");
		}
		// TODO Auto-generated method stub
		return -1;
	}

	public int deleteZcInItemByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		try {
			return ZcInItemDao.deleteByPrimaryKey(id);
		} catch (Exception e) {
			// TODO: handle exception
			log.error(e);
			e.printStackTrace();
			log.info("ZcInItemServiceImpl deleteZcInItemByPrimaryKey failed!");
		}
		return -1;
	}

	public int deleteZcInItemByBatch(List<String> ids) {
		// TODO Auto-generated method stub
		try {
			List<Integer> idList = new ArrayList<Integer>();

			for (String idString : ids) {
				idList.add(Integer.parseInt(idString));
			}
			return ZcInItemDao.deleteByBatch(idList);
		} catch (Exception e) {
			log.error(e);
			e.printStackTrace();
			log.info("ZcInItemServiceImpl deleteZcInItemByPrimaryKey failed!");
		}
		return -1;
	}

	public ZcInItem selectZcInItemByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		try {
			return ZcInItemDao.selectByPrimaryKey(id);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			log.error(e);
			log.info("ZcInItemServiceImpl selectZcInItemByPrimaryKey failed!");
		}
		return null;
	}

	public int updateZcInItemByPrimaryKeySelective(ZcInItem record) {
		// TODO Auto-generated method stub
		try {
			return ZcInItemDao.updateByPrimaryKeySelective(record);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			log.error(e);
			log.info("ZcInItemServiceImpl updateZcInItemByPrimaryKeySelective failed!");
		}
		return -1;
	}

	public int updateZcInItemByPrimaryKey(ZcInItem record) {
		// TODO Auto-generated method stub
		try {
			return ZcInItemDao.updateByPrimaryKey(record);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			log.error(e);
			log.info("ZcInItemServiceImpl updateZcInItemByPrimaryKey failed!");
		}
		return -1;
	}

	public List<ZcInItem> selectZcInItemByPage(BaseVo page) {
		try {
			RowBounds rb = new RowBounds(page.getiDisplayStart(), page.getiDisplayLength());
			return ZcInItemDao.selectListByPage(page,rb);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			log.error(e);
			log.info("ZcInItemServiceImpl selectZcInItemByPage failed!");
		}
		return null;
	}

	public int selectZcInItemCount(BaseVo page) {
		  try {
				return ZcInItemDao.selectListCount(page);
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			         log.error(e);
				log.info("ZcInItemServiceImpl selectZcInItemCount failed!");
			}
			  
			  return -1;
	}
}
