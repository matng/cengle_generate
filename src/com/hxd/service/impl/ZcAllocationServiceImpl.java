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

import com.hxd.bean.ZcAllocation;
import com.hxd.dao.ZcAllocationMapper;
import com.hxd.service.ZcAllocationService;
import com.hxd.vo.BaseVo;

/**
 * 
 * <br>
 * <b>功能：</b>ZcAllocationService<br>
 */
	
@Transactional(rollbackFor = Exception.class)
@Service(ZcAllocationService.SERVICE_NAME)
public class ZcAllocationServiceImpl implements ZcAllocationService {

	@Autowired
	ZcAllocationMapper ZcAllocationDao;
	
	private Log log = LogFactory.getLog(ZcAllocationServiceImpl.class);
	
	

	public int insertZcAllocation(ZcAllocation record) {
		// TODO Auto-generated method stub
		try {
			return ZcAllocationDao.insert(record);
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			log.error(e);
			log.info("ZcAllocationServiceImpl insertZcAllocation failed!");
		}
		return -1;
	}

	public int insertZcAllocationSelective(ZcAllocation record) {
		try {
			return ZcAllocationDao.insertSelective(record);
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			log.error(e);
			log.info("ZcAllocationServiceImpl insertZcAllocationSelective failed!");
		}
		// TODO Auto-generated method stub
		return -1;
	}

	public int deleteZcAllocationByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		try {
			return ZcAllocationDao.deleteByPrimaryKey(id);
		} catch (Exception e) {
			// TODO: handle exception
			log.error(e);
			e.printStackTrace();
			log.info("ZcAllocationServiceImpl deleteZcAllocationByPrimaryKey failed!");
		}
		return -1;
	}

	public int deleteZcAllocationByBatch(List<String> ids) {
		// TODO Auto-generated method stub
		try {
			List<Integer> idList = new ArrayList<Integer>();

			for (String idString : ids) {
				idList.add(Integer.parseInt(idString));
			}
			return ZcAllocationDao.deleteByBatch(idList);
		} catch (Exception e) {
			log.error(e);
			e.printStackTrace();
			log.info("ZcAllocationServiceImpl deleteZcAllocationByPrimaryKey failed!");
		}
		return -1;
	}

	public ZcAllocation selectZcAllocationByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		try {
			return ZcAllocationDao.selectByPrimaryKey(id);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			log.error(e);
			log.info("ZcAllocationServiceImpl selectZcAllocationByPrimaryKey failed!");
		}
		return null;
	}

	public int updateZcAllocationByPrimaryKeySelective(ZcAllocation record) {
		// TODO Auto-generated method stub
		try {
			return ZcAllocationDao.updateByPrimaryKeySelective(record);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			log.error(e);
			log.info("ZcAllocationServiceImpl updateZcAllocationByPrimaryKeySelective failed!");
		}
		return -1;
	}

	public int updateZcAllocationByPrimaryKey(ZcAllocation record) {
		// TODO Auto-generated method stub
		try {
			return ZcAllocationDao.updateByPrimaryKey(record);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			log.error(e);
			log.info("ZcAllocationServiceImpl updateZcAllocationByPrimaryKey failed!");
		}
		return -1;
	}

	public List<ZcAllocation> selectZcAllocationByPage(BaseVo page) {
		try {
			RowBounds rb = new RowBounds(page.getiDisplayStart(), page.getiDisplayLength());
			return ZcAllocationDao.selectListByPage(page,rb);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			log.error(e);
			log.info("ZcAllocationServiceImpl selectZcAllocationByPage failed!");
		}
		return null;
	}

	public int selectZcAllocationCount(BaseVo page) {
		  try {
				return ZcAllocationDao.selectListCount(page);
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			         log.error(e);
				log.info("ZcAllocationServiceImpl selectZcAllocationCount failed!");
			}
			  
			  return -1;
	}
}
