package com.connetion123;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ConnetionUtil {
	
	public static SessionFactory connectionprovider()
	{
		Configuration cfg= new Configuration();
		cfg.configure("hibernate-cfg.xml");
		
		SessionFactory SessionFactory = cfg.buildSessionFactory();
		
		return SessionFactory;	
		
		
		
		
	}

}
