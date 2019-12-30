package edu.swjtuhc.demo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.swjtuhc.demo.mapper.UserMapper;
import edu.swjtuhc.demo.model.SysUser;
import edu.swjtuhc.demo.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	@Autowired
	UserMapper userMapper;

	@Override
	public int register(SysUser user) {
		// TODO Auto-generated method stub
		//调用mapper实现注册
		SysUser u0 = userMapper.selectUserByStuid(user.getStuid());
		int i = -1;
		if (u0==null) {
			i=userMapper.insertUser(user);
		}else {
			i = 2;
		}
		return i;
	}
	
	@Override
	public SysUser userLogin(String username) {
		// TODO Auto-generated method stub
		return userMapper.userLogin(username);
	}
	@Override
	public List<SysUser> getAllSysUsers() {
		// TODO Auto-generated method stub
		return userMapper.selectAllSysUsers();
	}
	
}
