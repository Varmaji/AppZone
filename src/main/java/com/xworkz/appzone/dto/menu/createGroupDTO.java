package com.xworkz.appzone.dto.menu;

public class createGroupDTO {
	
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
		return "createGroupDTO [groupid=" + groupid + ", groupname=" + groupname + "]";
	}
	
	
	

}
