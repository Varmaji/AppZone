package com.xworkz.appzone.model.service.addapp;

import java.util.List;

import com.xworkz.appzone.exception.ServiceException;

public interface addappService {

	public List<String> fetchAllAppID() throws ServiceException;

}
