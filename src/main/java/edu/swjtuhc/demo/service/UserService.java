package edu.swjtuhc.demo.service;


	import java.util.List;

import edu.swjtuhc.demo.model.SysUser;

	public interface UserService {
		 public int register(SysUser user);
		 public SysUser userLogin(String name);
		 public List<SysUser> getAllSysUsers();
		public List<SysUser> getsushexinxi();
	}

