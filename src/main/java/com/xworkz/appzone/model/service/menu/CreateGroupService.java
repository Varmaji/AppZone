package com.xworkz.appzone.model.service.menu;

import java.util.List;

import javax.servlet.ServletException;
import com.xworkz.appzone.dto.menu.createGroupDTO;
import com.xworkz.appzone.exception.DAOException;
import com.xworkz.appzone.exception.ServiceException;

public interface CreateGroupService {
	
	public boolean saveGroup(createGroupDTO  dto) throws ServiceException;
	public List<String> fetchgroupname() throws ServletException;
	public boolean inviteUserService(String enity,String groupname) throws DAOException;
	
}
