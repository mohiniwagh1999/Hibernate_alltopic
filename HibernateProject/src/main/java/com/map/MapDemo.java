package com.map;

import java.util.ArrayList;

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
		
		//creating answer
		Answer ans=new Answer();
		ans.setAid(222);
		ans.setAnswer("java is programming language");
		ans.setQuestion(qu);
		
		Answer ans1=new Answer();
		ans1.setAid(223);
		ans1.setAnswer("robust and secure");
		ans1.setQuestion(qu);
		
		Answer ans2=new Answer();
		ans2.setAid(224);
		ans2.setAnswer("polymorphism");
		ans2.setQuestion(qu);
		
		//create array and add it
		ArrayList<Answer> ar=new ArrayList<>();
		ar.add(ans);
		ar.add(ans1);
		ar.add(ans2);
		
		qu.setAnswer(ar);
		Transaction trx=session.beginTransaction();
		
		//save
		session.save(qu);
		session.save(ans);
		session.save(ans1);
		session.save(ans2);
		trx.commit();
		factory.close();
	}

}
