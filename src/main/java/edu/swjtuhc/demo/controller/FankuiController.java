package edu.swjtuhc.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.swjtuhc.demo.mapper.FankuiMapper;
import edu.swjtuhc.demo.model.Fankui;
import edu.swjtuhc.demo.service.FankuiService;
import net.sf.json.JSONObject;

@RestController
@RequestMapping("/Fankui")
public class FankuiController {
		
	@Autowired
	
	FankuiService fankuiService;
	@RequestMapping("/Weixiufankui")
	public JSONObject Weixiufankui(@RequestBody Fankui fankui) {
		JSONObject result = new JSONObject();
		int i = fankuiService.insertWeixiufankui(fankui);
		result.put("state", i);
		return result;
	}
	
	@RequestMapping("/getFankui")
	public List<Fankui> getFankuis(){
		return fankuiService.getAllFankuis();
	}
	
}
