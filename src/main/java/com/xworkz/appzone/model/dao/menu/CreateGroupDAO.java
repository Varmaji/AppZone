package com.xworkz.appzone.model.dao.menu;

import java.util.List;

import com.xworkz.appzone.entity.login.LoginEntity;
import com.xworkz.appzone.entity.menu.GroupEntity;
import com.xworkz.appzone.exception.DAOException;

public interface CreateGroupDAO {
	public boolean saveGroup(GroupEntity entity) throws DAOException;
	public LoginEntity inviteUserDao(String emailid, String groupname) throws DAOException;
	public List<String> fetchAllGroupName() throws DAOException;
	public List<String> fetchAllRole() throws DAOException;
	public List<String> fetchAllUsername() throws DAOException;
	public Integer Updatethemanagerole (String username,String role) throws DAOException;
}
