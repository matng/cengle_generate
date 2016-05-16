package ${bussPackage}.controller;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.alibaba.fastjson.JSON;

import com.hxd.util.StrUtil;
import com.hxd.vo.PageData;
import com.hxd.vo.StatusVo;
import ${bussPackage}.bean#if($!entityPackage).${entityPackage}#end.${className};
import ${bussPackage}.vo#if($!entityPackage).${entityPackage}#end.${className}Vo;
 import ${bussPackage}.service#if($!entityPackage).${entityPackage}#end.${className}Service;
/**
 * 
 * <br>
 * <b>功能：</b>${className}Controller<br>
 *   <br>
 */ 
@Controller
@RequestMapping("/${lowerName}")
public class ${className}Controller extends BaseController{
	
	private final static Logger log= Logger.getLogger(${className}Controller.class);

	@Autowired
	private ${className}Service ${lowerName}Service; 
	
	/**
	 * 
	 * @param model
	 * @param req
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/${lowerName}View")
	public String home(Model model,HttpServletRequest req) {
		return "/jsp/";
	}
	
	
	/**
	 * 
	 * @param page
	 * @param request
	 * @param response
	 * @return
	 * @throws Exception
	 */
	@ResponseBody
	@RequestMapping(value = "/${lowerName}List", produces = {"application/json;charset=UTF-8"})
	public String get${className}List (HttpServletRequest req,${className}Vo vo) throws Exception{
	    	String json = null;
		try {
			List<${className}> list = ${lowerName}Service.select${className}ByPage(vo);
			int totalCount = ${lowerName}Service.select${className}Count(vo);
		
			//返回json数据给界面
			PageData data =new PageData();
			data.setsEcho(vo.getsEcho());
			data.setiTotalRecords(totalCount);
			data.setiTotalDisplayRecords(totalCount);
			log.debug("list.size:"+list.size());
			data.setAaData(StrUtil.toJsonStrWithFixed(list));
			json = StrUtil.toJsonStrWithFixed(data);
		} catch (Exception e) {
			log.error(e);
		}
		return json;
	}
	
	@RequestMapping(value = "/save", produces = {"application/json;charset=UTF-8"})
	@ResponseBody
	public String save(@RequestBody String json) {
		StatusVo sta = new StatusVo();
		try {
			log.debug("---json---:"+json);	
			${className} ${lowerName} = JSON.parseObject(json,${className}.class);
			
			int i = ${lowerName}Service.insert${className}(${lowerName});
				
			if (i > 0) {
				//返回结果json数据给界面		
				sta.setSuccess(this.getMessage("op.success"));	
			} else {
				sta.setError(this.getMessage("op.fail"));
			}		
			
		} catch (Exception e) {
			log.error(e);
			sta.setError(this.getMessage("op.fail")+"\r\n"+e.getMessage());
			return StrUtil.toJsonStrWithFixed(sta);
		}
		log.debug("---status---"+StrUtil.toJsonStrWithFixed(sta));
		return StrUtil.toJsonStrWithFixed(sta);
	}

}
