package com.xworkz.appzone.entity.addapp;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.apache.log4j.Logger;
import org.hibernate.annotations.GenericGenerator;


@Entity
public class AddappEntity implements Serializable{
	@Id
	@GenericGenerator(name = "auto", strategy = "increment")
	@GeneratedValue(generator = "auto")

	@Column(name = "appId")
	private int appId;
	@Column(name = "appName")
	private String appName;

	private static final Logger logger = Logger.getLogger(AddappEntity.class);

	public AddappEntity() {
		logger.info("created addappEntity" + this.getClass().getSimpleName());
	}

	public int getAppId() {
		return appId;
	}

	public void setAppId(int appId) {
		this.appId = appId;
	}

	public String getAppAliasName() {
		return appName;
	}

	public void setAppAliasName(String appAliasName) {
		this.appName = appAliasName;
	}

	public static Logger getLogger() {
		return logger;
	}

	@Override
	public String toString() {
		return "AddappEntity [appId=" + appId + ", appAliasName=" + appName + "]";
	}
	
	

}
