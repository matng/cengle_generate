package com.hxd.test;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

import com.hxd.bean.ZcInItem;
import com.hxd.vo.ZcInItemVo;
import com.hxd.service.ZcInItemService;
import com.hxd.dao.ZcInItemMapper;



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
public class ZcInItemServiceTest {
	private static Object id;
	@Autowired
	private ZcInItemService zcInItemService;
	

	@Test
	public void testAdd(){
		try {
			ZcInItem zcInItem = new ZcInItem();
			zcInItemService.insertZcInItem(zcInItem);
			id = zcInItem.getId();
			System.out.println("-testAdd-----id---------"+id);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Test
	public void testList(){
		try {
			ZcInItemVo zcInItemVo = new ZcInItemVo();
			zcInItemVo.setiDisplayLength(zcInItemService.selectZcInItemCount(zcInItemVo));
			List<ZcInItem> zcInItemList = zcInItemService.selectZcInItemByPage(zcInItemVo);
			System.out.println("返回总条数："+zcInItemList.size());
			for(ZcInItem e : zcInItemList){
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
			zcInItemService.deleteZcInItemByPrimaryKey((Integer)id);
			System.out.println("---testDel-----------");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
