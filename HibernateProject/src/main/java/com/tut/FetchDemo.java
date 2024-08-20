package com.tut;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FetchDemo {
	
	
	public static void main(String[] args) {
		Configuration cnf=new Configuration();
		cnf.configure("hibernate.cfg.xml");
		
		SessionFactory factory=cnf.buildSessionFactory();
		Session session=factory.openSession();
		
		//get details
//		Student student=(Student) session.get(Student.class, 1);
//		System.out.println(student);
		
		
		
		Student student=(Student) session.load(Student.class, 5);
		System.out.println(student);
		session.close();
		factory.close();
	}

}
