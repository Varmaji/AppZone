package com.xworkz.appzone.model.dao.addapp;

import java.util.List;

import com.xworkz.appzone.exception.DAOException;

public interface addAppDAO {
	
	public List<String> fetchAllAppId() throws DAOException;
	
}
