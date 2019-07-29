package com.xworkz.appzone.model.service.role;

import java.util.List;

import javax.servlet.ServletException;

import com.xworkz.appzone.exception.ServiceException;

public interface RoleService {
	public List<String> fetchgroupname() throws ServletException;
	public List<String> fetchAllRole() throws ServletException;
	public List<String> fetchAllUsername() throws ServletException;
	public Integer Updatethemanagerole (String username,String role) throws  ServiceException;
}
