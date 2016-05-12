package com.hxd.controller;

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
import com.hxd.bean.CarInfo;
 import com.hxd.service.CarInfoService;
/**
 * 
 * <br>
 * <b>功能：</b>CarInfoController<br>
 *   <br>
 */ 
@Controller
public class CarInfoController extends BaseController{
	
	private final static Logger log= Logger.getLogger(CarInfoController.class);
	@Autowired
	private CarInfoService carInfoService; 
	
	
	
	/**
	 * 
	 * @param page
	 * @param request
	 * @param response
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/CarInfo/list") 
	public String getList (HttpServletRequest request, HttpServletResponse response) throws Exception{
	    
		return null; 
	}
	
	

}
