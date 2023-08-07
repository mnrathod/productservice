package demo.product.service.impl;

import demo.product.service.NotificationService;

public interface SMSService extends NotificationService{

	public boolean sendSMS(String from, String to, String text);
	
}
