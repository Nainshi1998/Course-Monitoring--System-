package com.Naina.Cource_Monitoring_System;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.Naina.Cource_Monitoring_System.Model.Admin;
import com.Naina.Cource_Monitoring_System.Model.Batch;
import com.Naina.Cource_Monitoring_System.Model.Faculty;


 
public class App 
{
    public static void main( String[] args )
    {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Admin");
        EntityManager em = emf.createEntityManager();
        
       Admin ad = new Admin(1, "Naina","@1234");
        
        
        
        
        em.getTransaction().begin();
        
        em.persist(ad);
        
        em.getTransaction().commit();
        
        em.close();
    }
}