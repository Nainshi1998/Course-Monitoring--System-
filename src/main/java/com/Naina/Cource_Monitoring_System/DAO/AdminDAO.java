package com.Naina.Cource_Monitoring_System.DAO;
import java.util.Date;
import java.util.List;

import com.Naina.Cource_Monitoring_System.Model.Admin;
import com.Naina.Cource_Monitoring_System.Model.Batch;
import com.Naina.Cource_Monitoring_System.Model.Course;
import com.Naina.Cource_Monitoring_System.Model.CoursePlan;
import com.Naina.Cource_Monitoring_System.Model.Faculty;

import Exception.AdminException;

public interface AdminDAO {
	public String createAdmin(Admin a);
	
	public Admin loginAdmin(String username, String password) throws AdminException;
	
	public String createCourse(Course c);
	
	public String updateCourse(int id, String newName, int newFees, String newDesc);
	
	public List<Course> viewCourse();
	
	public String createBatch(int batchId, int courseId, int facultyId, int noOfStudents, String startDate, String duration);
	
	public String updateBatch(int id, int couId, int facId, String batchStartDate, String batchDuration, int noOfStudents);
	
	public List<Batch> viewBatch();
	
	public String createFaculty(Faculty f);
	
	public String updateFaculty(int faId, String newName, String newAddress, String newMobile, String newEmail, String newUsername, String newPassword);
	
	public List<Faculty> viewFaculty();
	
	
	
	public List<CoursePlan> viewCoursePlan();
}
