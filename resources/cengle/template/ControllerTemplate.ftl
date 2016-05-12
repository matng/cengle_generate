package ${bussPackage}.controller;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.base.web.BaseController;
import com.base.util.PageUtil;
import com.base.criteria.Criteria;
import com.base.web.JModelAndView;
import ${bussPackage}.bean#if($!entityPackage).${entityPackage}#end.${className};
 import ${bussPackage}.service#if($!entityPackage).${entityPackage}#end.${className}Service;
/**
 * 
 * <br>
 * <b>功能：</b>${className}Controller<br>
 *   <br>
 */ 
@Controller
public class ${className}Controller extends BaseController{
	
	private final static Logger log= Logger.getLogger(${className}Controller.class);
	@Autowired
	private ${className}Service ${lowerName}Service; 
	
	
	
	/**
	 * 
	 * @param page
	 * @param request
	 * @param response
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/${className}/list") 
	public String getList (HttpServletRequest request, HttpServletResponse response) throws Exception{
	    
		return null; 
	}
	
	

}
