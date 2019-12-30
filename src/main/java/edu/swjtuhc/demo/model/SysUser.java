package edu.swjtuhc.demo.model;

public class SysUser {
	private int stuid;
	private String password;
	private String confirm;
	private String name;
	private String phone;
	private String dormitory;
	public int getStuid() {
		return stuid;
	}
	public void setStuid(int stuid) {
		this.stuid = stuid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getConfirm() {
		return confirm;
	}
	public void setConfirm(String confirm) {
		this.confirm = confirm;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getDormitory() {
		return dormitory;
	}
	public void setDormitory(String dormitory) {
		this.dormitory = dormitory;
	}
	
	@Override
	public String toString() {
		return "SysUser [stuid=" + stuid + ", password=" + password + ", confirm=" + confirm + ", name=" + name
				+ ", phone=" + phone + ", dormitory=" + dormitory + ", getStuid()=" + getStuid() + ", getPassword()="
				+ getPassword() + ", getConfirm()=" + getConfirm() + ", getName()=" + getName() + ", getPhone()="
				+ getPhone() + ", getDormitory()=" + getDormitory() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}

}
