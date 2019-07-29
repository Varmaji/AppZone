package com.xworkz.appzone.model.dao.menu;

import java.io.Serializable;
import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.appzone.entity.login.LoginEntity;
import com.xworkz.appzone.entity.menu.GroupEntity;
import com.xworkz.appzone.exception.DAOException;

@Repository
public class CreateGroupDAOImpl implements CreateGroupDAO {

	
	public CreateGroupDAOImpl() {
	
		logger.info("created \t"+this.getClass().getSimpleName());
	}

	
	@Autowired
	private SessionFactory factory;

	private static final Logger logger=Logger.getLogger(CreateGroupDAOImpl.class);
	
	
	public boolean saveGroup(GroupEntity entity) throws DAOException {
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		logger.info("Entity is"+entity);
		try {
			Serializable res = session.save(entity);
			tx.commit();
			logger.info("Serializable is"+res);
			if (res != null) {
				return true;
			}

			session.close();
		} catch (Exception e) {
			throw new DAOException(e.getMessage());
		}
		return false;

	}
	
	
	//fetching all the group name in the grouplist

	public List<String> fetchAllGroupName() throws DAOException {
		Session session = factory.openSession();

		try {
			String syntax = "select grp.groupname from GroupEntity grp";
			Query query = session.createQuery(syntax);
			List<String> list = query.list();
			return list;
		} catch (Exception e) {
			throw new DAOException(e.getMessage());
		} finally {
			session.close();
		}
	}

	//inviting the user through email invite
	public LoginEntity inviteUserDao(String emailid, String groupname) throws DAOException {

		logger.info("invite invoked user");
		Session session = factory.openSession();
		try {
			String hql = "select l from LoginEntity l where l.emailid=:em";
			Query query = session.createQuery(hql);
			query.setParameter("em", emailid);
			LoginEntity entity = (LoginEntity) query.uniqueResult();
			System.out.println(entity);
			return entity;
		} catch (HibernateException e) {
			logger.error(e.getMessage(), e);
			throw new DAOException(e.getMessage());
		} finally {
			session.close();
		}

	}

	public List<String> fetchAllRole() throws DAOException
	{
		logger.info("invoked fetch all role");
		Session session = factory.openSession();
		try {
			String hql="select entity.role from LoginEntity entity";
			Query query=session.createQuery(hql);
			List<String> list=query.list();
			return list;
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
			throw new DAOException(e.getMessage());
		}
		
	}

	public List<String> fetchAllUsername() throws DAOException
	{
		logger.info("invoked fetch all role");
		Session session = factory.openSession();
		try {
			String hql="select entity.username from LoginEntity entity";
			Query query=session.createQuery(hql);
			List<String> list=query.list();
			return list;
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
			throw new DAOException(e.getMessage());
		}
		
	}
	
	
	public Integer Updatethemanagerole (String username,String role) throws DAOException
	{
		logger.info("invoked Update method");
		Session session=null;
		Transaction transaction = null;
		try {
			session = factory.openSession();
			transaction= session.beginTransaction();
			String hql=" update LoginEntity entity set entity.role=:role where entity.username=:uname";
			Query query=session.createQuery(hql);
			query.setParameter("role",role);
			query.setParameter("uname",username);
			Integer noOfRows =query.executeUpdate();
			logger.info("The no of rows updated"+noOfRows);
			transaction.commit();
		} catch (Exception e) {
				logger.error(e.getMessage(), e);
			throw new DAOException(e.getMessage());
		}
		return 0;
	}
	
	
	
	
	
}
