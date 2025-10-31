package com.spring;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.spring.entity.SongEntity;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println(">>--------> HIBERNATE PRATICE <-----------<");
        
        HibernatePratice hp = new HibernatePratice();
        
        hp.pratice();
        
        
    }
}

class HibernatePratice{
	
	@SuppressWarnings("removal")
	public void pratice() {

		
		Configuration conf = new Configuration();
		conf.configure("hibernate.cfg.xml");
		conf.addAnnotatedClass(SongEntity.class);
		
		SessionFactory sessionFactory = conf.buildSessionFactory();
		
		Session session = sessionFactory.openSession();
		
		session.beginTransaction();
		
		SongEntity s = new SongEntity();
		
		s.setName("Vaadi pulla vadi");
		s.setArtist("Hip Hop Tamiza");
		
		//session.persist(s);
		
		SongEntity song = session.get(SongEntity.class, 1);
		System.out.println(song);
		
		session.getTransaction().commit();
		session.close();
		
		
		
		
	}
	
}
