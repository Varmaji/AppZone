package com.xworkz.appzone.model.service.login;

import com.xworkz.appzone.dto.login.LoginDTO;
import com.xworkz.appzone.entity.login.LoginEntity;
import com.xworkz.appzone.exception.ServiceException;

public interface LoginService {
	
	public LoginDTO onfetch(LoginDTO dto) throws ServiceException;

}
