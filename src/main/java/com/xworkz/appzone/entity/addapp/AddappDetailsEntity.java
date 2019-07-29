package com.xworkz.appzone.entity.addapp;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class AddappDetailsEntity implements Serializable {
	
	@Id
	@GenericGenerator(name="auto",strategy="increment")
	@GeneratedValue(generator = "auto")
	
	@Column(name="appAliasName")
	private String appAliasName;
	@Column(name="isActive")
	private boolean isActive;
	@Column(name="description")
	private String description;
	@Column(name="groupMailId")
	private String groupMailId;
	@Column(name="cloudEnabled")
	private boolean cloudEnabled;
	
	public AddappDetailsEntity() {
	System.out.println("crated "+this.getClass().getSimpleName());
	}

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
		return "AddappDetailsEntity [appAliasName=" + appAliasName + ", isActive=" + isActive + ", description="
				+ description + ", groupMailId=" + groupMailId + ", cloudEnabled=" + cloudEnabled + "]";
	}
	
	
	
	
	
	

}
