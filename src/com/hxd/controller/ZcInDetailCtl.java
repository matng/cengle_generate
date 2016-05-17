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
import com.hxd.bean.ZcInDetail;
import com.hxd.vo.ZcInDetailVo;
 import com.hxd.service.ZcInDetailService;
/**
 * 
 * <br>
 * <b>功能：</b>ZcInDetailController<br>
 *   <br>
 */ 
@Controller
@RequestMapping("/zcInDetail")
public class ZcInDetailCtl extends BaseCtl{
	
	private final static Logger log= Logger.getLogger(ZcInDetailCtl.class);

	@Autowired
	private ZcInDetailService zcInDetailService; 
	
	/**
	 * 
	 * @param model
	 * @param req
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/view")
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
	@RequestMapping(value = "/list", produces = {"application/json;charset=UTF-8"})
	public String getZcInDetailList (HttpServletRequest req,ZcInDetailVo vo) throws Exception{
	    	String json = null;
		try {
			List<ZcInDetail> list = zcInDetailService.selectZcInDetailByPage(vo);
			int totalCount = zcInDetailService.selectZcInDetailCount(vo);
		
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
			ZcInDetail zcInDetail = JSON.parseObject(json,ZcInDetail.class);
			
			int i = zcInDetailService.insertZcInDetail(zcInDetail);
				
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

	@RequestMapping(value = "/delete", produces = {"application/json;charset=UTF-8"})
	@ResponseBody
	public String delete(@RequestBody String json) {  
		StatusVo sta = new StatusVo();
		try {
			log.debug("===json="+json);	
			ZcInDetailVo zcInDetail = JSON.parseObject(json,ZcInDetailVo.class);
			log.debug("===json="+zcInDetail.getIdList());
			int i = 0;
			//批量删除，单个删除特例
			if (zcInDetail.getIdList().size() > 0)
			{
				i = zcInDetailService.deleteZcInDetailByBatch(zcInDetail.getIdList());
			}
				
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
		log.debug("===status:"+StrUtil.toJsonStrWithFixed(sta));
		return StrUtil.toJsonStrWithFixed(sta);
	}

	@RequestMapping(value = "/edit", produces = {"application/json;charset=UTF-8"})
	@ResponseBody
	public String edit(@RequestBody String json) {
		StatusVo sta = new StatusVo();
		try {
			log.debug("===json="+json);	
			ZcInDetail zcInDetail = JSON.parseObject(json,ZcInDetail.class);
			int i = zcInDetailService.updateZcInDetailByPrimaryKeySelective(zcInDetail);
		
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
		log.debug("===status:"+StrUtil.toJsonStrWithFixed(sta));
		return StrUtil.toJsonStrWithFixed(sta);
	}

}
