package ${bussPackage}.service.impl#if($!entityPackage).${entityPackage}#end;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hxd.bean.${className};
import com.hxd.dao.${className}Mapper;
import com.hxd.service.${className}Service;
import com.hxd.vo.BaseVo;

/**
 * 
 * <br>
 * <b>功能：</b>${className}Service<br>
 */
	
@Transactional(rollbackFor = Exception.class)
@Service(${className}Service.SERVICE_NAME)
public class ${className}ServiceImpl implements ${className}Service {

	@Autowired
	${className}Mapper ${className}Dao;
	
	private Log log = LogFactory.getLog(${className}ServiceImpl.class);
	
	

	public int insert${className}(${className} record) {
		// TODO Auto-generated method stub
		try {
			return ${className}Dao.insert(record);
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			log.error(e);
			log.info("${className}ServiceImpl insert${className} failed!");
		}
		return -1;
	}

	public int insert${className}Selective(${className} record) {
		try {
			return ${className}Dao.insertSelective(record);
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			log.error(e);
			log.info("${className}ServiceImpl insert${className}Selective failed!");
		}
		// TODO Auto-generated method stub
		return -1;
	}

	public int delete${className}ByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		try {
			return ${className}Dao.deleteByPrimaryKey(id);
		} catch (Exception e) {
			// TODO: handle exception
			log.error(e);
			e.printStackTrace();
			log.info("${className}ServiceImpl delete${className}ByPrimaryKey failed!");
		}
		return -1;
	}

	public int delete${className}ByBatch(List<String> ids) {
		// TODO Auto-generated method stub
		try {
			List<Integer> idList = new ArrayList<Integer>();

			for (String idString : ids) {
				idList.add(Integer.parseInt(idString));
			}
			return ${className}Dao.deleteByBatch(idList);
		} catch (Exception e) {
			log.error(e);
			e.printStackTrace();
			log.info("${className}ServiceImpl delete${className}ByPrimaryKey failed!");
		}
		return -1;
	}

	public ${className} select${className}ByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		try {
			return ${className}Dao.selectByPrimaryKey(id);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			log.error(e);
			log.info("${className}ServiceImpl select${className}ByPrimaryKey failed!");
		}
		return null;
	}

	public int update${className}ByPrimaryKeySelective(${className} record) {
		// TODO Auto-generated method stub
		try {
			return ${className}Dao.updateByPrimaryKeySelective(record);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			log.error(e);
			log.info("${className}ServiceImpl update${className}ByPrimaryKeySelective failed!");
		}
		return -1;
	}

	public int update${className}ByPrimaryKey(${className} record) {
		// TODO Auto-generated method stub
		try {
			return ${className}Dao.updateByPrimaryKey(record);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			log.error(e);
			log.info("${className}ServiceImpl update${className}ByPrimaryKey failed!");
		}
		return -1;
	}

	public List<${className}> select${className}ByPage(BaseVo page) {
		try {
			RowBounds rb = new RowBounds(page.getiDisplayStart(), page.getiDisplayLength());
			return ${className}Dao.selectListByPage(page,rb);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			log.error(e);
			log.info("${className}ServiceImpl select${className}ByPage failed!");
		}
		return null;
	}

	public int select${className}Count(BaseVo page) {
		  try {
				return ${className}Dao.selectListCount(page);
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			         log.error(e);
				log.info("${className}ServiceImpl select${className}Count failed!");
			}
			  
			  return -1;
	}
}
