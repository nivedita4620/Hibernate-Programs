package com.hibernatequery;



import java.util.Iterator;
import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.Transaction;



public class App 
{
    public static void main( String[] args )
    {
    	Session session = HibernateUtil.getSessionFactory().openSession();
    	Transaction tr = session.beginTransaction();
    	
    	//Employee1 emp2 = new Employee1();
//    	emp2.setEmpName("Nivedita");
//    	emp2.setSalary(50000);
//    	emp2.setJob("HR");
//    	session.save(emp2);
    	
//    	Employee1 emp = new Employee1();
//    	emp.setEmpName("Akanksha");
//    	emp.setSalary(30000);
//    	emp.setJob("Sr.Manager");
//    	session.save(emp);
//    	
//    	Employee1 emp3 = new Employee1();
//    	emp3.setEmpName("Harsh");
//    	emp3.setSalary(7000);
//    	emp3.setJob("IT Trainer");
//    	session.save(emp3);
//    	
//	tr.commit();
//	session.close();
    	
    	System.out.println("Employee Added Successfully");
    	
    	TypedQuery query = session.getNamedQuery("findEmployeeByName");
    	query.setParameter("empName", "Harsh");
    	
    	List<Employee1> employees = query.getResultList();
    	Iterator<Employee1> itr = employees.iterator();
    	
    	while(itr.hasNext())
    	{
    		Employee1 e = itr.next();
    		System.out.println(e);
    		System.out.println("Employee Name: " +e.getEmpName());
    	}
    	
    }

}
