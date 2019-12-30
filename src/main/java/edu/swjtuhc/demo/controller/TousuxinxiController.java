package edu.swjtuhc.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.swjtuhc.demo.model.SysUser;
import edu.swjtuhc.demo.model.tousuxinxi;
import edu.swjtuhc.demo.service.TousuxinxiService;
import net.sf.json.JSONObject;

@RestController
@RequestMapping("/Tousu")
public class TousuxinxiController {

	@Autowired
	TousuxinxiService TousuxinxiService;
	
	@RequestMapping("/weixiutousu")
	public JSONObject weixiutousu(@RequestBody tousuxinxi tousu) {
		JSONObject result = new JSONObject();
		//调用service层
		int i = TousuxinxiService.Weixiutousu(tousu);
		result.put("state", i);
		return result;
	}
	
	@RequestMapping("/getAllTousuxinxi")
	public List<tousuxinxi> getAll(){
		
		return TousuxinxiService.getAllXinxi();
		
	}
	
	
}