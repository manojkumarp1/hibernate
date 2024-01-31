package org.easy.inheritance;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
	

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Person p = new Person();
    	
    	p.setGender("M");
    	p.setName("manoj");
    	
    	
    	Faculty f= new Faculty();
    	
    	f.setCourse("java");
    	f.setName("ramu");
    	f.setGender("male");
        f.setQualification("B.tech");
        f.setSalary(2000000);
        
        
        Student s= new Student();
        s.setName("remo");
        s.setBacklogs(3);
        s.setCgpa(9.3);
        s.setGender("male");
        s.setProgram("B.tech");
        Configuration configuration = new Configuration();
    	configuration.configure("hibernate.cfg.xml").addAnnotatedClass(Person.class).addAnnotatedClass(Faculty.class).addAnnotatedClass(Student.class);
    	SessionFactory sessionFactory=configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        
       
        
        Transaction transaction=session.getTransaction();
        transaction.begin();
        session.save(p);
        session.save(f);
        session.save(s);
        
        transaction.commit();
    	
    }
}
