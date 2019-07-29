package com.xworkz.appzone.entity.menu;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="grouplist")
public class GroupEntity implements Serializable {
	
	@Id
	@GenericGenerator(name = "auto", strategy = "increment")
	@GeneratedValue(generator =  "auto")
	private int groupid;
	private String groupname;
	
	
	public int getGroupid() {
		return groupid;
	}
	public void setGroupid(int groupid) {
		this.groupid = groupid;
	}
	public String getGroupname() {
		return groupname;
	}
	public void setGroupname(String groupname) {
		this.groupname = groupname;
	}
	
	@Override
	public String toString() {
		return "CreatepageEntity [groupid=" + groupid + ", groupname=" + groupname + "]";
	}
	

}
