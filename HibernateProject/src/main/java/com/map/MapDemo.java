package com.map;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MapDemo {

	public static void main(String[] args) {		
		
		
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory=cfg.buildSessionFactory();
		
		Session session=factory.openSession();
		
		
		//creating question
		
		Question qu=new Question();
		qu.setQid(111);
		qu.setQuestion("what is java");
		Answer ans=new Answer();
		ans.setAid(222);
		ans.setAnswer("java is programming language");
		ans.setQuestion(qu);
		
		qu.setAnswer(ans);
		
		Transaction trx=session.beginTransaction();
		session.save(qu);
		session.save(ans);
		trx.commit();
		factory.close();
	}

}
