package com.xworkz.appzone.model.dao.login;

import java.util.List;

import com.xworkz.appzone.entity.login.LoginEntity;
import com.xworkz.appzone.exception.DAOException;


public interface LoginDAO {
	
	public LoginEntity fetchUserByUsernameNPass(LoginEntity dto) throws DAOException;
	
}
