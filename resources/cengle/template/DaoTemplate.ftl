package ${bussPackage}.dao#if($!entityPackage).${entityPackage}#end;

import java.util.List;
import com.hxd.vo.BaseVo;
import org.apache.ibatis.session.RowBounds;

import ${bussPackage}.bean.${className};
/**
 * 
 * <br>
 * <b>功能：</b>${className}Mapper<br>
 */
public interface ${className}Mapper {

    int deleteByPrimaryKey(Integer id);

    int insert(${className} record);

    int insertSelective(${className} record);

    ${className} selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(${className} record);

    int updateByPrimaryKey(${className} record);
    
    List<${className}> query${className}ListByPage(BaseVo page,RowBounds rb);
    
    int query${className}ListCount(BaseVo page);
	
}
