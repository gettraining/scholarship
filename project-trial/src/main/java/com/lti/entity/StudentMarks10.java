package com.lti.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "STUDENTMARKS_10")
public class StudentMarks10 {
	
	@Id
	@GeneratedValue
	@Column(name = "STUDENT10_ID")
	private int student10Id;
	
	@Column(name = "STUDENT10_ROLLNO")
	private String rollnumber;
	
	@Column(name = "STUDENT10_BOARDNAME")
	private String boardname;
	
	@Column(name = "STUDENT10_PASSING_YEAR")
	private int passingyear;
	
	@Column(name = "STUDENT10_PERCENTAGE")
	private double percentage;
	
	@OneToOne
	@JoinColumn(name="STUDENT_ID")
	private StudentRegistration studentRegistration;

	public int getStudent10Id() {
		return student10Id;
	}

	public void setStudent10Id(int student10Id) {
		this.student10Id = student10Id;
	}

	public String getRollnumber() {
		return rollnumber;
	}

	public void setRollnumber(String rollnumber) {
		this.rollnumber = rollnumber;
	}

	public String getBoardname() {
		return boardname;
	}

	public void setBoardname(String boardname) {
		this.boardname = boardname;
	}

	public int getPassingyear() {
		return passingyear;
	}

	public void setPassingyear(int passingyear) {
		this.passingyear = passingyear;
	}

	public double getPercentage() {
		return percentage;
	}

	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}

	public StudentRegistration getStudentRegistration() {
		return studentRegistration;
	}

	public void setStudentRegistration(StudentRegistration studentRegistration) {
		this.studentRegistration = studentRegistration;
	}

	
	
}
