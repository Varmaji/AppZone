package com.xworkz.appzone.model.service.login;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.appzone.dto.login.LoginDTO;
import com.xworkz.appzone.entity.login.LoginEntity;
import com.xworkz.appzone.exception.DAOException;
import com.xworkz.appzone.exception.ServiceException;
import com.xworkz.appzone.model.dao.login.LoginDAO;

@Service
public class LoginServiceImpl implements LoginService{

	@Autowired
	private LoginDAO dao;

	public LoginDTO onfetch(LoginDTO dto) throws ServiceException
	{
		try {
			LoginEntity entity = new LoginEntity();
			BeanUtils.copyProperties(dto, entity);
			LoginEntity entityFromDB = dao.fetchUserByUsernameNPass(entity);
			LoginDTO loginDTO = new LoginDTO();
			BeanUtils.copyProperties(entityFromDB, loginDTO);
			return loginDTO;
		} catch (DAOException e) {
			e.printStackTrace();
			throw new ServiceException(e.getMessage());
			
		}
	}

}
