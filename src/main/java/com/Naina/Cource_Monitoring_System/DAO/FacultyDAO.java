package com.Naina.Cource_Monitoring_System.DAO;

import java.util.List;

import com.Naina.Cource_Monitoring_System.Model.CoursePlan;
import com.Naina.Cource_Monitoring_System.Model.Faculty;


public interface FacultyDAO {
	public Faculty loginFaculty(String username, String password);
	
	public String createCoursePlan(int planId, int batchId, int dayNumber, String topic, String status);
	
	public List<CoursePlan> viewCoursePlan();
	
	public String updatePassword(int id, String newPassword);
}
