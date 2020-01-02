package edu.swjtuhc.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.swjtuhc.demo.model.SysUser;
import edu.swjtuhc.demo.model.conplaint;
import edu.swjtuhc.demo.service.ConplaintService;
import net.sf.json.JSONObject;

@RestController
@RequestMapping("/user")
public class ConplaintController {

	@Autowired
	ConplaintService ConplaintService;
	@RequestMapping("/conplaint")
	public JSONObject conplaint(@RequestBody conplaint conplainter) {
		JSONObject result = new JSONObject();
		int i = ConplaintService.conplaint(conplainter);
		result.put("state", i);
		return result;
	}
	@RequestMapping("/getConplaint")
	public List<conplaint> getConplaints(){
		return ConplaintService.getAllConplaints();
	}
	@RequestMapping("/weixiuzhuangtai")
	public List<conplaint> weixiuzhuangtai(){
		return ConplaintService.weixiuzhuangtai();
	}

}
