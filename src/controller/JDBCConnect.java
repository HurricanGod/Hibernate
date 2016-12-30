package controller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class JDBCConnect 
{
	private static SessionFactory sessionFactory;
	
	static {
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		sessionFactory=cfg.buildSessionFactory();
	}
	
	public static SessionFactory getSessionFactory()
	{
		return sessionFactory;
	}
	
	public static Session openSession() 
	{
		return sessionFactory.openSession();
	}
}
