package ${bussPackage}.vo#if($!entityPackage).${entityPackage}#end;

import java.util.List;
${types}
/**
 * 
 * <br>
 * <b>功能：</b>${className}Bean<br>
 */
public class ${className}Vo extends BaseVo{
	
	private List<String> idList;
	${feilds}
	public List<String> getIdList() {
		return idList;
	}

	public void setIdList(List<String> idList) {
		this.idList = idList;
	}
}

