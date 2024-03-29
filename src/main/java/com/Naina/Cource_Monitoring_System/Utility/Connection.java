package com.Naina.Cource_Monitoring_System.Utility;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Connection {
	 
	
	
		public static EntityManagerFactory emf = null;
		
		static {
			emf = Persistence.createEntityManagerFactory("Admin");
		}
		
		public static EntityManager provideConnection()
		{
			return emf.createEntityManager();
		}
	}


