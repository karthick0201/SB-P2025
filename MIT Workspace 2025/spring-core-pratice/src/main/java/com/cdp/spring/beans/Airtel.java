package com.cdp.spring.beans;

public class Airtel implements Sim{

	@Override
	public void call() {
		System.out.println("Called Using Airtel Sim...");
		
	}

	@Override
	public void sendSms() {
		System.out.println("Send Sms using Airtel Sim...");
	}
	

}
