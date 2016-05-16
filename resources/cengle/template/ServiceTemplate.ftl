package ${bussPackage}.service#if($!entityPackage).${entityPackage}#end;


import java.util.List;
import com.hxd.vo.BaseVo;
import org.apache.ibatis.session.RowBounds;

import ${bussPackage}.bean.${className};

/**
 * 
 * <br>
 * <b>功能：</b>${className}Service<br>
 */
public interface ${className}Service{

    String SERVICE_NAME = "${className}Service";
	
    int insert${className}(${className} record);

    int insert${className}Selective(${className} record);

    ${className} select${className}ByPrimaryKey(Integer id);

    int delete${className}ByPrimaryKey(Integer id);

    int delete${className}ByBatch(List<String> ids);

    int update${className}ByPrimaryKeySelective(${className} record);

    int update${className}ByPrimaryKey(${className} record);
    
    List<${className}> select${className}ByPage(BaseVo page);
    
    int select${className}Count(BaseVo page);

}
