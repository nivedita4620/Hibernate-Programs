package com.hibernet;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



/**
 * SessionFactory:
 * A thread safe, immutable cache of compiled mappings for a single database.
 * It is heavy weight object, usually created during application initialization and kept for later use.
 *
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //Hibernet architecture
    	//Session factory
    	//Session
    	//Trascation
    	//Configuration // ServiceRegister
    	Configuration cfg = new Configuration();
    	cfg.configure("Hibernet.cfg.xml");
    	//session factory created
    	SessionFactory sessionFactory = cfg.buildSessionFactory();
    	
    	// open the session
    	Session session = sessionFactory.openSession();
    	
    	//begin transcation
    	Transaction tr = session.beginTransaction();
    	
    	// map object to database
    	Employee emp1 = new Employee();
    	emp1.setId(4);
    	emp1.setName("Tushar");
    	emp1.setDept("IT");
    	emp1.setSalary(100000);
    	
    	session.save(emp1);
    	tr.commit();
    	session.save(emp1);
    	System.out.println("Employee Added");
    	
    }
}
