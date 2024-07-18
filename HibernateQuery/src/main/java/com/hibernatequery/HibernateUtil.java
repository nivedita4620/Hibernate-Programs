package com.hibernatequery;


import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;



public class HibernateUtil {
	
private static SessionFactory sessionFactory; 
	
	public static SessionFactory getSessionFactory()
	{
		if(sessionFactory == null)
		{
			
			//properties class is in collection
			//properties used set a properties
			Properties settings=new Properties();
			settings.put(Environment.DRIVER,"com.mysql.jdbc.Driver");
			settings.put(Environment.DIALECT,"org.hibernate.dialect.MySQL5Dialect");
			settings.put(Environment.URL,"jdbc:mysql://localhost:3306/hiberdb");
			settings.put(Environment.USER,"root");
			settings.put(Environment.PASS,"root");
			settings.put(Environment.HBM2DDL_AUTO,"update");
			settings.put(Environment.SHOW_SQL, "true");
			
			Configuration cfg=new Configuration();
			cfg.setProperties(settings);
			cfg.addAnnotatedClass(Employee1.class);     //mapping class
			
			//interface							class
			ServiceRegistry serviceRegistry=new StandardServiceRegistryBuilder()
					.applySettings(cfg.getProperties()).build();
			
			/*ServiceRegistry serviceRegistry1;
			StandardServiceRegistryBuilder sc=new StandardServiceRegistryBuilder();
			sc.applySettings(cfg.getProperties());
			sc.build();*/
			sessionFactory=cfg.buildSessionFactory(serviceRegistry);
		}
		return sessionFactory;
		
	}

}
