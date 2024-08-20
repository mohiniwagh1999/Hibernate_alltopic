package com.tut;






import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;

import org.hibernate.Session;

/**
 * Hello world!
 *
 */

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
public class App 
{
    public static void main( String[] args ) throws IOException
    {
        System.out.println( "Hello World!" );
        
        Configuration cfg=new Configuration();
        cfg.configure();
        SessionFactory factory=cfg.buildSessionFactory();
        
        //SessionFactory factory=new Configuration().configure().buildSessionFactory();
        System.out.println(factory);
        
        //creating student
        
        Student st=new Student();
        st.setId(110);
        st.setName("mohini");
        
        st.setCity("blr");
        
        Student st1=new Student();
        st1.setId(10);
        st.setName("megha");
        
        st.setCity("ndn");
        
        System.out.println(st);
        System.out.println(st1);
        //creating address object
        Address a=new Address();
        a.setStreet("bypass");
        a.setOpen(true);
       // a.setAddedDate(  new Date());
        a.setX(45.56);
        a.setCity("blr");
        //reading file image
        
	FileInputStream fis=new FileInputStream("src/main/java/jpa.jpg");
		byte[] data=new byte[fis.available()];
		fis.read(data);
		a.setImage(data);
		
        
        
        
        
        Session session = factory.openSession();
        Transaction trx=   session.beginTransaction();
        session.save(st);
        session.save(a);
       try {			
    	   trx.commit();
	} catch (Exception e) {
			// TODO Auto-generated catch block
		e.printStackTrace();
		}
       
        
        session.close();
        
        
        System.out.println(factory.isClosed());
        
        System.out.println("done");
    }
}
