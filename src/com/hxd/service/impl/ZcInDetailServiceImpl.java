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

import com.hxd.bean.ZcInDetail;
import com.hxd.dao.ZcInDetailMapper;
import com.hxd.service.ZcInDetailService;
import com.hxd.vo.BaseVo;

/**
 * 
 * <br>
 * <b>功能：</b>ZcInDetailService<br>
 */
	
@Transactional(rollbackFor = Exception.class)
@Service(ZcInDetailService.SERVICE_NAME)
public class ZcInDetailServiceImpl implements ZcInDetailService {

	@Autowired
	ZcInDetailMapper ZcInDetailDao;
	
	private Log log = LogFactory.getLog(ZcInDetailServiceImpl.class);
	
	

	public int insertZcInDetail(ZcInDetail record) {
		// TODO Auto-generated method stub
		try {
			return ZcInDetailDao.insert(record);
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			log.error(e);
			log.info("ZcInDetailServiceImpl insertZcInDetail failed!");
		}
		return -1;
	}

	public int insertZcInDetailSelective(ZcInDetail record) {
		try {
			return ZcInDetailDao.insertSelective(record);
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			log.error(e);
			log.info("ZcInDetailServiceImpl insertZcInDetailSelective failed!");
		}
		// TODO Auto-generated method stub
		return -1;
	}

	public int deleteZcInDetailByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		try {
			return ZcInDetailDao.deleteByPrimaryKey(id);
		} catch (Exception e) {
			// TODO: handle exception
			log.error(e);
			e.printStackTrace();
			log.info("ZcInDetailServiceImpl deleteZcInDetailByPrimaryKey failed!");
		}
		return -1;
	}

	public int deleteZcInDetailByBatch(List<String> ids) {
		// TODO Auto-generated method stub
		try {
			List<Integer> idList = new ArrayList<Integer>();

			for (String idString : ids) {
				idList.add(Integer.parseInt(idString));
			}
			return ZcInDetailDao.deleteByBatch(idList);
		} catch (Exception e) {
			log.error(e);
			e.printStackTrace();
			log.info("ZcInDetailServiceImpl deleteZcInDetailByPrimaryKey failed!");
		}
		return -1;
	}

	public ZcInDetail selectZcInDetailByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		try {
			return ZcInDetailDao.selectByPrimaryKey(id);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			log.error(e);
			log.info("ZcInDetailServiceImpl selectZcInDetailByPrimaryKey failed!");
		}
		return null;
	}

	public int updateZcInDetailByPrimaryKeySelective(ZcInDetail record) {
		// TODO Auto-generated method stub
		try {
			return ZcInDetailDao.updateByPrimaryKeySelective(record);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			log.error(e);
			log.info("ZcInDetailServiceImpl updateZcInDetailByPrimaryKeySelective failed!");
		}
		return -1;
	}

	public int updateZcInDetailByPrimaryKey(ZcInDetail record) {
		// TODO Auto-generated method stub
		try {
			return ZcInDetailDao.updateByPrimaryKey(record);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			log.error(e);
			log.info("ZcInDetailServiceImpl updateZcInDetailByPrimaryKey failed!");
		}
		return -1;
	}

	public List<ZcInDetail> selectZcInDetailByPage(BaseVo page) {
		try {
			RowBounds rb = new RowBounds(page.getiDisplayStart(), page.getiDisplayLength());
			return ZcInDetailDao.selectListByPage(page,rb);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			log.error(e);
			log.info("ZcInDetailServiceImpl selectZcInDetailByPage failed!");
		}
		return null;
	}

	public int selectZcInDetailCount(BaseVo page) {
		  try {
				return ZcInDetailDao.selectListCount(page);
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			         log.error(e);
				log.info("ZcInDetailServiceImpl selectZcInDetailCount failed!");
			}
			  
			  return -1;
	}
}
