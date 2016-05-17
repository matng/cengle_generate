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
import com.hxd.bean.ZcBorrow;
import com.hxd.vo.ZcBorrowVo;
 import com.hxd.service.ZcBorrowService;
/**
 * 
 * <br>
 * <b>功能：</b>ZcBorrowController<br>
 *   <br>
 */ 
@Controller
@RequestMapping("/zcBorrow")
public class ZcBorrowCtl extends BaseCtl{
	
	private final static Logger log= Logger.getLogger(ZcBorrowCtl.class);

	@Autowired
	private ZcBorrowService zcBorrowService; 
	
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
	public String getZcBorrowList (HttpServletRequest req,ZcBorrowVo vo) throws Exception{
	    	String json = null;
		try {
			List<ZcBorrow> list = zcBorrowService.selectZcBorrowByPage(vo);
			int totalCount = zcBorrowService.selectZcBorrowCount(vo);
		
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
			ZcBorrow zcBorrow = JSON.parseObject(json,ZcBorrow.class);
			
			int i = zcBorrowService.insertZcBorrow(zcBorrow);
				
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
			ZcBorrowVo zcBorrow = JSON.parseObject(json,ZcBorrowVo.class);
			log.debug("===json="+zcBorrow.getIdList());
			int i = 0;
			//批量删除，单个删除特例
			if (zcBorrow.getIdList().size() > 0)
			{
				i = zcBorrowService.deleteZcBorrowByBatch(zcBorrow.getIdList());
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
			ZcBorrow zcBorrow = JSON.parseObject(json,ZcBorrow.class);
			int i = zcBorrowService.updateZcBorrowByPrimaryKeySelective(zcBorrow);
		
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
