package com.cdp.spring.beans;

public class Vodofone implements Sim{

	@Override
	public void call() {
		System.out.println("Called Using Vodofone Sim...");
		
	}

	@Override
	public void sendSms() {
		System.out.println("Send Sms using Vodofone Sim...");
	}
	

}
