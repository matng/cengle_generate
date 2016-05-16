package com.hxd.controller;

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
import com.hxd.bean.CarInfo;
import com.hxd.vo.CarInfoVo;
 import com.hxd.service.CarInfoService;
/**
 * 
 * <br>
 * <b>功能：</b>CarInfoController<br>
 *   <br>
 */ 
@Controller
@RequestMapping("/carInfo")
public class CarInfoController extends BaseController{
	
	private final static Logger log= Logger.getLogger(CarInfoController.class);

	@Autowired
	private CarInfoService carInfoService; 
	
	/**
	 * 
	 * @param model
	 * @param req
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/carInfoView")
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
	@RequestMapping(value = "/carInfoList", produces = {"application/json;charset=UTF-8"})
	public String getCarInfoList (HttpServletRequest req,CarInfoVo vo) throws Exception{
	    	String json = null;
		try {
			List<CarInfo> list = carInfoService.selectCarInfoByPage(vo);
			int totalCount = carInfoService.selectCarInfoCount(vo);
		
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
			CarInfo carInfo = JSON.parseObject(json,CarInfo.class);
			
			int i = carInfoService.insertCarInfo(carInfo);
				
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
