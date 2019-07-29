package com.xworkz.appzone.dto.addapp;

public class AddappDetailsDTO {

	private String appAliasName;
	private boolean isActive;
	private String description;
	private String groupMailId;
	private boolean cloudEnabled;
	public String getAppAliasName() {
		return appAliasName;
	}
	public void setAppAliasName(String appAliasName) {
		this.appAliasName = appAliasName;
	}
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getGroupMailId() {
		return groupMailId;
	}
	public void setGroupMailId(String groupMailId) {
		this.groupMailId = groupMailId;
	}
	public boolean isCloudEnabled() {
		return cloudEnabled;
	}
	public void setCloudEnabled(boolean cloudEnabled) {
		this.cloudEnabled = cloudEnabled;
	}
	@Override
	public String toString() {
		return "AddappDetailsDTO [appAliasName=" + appAliasName + ", isActive=" + isActive + ", description="
				+ description + ", groupMailId=" + groupMailId + ", cloudEnabled=" + cloudEnabled + "]";
	}
	
	
}
