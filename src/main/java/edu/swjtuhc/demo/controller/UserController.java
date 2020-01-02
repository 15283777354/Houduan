package edu.swjtuhc.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import edu.swjtuhc.demo.model.SysUser;
import edu.swjtuhc.demo.service.UserService;
import net.sf.json.JSONObject;

//JSON格式数据
//RESTful 风格

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	UserService userService;
	@RequestMapping("/register")
	public JSONObject register(@RequestBody SysUser user) {
		JSONObject result = new JSONObject();
		//调用service层
		int i = userService.register(user);
		result.put("state", i);
		return result;
	}
	
	@RequestMapping("/userLogin")
	public JSONObject login(@RequestBody SysUser user) {
		JSONObject result = new JSONObject();
		SysUser user1=userService.userLogin(user.getName());
		if (user1==null) {
			result.put("state",1);
			return result;
		}else {
			if (user1.getPassword().equals(user.getPassword())) {
				result.put("state", 2);
				return result;
			}else {
				result.put("state", 3);
				return result;
			}
		}
	}
	@RequestMapping("/getUsers")
	public List<SysUser> getUsers(){
		return  userService.getAllSysUsers();
	}
	@RequestMapping("/sushexinxi")
	public List<SysUser> sushexinxi(){
		return  userService.getsushexinxi();
	}
	
}
