package com.hxd.test;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

import com.hxd.bean.ZcIn;
import com.hxd.vo.ZcInVo;
import com.hxd.service.ZcInService;
import com.hxd.dao.ZcInMapper;



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
public class ZcInServiceTest {
	private static Object id;
	@Autowired
	private ZcInService zcInService;
	

	@Test
	public void testAdd(){
		try {
			ZcIn zcIn = new ZcIn();
			zcInService.insertZcIn(zcIn);
			id = zcIn.getId();
			System.out.println("-testAdd-----id---------"+id);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Test
	public void testList(){
		try {
			ZcInVo zcInVo = new ZcInVo();
			zcInVo.setiDisplayLength(zcInService.selectZcInCount(zcInVo));
			List<ZcIn> zcInList = zcInService.selectZcInByPage(zcInVo);
			System.out.println("返回总条数："+zcInList.size());
			for(ZcIn e : zcInList){
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
			zcInService.deleteZcInByPrimaryKey((Integer)id);
			System.out.println("---testDel-----------");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
