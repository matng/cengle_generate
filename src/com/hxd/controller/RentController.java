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
import com.hxd.bean.Rent;
 import com.hxd.service.RentService;
/**
 * 
 * <br>
 * <b>功能：</b>RentController<br>
 *   <br>
 */ 
@Controller
public class RentController extends BaseController{
	
	private final static Logger log= Logger.getLogger(RentController.class);
	@Autowired
	private RentService rentService; 
	
	
	
	/**
	 * 
	 * @param page
	 * @param request
	 * @param response
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/Rent/list") 
	public String getList (HttpServletRequest request, HttpServletResponse response) throws Exception{
	    
		return null; 
	}
	
	

}
