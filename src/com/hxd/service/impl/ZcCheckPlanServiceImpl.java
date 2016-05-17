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

import com.hxd.bean.ZcCheckPlan;
import com.hxd.dao.ZcCheckPlanMapper;
import com.hxd.service.ZcCheckPlanService;
import com.hxd.vo.BaseVo;

/**
 * 
 * <br>
 * <b>功能：</b>ZcCheckPlanService<br>
 */
	
@Transactional(rollbackFor = Exception.class)
@Service(ZcCheckPlanService.SERVICE_NAME)
public class ZcCheckPlanServiceImpl implements ZcCheckPlanService {

	@Autowired
	ZcCheckPlanMapper ZcCheckPlanDao;
	
	private Log log = LogFactory.getLog(ZcCheckPlanServiceImpl.class);
	
	

	public int insertZcCheckPlan(ZcCheckPlan record) {
		// TODO Auto-generated method stub
		try {
			return ZcCheckPlanDao.insert(record);
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			log.error(e);
			log.info("ZcCheckPlanServiceImpl insertZcCheckPlan failed!");
		}
		return -1;
	}

	public int insertZcCheckPlanSelective(ZcCheckPlan record) {
		try {
			return ZcCheckPlanDao.insertSelective(record);
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			log.error(e);
			log.info("ZcCheckPlanServiceImpl insertZcCheckPlanSelective failed!");
		}
		// TODO Auto-generated method stub
		return -1;
	}

	public int deleteZcCheckPlanByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		try {
			return ZcCheckPlanDao.deleteByPrimaryKey(id);
		} catch (Exception e) {
			// TODO: handle exception
			log.error(e);
			e.printStackTrace();
			log.info("ZcCheckPlanServiceImpl deleteZcCheckPlanByPrimaryKey failed!");
		}
		return -1;
	}

	public int deleteZcCheckPlanByBatch(List<String> ids) {
		// TODO Auto-generated method stub
		try {
			List<Integer> idList = new ArrayList<Integer>();

			for (String idString : ids) {
				idList.add(Integer.parseInt(idString));
			}
			return ZcCheckPlanDao.deleteByBatch(idList);
		} catch (Exception e) {
			log.error(e);
			e.printStackTrace();
			log.info("ZcCheckPlanServiceImpl deleteZcCheckPlanByPrimaryKey failed!");
		}
		return -1;
	}

	public ZcCheckPlan selectZcCheckPlanByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		try {
			return ZcCheckPlanDao.selectByPrimaryKey(id);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			log.error(e);
			log.info("ZcCheckPlanServiceImpl selectZcCheckPlanByPrimaryKey failed!");
		}
		return null;
	}

	public int updateZcCheckPlanByPrimaryKeySelective(ZcCheckPlan record) {
		// TODO Auto-generated method stub
		try {
			return ZcCheckPlanDao.updateByPrimaryKeySelective(record);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			log.error(e);
			log.info("ZcCheckPlanServiceImpl updateZcCheckPlanByPrimaryKeySelective failed!");
		}
		return -1;
	}

	public int updateZcCheckPlanByPrimaryKey(ZcCheckPlan record) {
		// TODO Auto-generated method stub
		try {
			return ZcCheckPlanDao.updateByPrimaryKey(record);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			log.error(e);
			log.info("ZcCheckPlanServiceImpl updateZcCheckPlanByPrimaryKey failed!");
		}
		return -1;
	}

	public List<ZcCheckPlan> selectZcCheckPlanByPage(BaseVo page) {
		try {
			RowBounds rb = new RowBounds(page.getiDisplayStart(), page.getiDisplayLength());
			return ZcCheckPlanDao.selectListByPage(page,rb);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			log.error(e);
			log.info("ZcCheckPlanServiceImpl selectZcCheckPlanByPage failed!");
		}
		return null;
	}

	public int selectZcCheckPlanCount(BaseVo page) {
		  try {
				return ZcCheckPlanDao.selectListCount(page);
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			         log.error(e);
				log.info("ZcCheckPlanServiceImpl selectZcCheckPlanCount failed!");
			}
			  
			  return -1;
	}
}
