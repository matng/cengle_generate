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

import com.hxd.bean.CompanyDept;
import com.hxd.dao.CompanyDeptMapper;
import com.hxd.service.CompanyDeptService;
import com.hxd.vo.BaseVo;

/**
 * 
 * <br>
 * <b>功能：</b>CompanyDeptService<br>
 */
	
@Transactional(rollbackFor = Exception.class)
@Service(CompanyDeptService.SERVICE_NAME)
public class CompanyDeptServiceImpl implements CompanyDeptService {

	@Autowired
	CompanyDeptMapper CompanyDeptDao;
	
	private Log log = LogFactory.getLog(CompanyDeptServiceImpl.class);
	
	

	public int insertCompanyDept(CompanyDept record) {
		// TODO Auto-generated method stub
		try {
			return CompanyDeptDao.insert(record);
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			log.error(e);
			log.info("CompanyDeptServiceImpl insertCompanyDept failed!");
		}
		return -1;
	}

	public int insertCompanyDeptSelective(CompanyDept record) {
		try {
			return CompanyDeptDao.insertSelective(record);
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			log.error(e);
			log.info("CompanyDeptServiceImpl insertCompanyDeptSelective failed!");
		}
		// TODO Auto-generated method stub
		return -1;
	}

	public int deleteCompanyDeptByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		try {
			return CompanyDeptDao.deleteByPrimaryKey(id);
		} catch (Exception e) {
			// TODO: handle exception
			log.error(e);
			e.printStackTrace();
			log.info("CompanyDeptServiceImpl deleteCompanyDeptByPrimaryKey failed!");
		}
		return -1;
	}

	public int deleteCompanyDeptByBatch(List<String> ids) {
		// TODO Auto-generated method stub
		try {
			List<Integer> idList = new ArrayList<Integer>();

			for (String idString : ids) {
				idList.add(Integer.parseInt(idString));
			}
			return CompanyDeptDao.deleteByBatch(idList);
		} catch (Exception e) {
			log.error(e);
			e.printStackTrace();
			log.info("CompanyDeptServiceImpl deleteCompanyDeptByPrimaryKey failed!");
		}
		return -1;
	}

	public CompanyDept selectCompanyDeptByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		try {
			return CompanyDeptDao.selectByPrimaryKey(id);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			log.error(e);
			log.info("CompanyDeptServiceImpl selectCompanyDeptByPrimaryKey failed!");
		}
		return null;
	}

	public int updateCompanyDeptByPrimaryKeySelective(CompanyDept record) {
		// TODO Auto-generated method stub
		try {
			return CompanyDeptDao.updateByPrimaryKeySelective(record);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			log.error(e);
			log.info("CompanyDeptServiceImpl updateCompanyDeptByPrimaryKeySelective failed!");
		}
		return -1;
	}

	public int updateCompanyDeptByPrimaryKey(CompanyDept record) {
		// TODO Auto-generated method stub
		try {
			return CompanyDeptDao.updateByPrimaryKey(record);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			log.error(e);
			log.info("CompanyDeptServiceImpl updateCompanyDeptByPrimaryKey failed!");
		}
		return -1;
	}

	public List<CompanyDept> selectCompanyDeptByPage(BaseVo page) {
		try {
			RowBounds rb = new RowBounds(page.getiDisplayStart(), page.getiDisplayLength());
			return CompanyDeptDao.selectListByPage(page,rb);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			log.error(e);
			log.info("CompanyDeptServiceImpl selectCompanyDeptByPage failed!");
		}
		return null;
	}

	public int selectCompanyDeptCount(BaseVo page) {
		  try {
				return CompanyDeptDao.selectListCount(page);
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			         log.error(e);
				log.info("CompanyDeptServiceImpl selectCompanyDeptCount failed!");
			}
			  
			  return -1;
	}
}
