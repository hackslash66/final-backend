package com.lti.pojo;
/**
 * @author surya
 *
 * @version 1.8
 */
public class Login {
	
	private String uname;
	private String password;

	public Login() {
		// TODO Auto-generated constructor stub
	}

	public Login(String uname, String pwd) {
		this.uname = uname;
		this.password = pwd;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getPwd() {
		return password;
	}

	public void setPwd(String pwd) {
		this.password = pwd;
	}
}
