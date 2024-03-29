package com.Naina.Cource_Monitoring_System.Model;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Transient;

@Entity
public class CoursePlan {
	@Id
	private int planId;
	
	@OneToOne
	@JoinColumn(name = "batchId")
	@Transient
	private Batch batchId;
	
	private int dayNumber;
	
	private String topic;
	
	private String status;

	public int getPlanId() {
		return planId;
	}

	public void setPlanId(int planId) {
		this.planId = planId;
	}

	public Batch getBatchId() {
		return batchId;
	}

	public void setBatchId(Batch batchId) {
		this.batchId = batchId;
	}

	public int getDayNumber() {
		return dayNumber;
	}

	public void setDayNumber(int dayNumber) {
		this.dayNumber = dayNumber;
	}

	public String getTopic() {
		return topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public CoursePlan() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CoursePlan(int planId, int dayNumber, String topic, String status) {
		super();
		this.planId = planId;
		this.dayNumber = dayNumber;
		this.topic = topic;
		this.status = status;
	}

	@Override
	public String toString() {
		return "CoursePlan [planId=" + planId + ", dayNumber=" + dayNumber + ", topic=" + topic + ", status=" + status
				+ "]";
	}
	
}