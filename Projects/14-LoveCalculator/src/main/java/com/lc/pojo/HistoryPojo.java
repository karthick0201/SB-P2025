package com.lc.pojo;

public class HistoryPojo {

	private int hid;
	private int uid;
	private String userName;
	private String crushName;
	private String result;

	public HistoryPojo() {
	}
	@Override
	public String toString() {
		return "HistoryPojo [hid=" + hid + ", uid=" + uid + ", userName=" + userName + ", crushName=" + crushName
				+ ", result=" + result + "]";
	}

	public HistoryPojo(int uid, String userName, String crushName, String result) {
		
		this.uid = uid;
		this.userName = userName;
		this.crushName = crushName;
		this.result = result;
	}

	public int getHid() {
		return hid;
	}

	public void setHid(int hid) {
		this.hid = hid;
	}

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getCrushName() {
		return crushName;
	}

	public void setCrushName(String crushName) {
		this.crushName = crushName;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

}
