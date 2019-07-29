package com.xworkz.appzone.controller.role;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.xworkz.appzone.dto.menu.createGroupDTO;
import com.xworkz.appzone.exception.ControllerException;
import com.xworkz.appzone.model.service.role.RoleServiceImpl;

@Controller
public class ManageRoleController {
	
	@Autowired
	private RoleServiceImpl roleservice;
	
	 private static final Logger logger=Logger.getLogger(ManageRoleController.class);
	public ManageRoleController() {
		logger.info("invoked manage role controller\t");
	}

	@RequestMapping("manage.do")
	public String creategroup(createGroupDTO dto,Model model) throws ControllerException
	{
			
		System.out.println("invoked");
		try {
			List<String> list=roleservice.fetchgroupname();
			List<String> list1=roleservice.fetchAllRole();
			List<String> list2=roleservice.fetchAllUsername();
			logger.info(list);
			logger.info(list1);
			logger.info(list2);
			model.addAttribute("groupNames", list);
			model.addAttribute("usernames", list2);
			model.addAttribute("roles", list1);
		} catch (Exception e) {
			throw new ControllerException(e.getMessage());
		}
		return "managerole";
	
	}
	
	@RequestMapping(value="updated.do")
	public String Updatethemanagerole (String username,String role) throws ControllerException 
	{
		ModelAndView modelandview=new ModelAndView();
		try {
			logger.info("username is "+username+" and role is "+role);
			Integer id=roleservice.Updatethemanagerole(username, role);
			logger.info(id);
			modelandview.addObject("updaterole", "Hi role of the user updated" );
		} catch (Exception e) {
			throw new ControllerException(e.getMessage());
		}
		return "update";
		
		
	}
}
