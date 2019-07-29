package com.xworkz.appzone.model.service.menu;

import java.util.List;

import javax.servlet.ServletException;

import org.apache.log4j.Logger;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.appzone.controller.email.MailSenderService;
import com.xworkz.appzone.dto.menu.createGroupDTO;
import com.xworkz.appzone.entity.login.LoginEntity;
import com.xworkz.appzone.entity.menu.GroupEntity;
import com.xworkz.appzone.exception.DAOException;
import com.xworkz.appzone.exception.ServiceException;
import com.xworkz.appzone.model.dao.menu.CreateGroupDAO;

@Service
public class CreateGroupServiceImpl implements CreateGroupService {

	@Autowired
	private CreateGroupDAO dao;
	
	@Autowired
	private MailSenderService senderservice;
	
private static final Logger logger=Logger.getLogger(CreateGroupServiceImpl.class);
	public CreateGroupServiceImpl() {
		logger.info("created creategroupservice"+this.getClass().getSimpleName());
	}

	public boolean saveGroup(createGroupDTO dto) throws ServiceException {
		try {
			GroupEntity entity = new GroupEntity();
			BeanUtils.copyProperties(dto, entity);
			logger.info(entity);
			return dao.saveGroup(entity);
		} catch (Exception e) {
			throw new ServiceException(e.getMessage());
		}
	}

	public List<String> fetchgroupname() throws ServletException {
		try {
			List<String> list = dao.fetchAllGroupName();
			return list;
		} catch (Exception e) {
			throw new ServletException(e.getMessage());
		}
	}
	
	public boolean inviteUserService(String emailid,String groupname) throws DAOException
	{
		
		
		logger.info("invoked inviteUserService");
		if(groupname!=null)
		{
		LoginEntity entity=dao.inviteUserDao(emailid, groupname);
		if(entity!=null) {
			return senderservice.inviteUser(entity, groupname) ;
		}
		}
		return false;
		
	}
	
	

}
