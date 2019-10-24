package com.lti.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="SCHOLARSHIP_STUDENT_STATUS")
public class ScholarshipStudentStatus {
	
	@Id
	@GeneratedValue
	@Column(name="SCH_STUD_STATUS_ID")
	private int schStudStatusId;
	
	@Column(name="STATUS")
	private String status;
	
	@OneToOne
	@JoinColumn(name="STUDENT_ID")
	private StudentRegistration studentRegistration;

	public int getSchStudStatusId() {
		return schStudStatusId;
	}

	public void setSchStudStatusId(int schStudStatusId) {
		this.schStudStatusId = schStudStatusId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public StudentRegistration getStudentRegistration() {
		return studentRegistration;
	}

	public void setStudentRegistration(StudentRegistration studentRegistration) {
		this.studentRegistration = studentRegistration;
	}
	
	

}
