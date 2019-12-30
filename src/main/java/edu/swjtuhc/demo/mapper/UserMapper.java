package edu.swjtuhc.demo.mapper;


import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import edu.swjtuhc.demo.model.SysUser;

@Mapper
public interface UserMapper {
	  public SysUser userLogin(String name);
	public SysUser selectUserByStuid(int stuid);
	public List<SysUser> selectAllSysUsers();
	public int insertUser(SysUser user);
}
