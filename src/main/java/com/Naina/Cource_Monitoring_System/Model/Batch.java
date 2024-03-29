package com.Naina.Cource_Monitoring_System.Model;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;


@Entity
public class Batch {
	@Id
	private int id;
	
	@ManyToOne
	@JoinColumn(name = "courseId")
	private Course courseId;
	
	@OneToOne
	@JoinColumn(name = "facultyId")
	private Faculty facultyId;
	
	private int noOfStudents;
	
	private String batchStartDate;
	
	private String duration;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Course getCourseId() {
		return courseId;
	}

	public void setCourseId(Course courseId) {
		this.courseId = courseId;
	}

	public Faculty getFacultyId() {
		return facultyId;
	}

	public void setFacultyId(Faculty facultyId) {
		this.facultyId = facultyId;
	}

	public int getNoOfStudents() {
		return noOfStudents;
	}

	public void setNoOfStudents(int noOfStudents) {
		this.noOfStudents = noOfStudents;
	}

	public String getBatchStartDate() {
		return batchStartDate;
	}

	public void setBatchStartDate(String batchStartDate) {
		this.batchStartDate = batchStartDate;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	

	public Batch(int id, Course courseId, Faculty facultyId, int noOfStudents, String batchStartDate, String duration) {
		super();
		this.id = id;
		this.courseId = courseId;
		this.facultyId = facultyId;
		this.noOfStudents = noOfStudents;
		this.batchStartDate = batchStartDate;
		this.duration = duration;
	}
	public Batch() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Batch [id=" + id + ", courseId=" + courseId + ", facultyId=" + facultyId + ", noOfStudents="
				+ noOfStudents + ", batchStartDate=" + batchStartDate + ", duration=" + duration + "]";
	}
}