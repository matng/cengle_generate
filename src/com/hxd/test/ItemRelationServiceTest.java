package com.hxd.test;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

import com.hxd.bean.ItemRelation;
import com.hxd.vo.ItemRelationVo;
import com.hxd.service.ItemRelationService;
import com.hxd.dao.ItemRelationMapper;



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
public class ItemRelationServiceTest {
	private static Object id;
	@Autowired
	private ItemRelationService itemRelationService;
	

	@Test
	public void testAdd(){
		try {
			ItemRelation itemRelation = new ItemRelation();
			itemRelationService.insertItemRelation(itemRelation);
			id = itemRelation.getId();
			System.out.println("-testAdd-----id---------"+id);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Test
	public void testList(){
		try {
			ItemRelationVo itemRelationVo = new ItemRelationVo();
			itemRelationVo.setiDisplayLength(itemRelationService.selectItemRelationCount(itemRelationVo));
			List<ItemRelation> itemRelationList = itemRelationService.selectItemRelationByPage(itemRelationVo);
			System.out.println("返回总条数："+itemRelationList.size());
			for(ItemRelation e : itemRelationList){
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
			itemRelationService.deleteItemRelationByPrimaryKey((Integer)id);
			System.out.println("---testDel-----------");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
