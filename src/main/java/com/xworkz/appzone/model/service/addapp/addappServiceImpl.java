package com.xworkz.appzone.model.service.addapp;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.appzone.exception.ServiceException;
import com.xworkz.appzone.model.dao.addapp.addAppDAO;

@Service
public class addappServiceImpl implements addappService {

	@Autowired
	private addAppDAO dao;
	
	private static final Logger logger = Logger.getLogger(addappServiceImpl.class);

	public List<String> fetchAllAppID() throws ServiceException {
		try {
			logger.info("create fetchgroupname\t"+this.getClass().getSimpleName());
			List<String> list = dao.fetchAllAppId();
			return list;
		} catch (Exception e) {
			throw new ServiceException(e.getMessage());
		}
		
	}

	
}
