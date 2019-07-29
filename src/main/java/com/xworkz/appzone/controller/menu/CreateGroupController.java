package com.xworkz.appzone.controller.menu;

import java.util.List;

import javax.servlet.ServletException;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.xworkz.appzone.dto.menu.createGroupDTO;
import com.xworkz.appzone.exception.ControllerException;
import com.xworkz.appzone.model.service.menu.CreateGroupService;

@Controller
@RequestMapping("/")
public class CreateGroupController {

	
	private static final Logger logger=Logger.getLogger(CreateGroupController.class);
	
	public CreateGroupController() {
		logger.info("created Group Controller"+this.getClass().getSimpleName());
	}

	@Autowired
	private CreateGroupService service;

	@RequestMapping(value = "/creategrp.do", method = RequestMethod.POST)
	public String saveGroup(createGroupDTO dto, Model model) throws ControllerException {
		try {
			logger.info(dto);
			boolean res = service.saveGroup(dto);

			if (res) {
				model.addAttribute("message", "Group created succesfully");

			} else {
				model.addAttribute("message", "Group not created ........");
			}

		}

		catch (Exception e) {

			throw new ControllerException(e.getMessage());

		}

		return "creategroup";
	}

	@RequestMapping("creategrp")
	public String creategroup(createGroupDTO dto,Model model) throws ServletException
	{
			
		logger.info("invoked create group");
		try {
			List<String> list=service.fetchgroupname();
			model.addAttribute("groupNames", list);
		} catch (Exception e) {
			throw new ServletException(e.getMessage());
		}
		return "managegroup";
	
	}
	
	@RequestMapping(value="/invite.do",method=RequestMethod.POST)
	public String inviteUserController(String emailid,String groupname,Model model) 
	{
		logger.info(emailid);
		logger.info(groupname);
		logger.info("invote fetchall groupname");
		boolean list;
		try {
			list = service.inviteUserService(emailid, groupname);
		
		if(list)
		{
			model.addAttribute("Succesorfailure", "Mail is sent succesfully");
		}
		
		else
		{
			model.addAttribute("Successorfailure", "Your email id invalid");
		}
		
		}
		catch(Exception e){
			e.printStackTrace();
			
		}
		return "managegroup";
		
	

	}
	

}