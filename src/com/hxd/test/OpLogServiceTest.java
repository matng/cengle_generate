package com.hxd.test;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

import com.hxd.bean.OpLog;
import com.hxd.vo.OpLogVo;
import com.hxd.service.OpLogService;
import com.hxd.dao.OpLogMapper;



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
public class OpLogServiceTest {
	private static Object id;
	@Autowired
	private OpLogService opLogService;
	

	@Test
	public void testAdd(){
		try {
			OpLog opLog = new OpLog();
			opLogService.insertOpLog(opLog);
			id = opLog.getId();
			System.out.println("-testAdd-----id---------"+id);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Test
	public void testList(){
		try {
			OpLogVo opLogVo = new OpLogVo();
			opLogVo.setiDisplayLength(opLogService.selectOpLogCount(opLogVo));
			List<OpLog> opLogList = opLogService.selectOpLogByPage(opLogVo);
			System.out.println("返回总条数："+opLogList.size());
			for(OpLog e : opLogList){
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
			opLogService.deleteOpLogByPrimaryKey((Integer)id);
			System.out.println("---testDel-----------");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
