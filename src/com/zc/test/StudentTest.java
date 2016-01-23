package com.zc.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.zc.model.Student;


public class StudentTest {

	public static void main(String[] args) {
		Student s=new Student();
		s.setAge(11);
		s.setId(1);
		s.setName("´Ó°¢Ë¹¶Ù");
		
		Configuration cfg=new Configuration();
		SessionFactory sf= cfg.configure().buildSessionFactory();
		Session session=sf.openSession();
		session.beginTransaction();
		session.save(s);
		session.getTransaction().commit();
		session.close();
		sf.close();
		
	}

}
