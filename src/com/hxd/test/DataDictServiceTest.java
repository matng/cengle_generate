package com.hxd.test;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

import com.hxd.bean.DataDict;
import com.hxd.vo.DataDictVo;
import com.hxd.service.DataDictService;
import com.hxd.dao.DataDictMapper;



/*
 * @TransactionConfiguration(transactionManager="transactionManager",defaultRollback=true) 
 * transactionManager的默认取值是"transactionManager"，
 * defaultRollback的默认取值是true，当然，你也可以改成false。
 * true表示测试不会对数据库造成污染,false的话当然就会改动到数据库中了。
 * 在方法名上添加@Rollback(false)表示这个测试用例不需要回滚。
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:config/*.xml")
@TransactionConfiguration(defaultRollback = false)
@Transactional
public class DataDictServiceTest {
	private static Object id;
	@Autowired
	private DataDictService dataDictService;
	

	@Test
	public void testAdd(){
		try {
			DataDict dataDict = new DataDict();
			dataDictService.insertDataDict(dataDict);
			id = dataDict.getId();
			System.out.println("-testAdd-----id---------"+id);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Test
	public void testList(){
		try {
			DataDictVo dataDictVo = new DataDictVo();
			dataDictVo.setiDisplayLength(dataDictService.selectDataDictCount(dataDictVo));
			List<DataDict> dataDictList = dataDictService.selectDataDictByPage(dataDictVo);
			System.out.println("返回总条数："+dataDictList.size());
			for(DataDict e : dataDictList){
				System.out.println(e.getId());
			}
			System.out.println("----testList----------");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Test
	public void testDel(){
		try {
			dataDictService.deleteDataDictByPrimaryKey((Integer)id);
			System.out.println("---testDel-----------");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
