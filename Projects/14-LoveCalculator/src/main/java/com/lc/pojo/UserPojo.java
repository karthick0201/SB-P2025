package com.lc.pojo;

public class UserPojo {

	private int uId;
	private String name;
	private String userName;
	private String password;
	private String phoneNo;
	private String mailId;

	@Override
	public String toString() {
		String s = uId + " : " + name + " : " + userName + " : " + password + " : " + phoneNo + " : " + mailId;

		return s;
	}

	public int getuId() {
		return uId;
	}

	public void setuId(int uId) {
		this.uId = uId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getMailId() {
		return mailId;
	}

	public void setMailId(String mailId) {
		this.mailId = mailId;
	}
}
