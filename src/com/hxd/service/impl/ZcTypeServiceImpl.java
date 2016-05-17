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

import com.hxd.bean.ZcType;
import com.hxd.dao.ZcTypeMapper;
import com.hxd.service.ZcTypeService;
import com.hxd.vo.BaseVo;

/**
 * 
 * <br>
 * <b>功能：</b>ZcTypeService<br>
 */
	
@Transactional(rollbackFor = Exception.class)
@Service(ZcTypeService.SERVICE_NAME)
public class ZcTypeServiceImpl implements ZcTypeService {

	@Autowired
	ZcTypeMapper ZcTypeDao;
	
	private Log log = LogFactory.getLog(ZcTypeServiceImpl.class);
	
	

	public int insertZcType(ZcType record) {
		// TODO Auto-generated method stub
		try {
			return ZcTypeDao.insert(record);
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			log.error(e);
			log.info("ZcTypeServiceImpl insertZcType failed!");
		}
		return -1;
	}

	public int insertZcTypeSelective(ZcType record) {
		try {
			return ZcTypeDao.insertSelective(record);
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			log.error(e);
			log.info("ZcTypeServiceImpl insertZcTypeSelective failed!");
		}
		// TODO Auto-generated method stub
		return -1;
	}

	public int deleteZcTypeByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		try {
			return ZcTypeDao.deleteByPrimaryKey(id);
		} catch (Exception e) {
			// TODO: handle exception
			log.error(e);
			e.printStackTrace();
			log.info("ZcTypeServiceImpl deleteZcTypeByPrimaryKey failed!");
		}
		return -1;
	}

	public int deleteZcTypeByBatch(List<String> ids) {
		// TODO Auto-generated method stub
		try {
			List<Integer> idList = new ArrayList<Integer>();

			for (String idString : ids) {
				idList.add(Integer.parseInt(idString));
			}
			return ZcTypeDao.deleteByBatch(idList);
		} catch (Exception e) {
			log.error(e);
			e.printStackTrace();
			log.info("ZcTypeServiceImpl deleteZcTypeByPrimaryKey failed!");
		}
		return -1;
	}

	public ZcType selectZcTypeByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		try {
			return ZcTypeDao.selectByPrimaryKey(id);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			log.error(e);
			log.info("ZcTypeServiceImpl selectZcTypeByPrimaryKey failed!");
		}
		return null;
	}

	public int updateZcTypeByPrimaryKeySelective(ZcType record) {
		// TODO Auto-generated method stub
		try {
			return ZcTypeDao.updateByPrimaryKeySelective(record);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			log.error(e);
			log.info("ZcTypeServiceImpl updateZcTypeByPrimaryKeySelective failed!");
		}
		return -1;
	}

	public int updateZcTypeByPrimaryKey(ZcType record) {
		// TODO Auto-generated method stub
		try {
			return ZcTypeDao.updateByPrimaryKey(record);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			log.error(e);
			log.info("ZcTypeServiceImpl updateZcTypeByPrimaryKey failed!");
		}
		return -1;
	}

	public List<ZcType> selectZcTypeByPage(BaseVo page) {
		try {
			RowBounds rb = new RowBounds(page.getiDisplayStart(), page.getiDisplayLength());
			return ZcTypeDao.selectListByPage(page,rb);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			log.error(e);
			log.info("ZcTypeServiceImpl selectZcTypeByPage failed!");
		}
		return null;
	}

	public int selectZcTypeCount(BaseVo page) {
		  try {
				return ZcTypeDao.selectListCount(page);
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			         log.error(e);
				log.info("ZcTypeServiceImpl selectZcTypeCount failed!");
			}
			  
			  return -1;
	}
}
