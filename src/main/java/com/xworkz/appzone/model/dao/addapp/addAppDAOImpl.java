package com.xworkz.appzone.model.dao.addapp;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.appzone.exception.DAOException;

@Repository
public class addAppDAOImpl implements addAppDAO {

	@Autowired
	private SessionFactory factory;
	
	private static final Logger logger=Logger.getLogger(addAppDAOImpl.class);
	
	

	public List<String> fetchAllAppId() throws DAOException {
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		logger.info("fetching all the AppID");
		try {
		String syntax="select entity.appId from AddappEntity entity";
		Query query= session.createQuery(syntax);
		List<String> list= query.list();
		return list;
		}
		catch(HibernateException e){
			throw new DAOException(e.getMessage());
		}
	}

}
