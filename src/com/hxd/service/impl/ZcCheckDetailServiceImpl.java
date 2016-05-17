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

import com.hxd.bean.ZcCheckDetail;
import com.hxd.dao.ZcCheckDetailMapper;
import com.hxd.service.ZcCheckDetailService;
import com.hxd.vo.BaseVo;

/**
 * 
 * <br>
 * <b>功能：</b>ZcCheckDetailService<br>
 */
	
@Transactional(rollbackFor = Exception.class)
@Service(ZcCheckDetailService.SERVICE_NAME)
public class ZcCheckDetailServiceImpl implements ZcCheckDetailService {

	@Autowired
	ZcCheckDetailMapper ZcCheckDetailDao;
	
	private Log log = LogFactory.getLog(ZcCheckDetailServiceImpl.class);
	
	

	public int insertZcCheckDetail(ZcCheckDetail record) {
		// TODO Auto-generated method stub
		try {
			return ZcCheckDetailDao.insert(record);
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			log.error(e);
			log.info("ZcCheckDetailServiceImpl insertZcCheckDetail failed!");
		}
		return -1;
	}

	public int insertZcCheckDetailSelective(ZcCheckDetail record) {
		try {
			return ZcCheckDetailDao.insertSelective(record);
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			log.error(e);
			log.info("ZcCheckDetailServiceImpl insertZcCheckDetailSelective failed!");
		}
		// TODO Auto-generated method stub
		return -1;
	}

	public int deleteZcCheckDetailByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		try {
			return ZcCheckDetailDao.deleteByPrimaryKey(id);
		} catch (Exception e) {
			// TODO: handle exception
			log.error(e);
			e.printStackTrace();
			log.info("ZcCheckDetailServiceImpl deleteZcCheckDetailByPrimaryKey failed!");
		}
		return -1;
	}

	public int deleteZcCheckDetailByBatch(List<String> ids) {
		// TODO Auto-generated method stub
		try {
			List<Integer> idList = new ArrayList<Integer>();

			for (String idString : ids) {
				idList.add(Integer.parseInt(idString));
			}
			return ZcCheckDetailDao.deleteByBatch(idList);
		} catch (Exception e) {
			log.error(e);
			e.printStackTrace();
			log.info("ZcCheckDetailServiceImpl deleteZcCheckDetailByPrimaryKey failed!");
		}
		return -1;
	}

	public ZcCheckDetail selectZcCheckDetailByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		try {
			return ZcCheckDetailDao.selectByPrimaryKey(id);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			log.error(e);
			log.info("ZcCheckDetailServiceImpl selectZcCheckDetailByPrimaryKey failed!");
		}
		return null;
	}

	public int updateZcCheckDetailByPrimaryKeySelective(ZcCheckDetail record) {
		// TODO Auto-generated method stub
		try {
			return ZcCheckDetailDao.updateByPrimaryKeySelective(record);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			log.error(e);
			log.info("ZcCheckDetailServiceImpl updateZcCheckDetailByPrimaryKeySelective failed!");
		}
		return -1;
	}

	public int updateZcCheckDetailByPrimaryKey(ZcCheckDetail record) {
		// TODO Auto-generated method stub
		try {
			return ZcCheckDetailDao.updateByPrimaryKey(record);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			log.error(e);
			log.info("ZcCheckDetailServiceImpl updateZcCheckDetailByPrimaryKey failed!");
		}
		return -1;
	}

	public List<ZcCheckDetail> selectZcCheckDetailByPage(BaseVo page) {
		try {
			RowBounds rb = new RowBounds(page.getiDisplayStart(), page.getiDisplayLength());
			return ZcCheckDetailDao.selectListByPage(page,rb);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			log.error(e);
			log.info("ZcCheckDetailServiceImpl selectZcCheckDetailByPage failed!");
		}
		return null;
	}

	public int selectZcCheckDetailCount(BaseVo page) {
		  try {
				return ZcCheckDetailDao.selectListCount(page);
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			         log.error(e);
				log.info("ZcCheckDetailServiceImpl selectZcCheckDetailCount failed!");
			}
			  
			  return -1;
	}
}
