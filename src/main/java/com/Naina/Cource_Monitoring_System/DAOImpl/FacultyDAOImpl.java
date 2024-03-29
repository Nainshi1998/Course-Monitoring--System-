package com.Naina.Cource_Monitoring_System.DAOImpl;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.Naina.Cource_Monitoring_System.DAO.FacultyDAO;
import com.Naina.Cource_Monitoring_System.Model.Batch;
import com.Naina.Cource_Monitoring_System.Model.CoursePlan;
import com.Naina.Cource_Monitoring_System.Model.Faculty;

public class FacultyDAOImpl implements FacultyDAO{

	@Override
	public Faculty loginFaculty(String username, String password) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Admin");
        EntityManager em = emf.createEntityManager();
		try {
            em.getTransaction().begin();
            Query query = em.createQuery("SELECT f FROM Faculty f WHERE f.username = :username AND f.password = :password");
            query.setParameter("username", username);
            query.setParameter("password", password);
            Faculty faculty = (Faculty) query.getSingleResult();
            em.getTransaction().commit();
            return faculty;
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
            return null;
        } finally {
            em.close();
        }
	}

	@Override
	public String createCoursePlan(int planId, int batchId, int dayNumber, String topic, String status) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Admin");
        EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		Batch batch = em.find(Batch.class, batchId);
		CoursePlan cplan = new CoursePlan();
		cplan.setPlanId(planId);
		cplan.setBatchId(batch);
		cplan.setDayNumber(dayNumber);
		cplan.setTopic(topic);
		cplan.setStatus(status);
        em.persist(cplan);
        em.getTransaction().commit();
		em.close();
		return null;
	}
	
	@Override
	public List<CoursePlan> viewCoursePlan() {
		// TODO Auto-generated method stub
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Admin");
        EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		
		Query query = em.createQuery("select cp from CoursePlan cp");
		List<CoursePlan> list = query.getResultList();
		
		for(CoursePlan cp : list)
		{
			System.out.println(cp);
		}
		em.getTransaction().commit();
		em.close();
		
		return null;
	}

	@Override
	public String updatePassword(int id, String newPassword) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Admin");
        EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		Faculty update = em.find(Faculty.class, id);
		update.setPassword(newPassword);
		em.getTransaction().commit();
		em.close();
		return "password get updated";
	}


}