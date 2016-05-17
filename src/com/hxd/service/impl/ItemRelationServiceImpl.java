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

import com.hxd.bean.ItemRelation;
import com.hxd.dao.ItemRelationMapper;
import com.hxd.service.ItemRelationService;
import com.hxd.vo.BaseVo;

/**
 * 
 * <br>
 * <b>功能：</b>ItemRelationService<br>
 */
	
@Transactional(rollbackFor = Exception.class)
@Service(ItemRelationService.SERVICE_NAME)
public class ItemRelationServiceImpl implements ItemRelationService {

	@Autowired
	ItemRelationMapper ItemRelationDao;
	
	private Log log = LogFactory.getLog(ItemRelationServiceImpl.class);
	
	

	public int insertItemRelation(ItemRelation record) {
		// TODO Auto-generated method stub
		try {
			return ItemRelationDao.insert(record);
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			log.error(e);
			log.info("ItemRelationServiceImpl insertItemRelation failed!");
		}
		return -1;
	}

	public int insertItemRelationSelective(ItemRelation record) {
		try {
			return ItemRelationDao.insertSelective(record);
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			log.error(e);
			log.info("ItemRelationServiceImpl insertItemRelationSelective failed!");
		}
		// TODO Auto-generated method stub
		return -1;
	}

	public int deleteItemRelationByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		try {
			return ItemRelationDao.deleteByPrimaryKey(id);
		} catch (Exception e) {
			// TODO: handle exception
			log.error(e);
			e.printStackTrace();
			log.info("ItemRelationServiceImpl deleteItemRelationByPrimaryKey failed!");
		}
		return -1;
	}

	public int deleteItemRelationByBatch(List<String> ids) {
		// TODO Auto-generated method stub
		try {
			List<Integer> idList = new ArrayList<Integer>();

			for (String idString : ids) {
				idList.add(Integer.parseInt(idString));
			}
			return ItemRelationDao.deleteByBatch(idList);
		} catch (Exception e) {
			log.error(e);
			e.printStackTrace();
			log.info("ItemRelationServiceImpl deleteItemRelationByPrimaryKey failed!");
		}
		return -1;
	}

	public ItemRelation selectItemRelationByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		try {
			return ItemRelationDao.selectByPrimaryKey(id);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			log.error(e);
			log.info("ItemRelationServiceImpl selectItemRelationByPrimaryKey failed!");
		}
		return null;
	}

	public int updateItemRelationByPrimaryKeySelective(ItemRelation record) {
		// TODO Auto-generated method stub
		try {
			return ItemRelationDao.updateByPrimaryKeySelective(record);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			log.error(e);
			log.info("ItemRelationServiceImpl updateItemRelationByPrimaryKeySelective failed!");
		}
		return -1;
	}

	public int updateItemRelationByPrimaryKey(ItemRelation record) {
		// TODO Auto-generated method stub
		try {
			return ItemRelationDao.updateByPrimaryKey(record);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			log.error(e);
			log.info("ItemRelationServiceImpl updateItemRelationByPrimaryKey failed!");
		}
		return -1;
	}

	public List<ItemRelation> selectItemRelationByPage(BaseVo page) {
		try {
			RowBounds rb = new RowBounds(page.getiDisplayStart(), page.getiDisplayLength());
			return ItemRelationDao.selectListByPage(page,rb);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			log.error(e);
			log.info("ItemRelationServiceImpl selectItemRelationByPage failed!");
		}
		return null;
	}

	public int selectItemRelationCount(BaseVo page) {
		  try {
				return ItemRelationDao.selectListCount(page);
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			         log.error(e);
				log.info("ItemRelationServiceImpl selectItemRelationCount failed!");
			}
			  
			  return -1;
	}
}
