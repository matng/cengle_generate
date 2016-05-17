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

import com.hxd.bean.DataDict;
import com.hxd.dao.DataDictMapper;
import com.hxd.service.DataDictService;
import com.hxd.vo.BaseVo;

/**
 * 
 * <br>
 * <b>功能：</b>DataDictService<br>
 */
	
@Transactional(rollbackFor = Exception.class)
@Service(DataDictService.SERVICE_NAME)
public class DataDictServiceImpl implements DataDictService {

	@Autowired
	DataDictMapper DataDictDao;
	
	private Log log = LogFactory.getLog(DataDictServiceImpl.class);
	
	

	public int insertDataDict(DataDict record) {
		// TODO Auto-generated method stub
		try {
			return DataDictDao.insert(record);
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			log.error(e);
			log.info("DataDictServiceImpl insertDataDict failed!");
		}
		return -1;
	}

	public int insertDataDictSelective(DataDict record) {
		try {
			return DataDictDao.insertSelective(record);
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			log.error(e);
			log.info("DataDictServiceImpl insertDataDictSelective failed!");
		}
		// TODO Auto-generated method stub
		return -1;
	}

	public int deleteDataDictByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		try {
			return DataDictDao.deleteByPrimaryKey(id);
		} catch (Exception e) {
			// TODO: handle exception
			log.error(e);
			e.printStackTrace();
			log.info("DataDictServiceImpl deleteDataDictByPrimaryKey failed!");
		}
		return -1;
	}

	public int deleteDataDictByBatch(List<String> ids) {
		// TODO Auto-generated method stub
		try {
			List<Integer> idList = new ArrayList<Integer>();

			for (String idString : ids) {
				idList.add(Integer.parseInt(idString));
			}
			return DataDictDao.deleteByBatch(idList);
		} catch (Exception e) {
			log.error(e);
			e.printStackTrace();
			log.info("DataDictServiceImpl deleteDataDictByPrimaryKey failed!");
		}
		return -1;
	}

	public DataDict selectDataDictByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		try {
			return DataDictDao.selectByPrimaryKey(id);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			log.error(e);
			log.info("DataDictServiceImpl selectDataDictByPrimaryKey failed!");
		}
		return null;
	}

	public int updateDataDictByPrimaryKeySelective(DataDict record) {
		// TODO Auto-generated method stub
		try {
			return DataDictDao.updateByPrimaryKeySelective(record);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			log.error(e);
			log.info("DataDictServiceImpl updateDataDictByPrimaryKeySelective failed!");
		}
		return -1;
	}

	public int updateDataDictByPrimaryKey(DataDict record) {
		// TODO Auto-generated method stub
		try {
			return DataDictDao.updateByPrimaryKey(record);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			log.error(e);
			log.info("DataDictServiceImpl updateDataDictByPrimaryKey failed!");
		}
		return -1;
	}

	public List<DataDict> selectDataDictByPage(BaseVo page) {
		try {
			RowBounds rb = new RowBounds(page.getiDisplayStart(), page.getiDisplayLength());
			return DataDictDao.selectListByPage(page,rb);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			log.error(e);
			log.info("DataDictServiceImpl selectDataDictByPage failed!");
		}
		return null;
	}

	public int selectDataDictCount(BaseVo page) {
		  try {
				return DataDictDao.selectListCount(page);
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			         log.error(e);
				log.info("DataDictServiceImpl selectDataDictCount failed!");
			}
			  
			  return -1;
	}
}
