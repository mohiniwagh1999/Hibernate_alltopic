package com.tut;

import javax.transaction.HeuristicMixedException;
import javax.transaction.HeuristicRollbackException;
import javax.transaction.RollbackException;
import javax.transaction.SystemException;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Embedded {

	public static void main(String[] args) throws SecurityException, RollbackException, HeuristicMixedException, HeuristicRollbackException, SystemException {
		// TODO Auto-generated method stub
		
		Configuration cfg=new Configuration();
        cfg.configure();
        SessionFactory factory=cfg.buildSessionFactory();
        
        Student student=new Student();
        
        student.setName("kjhgjg");
        student.setCity("high");
        
        Certificate ce=new Certificate();
        
        ce.setDuration("2 month");
        ce.setCourse("java");
        student.setCerti(ce);
        
        Session s=factory.openSession();
        Transaction tr= s.beginTransaction();
        
        //save objects
        s.save(student);
        
        
        tr.commit();
        s.close();

	}

}
