package com.xworkz.appzone.model.dao.login;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.appzone.entity.login.LoginEntity;
import com.xworkz.appzone.exception.DAOException;

@Repository
public class LoginDAOimpl implements LoginDAO {

	@Autowired
	private SessionFactory factory;

private static final Logger logger=Logger.getLogger(LoginDAOimpl.class);
public LoginEntity fetchUserByUsernameNPass(LoginEntity dto) throws DAOException
	{
		Session session = factory.openSession();
		try {
			Query query = session.getNamedQuery("checkLogin");
			query.setParameter("user", dto.getUsername());
			query.setParameter("password", dto.getPassword());
			LoginEntity user = (LoginEntity) query.uniqueResult();
			logger.info("Our query returns the value"+user);
			return user;
		} catch (HibernateException e) {
			e.printStackTrace();
			throw new DAOException(e.getMessage());
		} finally {
			session.close();
		}
	}
	
}
