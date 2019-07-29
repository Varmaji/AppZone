package com.xworkz.appzone.model.service.role;

import java.util.List;

import javax.servlet.ServletException;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.appzone.exception.ServiceException;
import com.xworkz.appzone.model.dao.menu.CreateGroupDAO;

@Service
public class RoleServiceImpl implements RoleService {

	@Autowired
	private CreateGroupDAO dao;
	private static final Logger logger=Logger.getLogger(RoleServiceImpl.class);
	
	public List<String> fetchgroupname() throws ServletException {
		try {
			logger.info("create fetchgroupname\t"+this.getClass().getSimpleName());
			List<String> list = dao.fetchAllGroupName();
			return list;
		} catch (Exception e) {
			throw new ServletException(e.getMessage());
		}
	}
	
	
	public List<String> fetchAllRole() throws ServletException {
		try {
			logger.info("create fetchAllRole\t"+this.getClass().getSimpleName());
			List<String> list = dao.fetchAllRole();
			return list;
		} catch (Exception e) {
			throw new ServletException(e.getMessage());
		}
	}
	
	public List<String> fetchAllUsername() throws ServletException {
		try {
			logger.info("create fetchAllUsername\t"+this.getClass().getSimpleName());
			List<String> list = dao.fetchAllUsername();
			return list;
		} catch (Exception e) {
			throw new ServletException(e.getMessage());
		}
	}
	
	public Integer Updatethemanagerole (String username,String role) throws ServiceException
	{
		logger.info("invoked updaremanagerole");
		
		if(username!=null) {
		try {
			Integer id=dao.Updatethemanagerole(username, role);
			return id;
		} 		
		catch (Exception e) {
			throw new ServiceException(e.getMessage());
		}
		}
		else
		{
			logger.info("Cannot Update the role"+role);
		}
		return null;
		
		
		
		
	}
	
}
