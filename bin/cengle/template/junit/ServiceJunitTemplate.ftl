package cengle.service;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

import ${bussPackage}.bean.${className};
import ${bussPackage}.vo.${className}Vo;
import ${bussPackage}.service.${className}Service;
import ${bussPackage}.dao.${className}Mapper;



/*
 * @TransactionConfiguration(transactionManager="transactionManager",defaultRollback=true) 
 * transactionManager的默认取值是"transactionManager"，
 * defaultRollback的默认取值是true，当然，你也可以改成false。
 * true表示测试不会对数据库造成污染,false的话当然就会改动到数据库中了。
 * 在方法名上添加@Rollback(false)表示这个测试用例不需要回滚。
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:spring-*.xml")
@TransactionConfiguration(defaultRollback = false)
@Transactional
public class ${className}ServiceTest {
	private static Object id;
	@Autowired
	private ${className}Service $!{lowerName}Service;
	

	@Test
	public void testAdd(){
		try {
			${className} $!{lowerName} = new ${className}();
			$!{lowerName}Service.insert${className}Selective($!{lowerName});
			id = $!{lowerName}.getId();
			System.out.println("-testAdd-----id---------"+id);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Test
	public void testList(){
		try {
			${className}Vo $!{lowerName}Vo = new ${className}Vo();
			List<${className}> $!{lowerName}s = $!{lowerName}Service.query${className}ByList($!{lowerName}Page);
			for(${className} e:$!{lowerName}s){
				System.out.println(e.getName());
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
			$!{lowerName}Service.delete(id);
			System.out.println("---testDel-----------");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
