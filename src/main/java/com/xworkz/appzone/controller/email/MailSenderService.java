package com.xworkz.appzone.controller.email;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Service;

import com.xworkz.appzone.entity.login.LoginEntity;

@Service
public class MailSenderService {

	@Autowired
	private MailSender mailsender;
	
	private static final Logger logger=Logger.getLogger(MailSenderService.class);

	public MailSenderService() {
		logger.info("created"+this.getClass().getSimpleName());
		}

	public boolean inviteUser(LoginEntity entity, String groupname) {
		logger.info("invite user");
		try {
			SimpleMailMessage mail = new SimpleMailMessage();
			mail.setTo(entity.getEmailid());
			mail.setSubject("Invitation");
			
			logger.info(groupname);
			mail.setText("Hi"   +entity.getUsername() + "You are added to the Group" +groupname + " Regards varma");
			mailsender.send(mail);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return false;

	}
}
