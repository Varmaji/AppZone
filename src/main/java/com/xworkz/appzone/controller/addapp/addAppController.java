package com.xworkz.appzone.controller.addapp;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.xworkz.appzone.dto.addapp.AddappDTO;
import com.xworkz.appzone.exception.ControllerException;
import com.xworkz.appzone.model.service.addapp.addappService;

@Controller
@RequestMapping("/")
public class addAppController {

	@Autowired
	private addappService addappservice;

	private static final Logger logger = Logger.getLogger(addAppController.class);

	
	@RequestMapping(value="/addapp.do", method=RequestMethod.POST)
	public String Addapp(AddappDTO dto, Model model) throws ControllerException {

		logger.info("invoked"+this.getClass().getSimpleName());
		try {
			List<String> list = addappservice.fetchAllAppID();
			logger.info(list);
			model.addAttribute("addApp", list);

		} catch (Exception e) {
			throw new ControllerException(e.getMessage());
		}
		return "addapp";

	}

}
