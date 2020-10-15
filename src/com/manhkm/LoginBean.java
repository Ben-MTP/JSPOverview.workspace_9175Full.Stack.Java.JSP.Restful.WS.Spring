package com.manhkm;

public class LoginBean {
	private String name;
	private String password;
	public LoginBean() {}
	
	public LoginBean(String name, String password) {
		super();
		this.name = name;
		this.password = password;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public boolean validate() {
		if("admin".equals(password)) {
			return true;
		} else {
			return false;
		}
	}
	
}
