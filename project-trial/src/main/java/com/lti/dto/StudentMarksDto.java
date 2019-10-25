package com.lti.dto;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class StudentMarksDto {
	
	private int studentId;
	
	private int student10Id;
	private String rollnumber10;
	private String boardname10;
	private int passingyear10;
	private double percentage10;
	
	private int student12Id;
	private String rollnumber12;
	private String boardname12;
	private int passingyear12;
	private double percentage12;
	
	
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public int getStudent10Id() {
		return student10Id;
	}
	public void setStudent10Id(int student10Id) {
		this.student10Id = student10Id;
	}
	public String getRollnumber10() {
		return rollnumber10;
	}
	public void setRollnumber10(String rollnumber10) {
		this.rollnumber10 = rollnumber10;
	}
	public String getBoardname10() {
		return boardname10;
	}
	public void setBoardname10(String boardname10) {
		this.boardname10 = boardname10;
	}
	public int getPassingyear10() {
		return passingyear10;
	}
	public void setPassingyear10(int passingyear10) {
		this.passingyear10 = passingyear10;
	}
	public double getPercentage10() {
		return percentage10;
	}
	public void setPercentage10(double percentage10) {
		this.percentage10 = percentage10;
	}
	public int getStudent12Id() {
		return student12Id;
	}
	public void setStudent12Id(int student12Id) {
		this.student12Id = student12Id;
	}
	public String getRollnumber12() {
		return rollnumber12;
	}
	public void setRollnumber12(String rollnumber12) {
		this.rollnumber12 = rollnumber12;
	}
	public String getBoardname12() {
		return boardname12;
	}
	public void setBoardname12(String boardname12) {
		this.boardname12 = boardname12;
	}
	public int getPassingyear12() {
		return passingyear12;
	}
	public void setPassingyear12(int passingyear12) {
		this.passingyear12 = passingyear12;
	}
	public double getPercentage12() {
		return percentage12;
	}
	public void setPercentage12(double percentage12) {
		this.percentage12 = percentage12;
	}
	
	
	
}
