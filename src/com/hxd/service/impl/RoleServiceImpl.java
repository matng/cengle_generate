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

import com.hxd.bean.Role;
import com.hxd.dao.RoleMapper;
import com.hxd.service.RoleService;
import com.hxd.vo.BaseVo;

/**
 * 
 * <br>
 * <b>功能：</b>RoleService<br>
 */
	
@Transactional(rollbackFor = Exception.class)
@Service(RoleService.SERVICE_NAME)
public class RoleServiceImpl implements RoleService {

	@Autowired
	RoleMapper RoleDao;
	
	private Log log = LogFactory.getLog(RoleServiceImpl.class);
	
	

	public int insertRole(Role record) {
		// TODO Auto-generated method stub
		try {
			return RoleDao.insert(record);
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			log.error(e);
			log.info("RoleServiceImpl insertRole failed!");
		}
		return -1;
	}

	public int insertRoleSelective(Role record) {
		try {
			return RoleDao.insertSelective(record);
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			log.error(e);
			log.info("RoleServiceImpl insertRoleSelective failed!");
		}
		// TODO Auto-generated method stub
		return -1;
	}

	public int deleteRoleByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		try {
			return RoleDao.deleteByPrimaryKey(id);
		} catch (Exception e) {
			// TODO: handle exception
			log.error(e);
			e.printStackTrace();
			log.info("RoleServiceImpl deleteRoleByPrimaryKey failed!");
		}
		return -1;
	}

	public int deleteRoleByBatch(List<String> ids) {
		// TODO Auto-generated method stub
		try {
			List<Integer> idList = new ArrayList<Integer>();

			for (String idString : ids) {
				idList.add(Integer.parseInt(idString));
			}
			return RoleDao.deleteByBatch(idList);
		} catch (Exception e) {
			log.error(e);
			e.printStackTrace();
			log.info("RoleServiceImpl deleteRoleByPrimaryKey failed!");
		}
		return -1;
	}

	public Role selectRoleByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		try {
			return RoleDao.selectByPrimaryKey(id);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			log.error(e);
			log.info("RoleServiceImpl selectRoleByPrimaryKey failed!");
		}
		return null;
	}

	public int updateRoleByPrimaryKeySelective(Role record) {
		// TODO Auto-generated method stub
		try {
			return RoleDao.updateByPrimaryKeySelective(record);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			log.error(e);
			log.info("RoleServiceImpl updateRoleByPrimaryKeySelective failed!");
		}
		return -1;
	}

	public int updateRoleByPrimaryKey(Role record) {
		// TODO Auto-generated method stub
		try {
			return RoleDao.updateByPrimaryKey(record);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			log.error(e);
			log.info("RoleServiceImpl updateRoleByPrimaryKey failed!");
		}
		return -1;
	}

	public List<Role> selectRoleByPage(BaseVo page) {
		try {
			RowBounds rb = new RowBounds(page.getiDisplayStart(), page.getiDisplayLength());
			return RoleDao.selectListByPage(page,rb);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			log.error(e);
			log.info("RoleServiceImpl selectRoleByPage failed!");
		}
		return null;
	}

	public int selectRoleCount(BaseVo page) {
		  try {
				return RoleDao.selectListCount(page);
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			         log.error(e);
				log.info("RoleServiceImpl selectRoleCount failed!");
			}
			  
			  return -1;
	}
}
