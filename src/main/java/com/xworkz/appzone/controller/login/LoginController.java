package com.xworkz.appzone.controller.login;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.xworkz.appzone.dto.login.LoginDTO;
import com.xworkz.appzone.exception.ControllerException;
import com.xworkz.appzone.model.service.login.LoginServiceImpl;

@Controller
@RequestMapping("/")

public class LoginController {
	
	
	public LoginController() {
		logger.info("created controller"+this.getClass().getSimpleName());
	}

	@Autowired
	private LoginServiceImpl loginservice;
	
	

	private static final Logger logger=Logger.getLogger(LoginController.class);

	@RequestMapping(value="/login.do", method = RequestMethod.POST)
	public String register(LoginDTO dto, Model model) throws ControllerException {
		logger.info("created register");
		try {
			LoginDTO loginDTO = loginservice.onfetch(dto);
			logger.info("DTO"+dto);
			if (loginDTO != null) {
				if(loginDTO.getRole().equalsIgnoreCase("owner")) {
				return "registrationSucces";
				}
				else
				{
					return "search";	
				}
			} else {
				model.addAttribute("message","Login credential is wrong...........");
				return "login";
			}

		} catch (Exception e) {
			throw new ControllerException(e.getMessage());
		}
		
	}
}
