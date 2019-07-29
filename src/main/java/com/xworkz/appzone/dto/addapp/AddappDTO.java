package com.xworkz.appzone.dto.addapp;

public class AddappDTO {
	
	private int appId;
	private String appName;
	
	public int getAppId() {
		return appId;
	}
	public void setAppId(int appId) {
		this.appId = appId;
	}
	public String getAppName() {
		return appName;
	}
	public void setAppName(String appName) {
		this.appName = appName;
	}
	@Override
	public String toString() {
		return "AddappDTO [appId=" + appId + ", appName=" + appName + "]";
	}
	
	
}
