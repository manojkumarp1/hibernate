package org.studyeasy.hibernate;

import java.util.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Configuration configuration = new Configuration();
    	configuration.configure("hibernate.cfg.xml").addAnnotatedClass(User.class);
    	SessionFactory sessionFactory=configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        
       
        
        Transaction transaction=session.getTransaction();
        transaction.begin();
        /*
         User u = new User(3,"chari","chari@123","Kesava","Chari");
        session.persist(u);
         */
        /*
         Retrieving
        User us = session.get(User.class, 2);
        System.out.println(us);
          */
        /*
         Update
        User us = session.get(User.class, 1);
        us.setUsername("mano");
        session.update(us);
        */
        /*
         Delete
         User us = session.get(User.class, 1);
        session.delete(us);
         */
        
        /*
         
         Retrieving using HQL
        List<User> u = session.createQuery("from user where username='sai' and password like '%123'").getResultList();
        
        
        for(User i:u)
        {
        	System.out.println(i);
        }
        
        */
        
        /*
       
         Update using HQL
        session.createQuery("update user set username='tej' where username='sai'").executeUpdate();
        
        */
        
        /*
         Delete
         
        String hql = "DELETE FROM user WHERE username = :Username";

        Query query = session.createQuery(hql);
        query.setParameter("Username", "sai");

        // Execute the delete query
        int deletedCount = query.executeUpdate();
        
        System.out.println(deletedCount);
        
        */
        List<User> u = session.createQuery("from user").getResultList();
        
        
        for(User i:u)
        {
        	System.out.println(i);
        }
        
        System.out.println(session.createQuery("select sum(id) from user").list());
        
        
        
        
        transaction.commit();
        
        
    }
}
