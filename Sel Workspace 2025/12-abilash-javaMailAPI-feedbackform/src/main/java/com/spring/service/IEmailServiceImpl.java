package com.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class IEmailServiceImpl implements IEmailService {

	@Autowired
	private JavaMailSender mailSender;

	@Override
	public boolean sendEmail(String to, String message) {

		SimpleMailMessage mail = new SimpleMailMessage();

		try {
			mail.setTo(to);
			mail.setSubject("Message from spring mvc app");
			mail.setText("thanks for your feedback!!!");
			mailSender.send(mail);
			System.out.println(">--------> Email Sent Successfully!!!");
			return true;
		} catch (Exception e) {
			System.out.println(">-----------> Email Unsuccessfull!!!");
			e.printStackTrace();
			return false;

		}
	}

}
