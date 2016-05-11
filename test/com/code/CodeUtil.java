package com.code;

import codeGenerate.def.FtlDef;
import codeGenerate.factory.CodeGenerateFactory;
/**
 * 
 * @author lintu5.com
 *
 */

public class CodeUtil {

/*	public static void main(String[] args) {
		 *//** 此处修改成你的 表名 和 中文注释***//*
		 String tableName="comic"; //
		 String codeName ="漫画";//中文注释  当然你用英文也是可以的 
		 String entityPackage ="admin";//实体包
		 String keyType = FtlDef.KEY_TYPE_02;//主键生成方式 01:UUID  02:自增
		CodeGenerateFactory.codeGenerate(tableName, codeName,entityPackage,keyType);
	}
	*/
	public static void main(String[] args) {
		String[] tabName = {"carInfo","rent"};
		String[] comment = {"车辆信息表","租借信息表"};
		for (int i = 0; i < tabName.length; i++) {
			config(tabName[i],comment[i]);
		}
		
	}

	private static void config(String tableName, String comment) {
		/** 此处修改成你的 表名 和 中文注释***/
		// String tableName="matng"; //
		// String codeName ="测试表";//中文注释  当然你用英文也是可以的 
		 String entityPackage = tableName;//实体包
		 String keyType = FtlDef.KEY_TYPE_02;//主键生成方式 01:UUID  02:自增
		CodeGenerateFactory.codeGenerate(tableName, comment,entityPackage,keyType);
	}
	
	
}
