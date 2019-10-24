package com.lti.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Configurable;

@Entity
@Table(name="STUDENT_OTHER_DETAILS")
public class StudentOtherDetails {
	
	@Id
	@GeneratedValue
	@Column(name="STUD_OTHERDETAILS_ID")
	private int studOtherDetailsId;
	
	@Column(name="PRESENT_CLASS")
	private String presentClass;
	
	@Column(name="PRESENT_CLASS_YEAR")
	private int presentClassYear;
	
	@Column(name="MODE_OF_STUDY")
	private String modeOfStudy;
	
	@Column(name="UNIVERSITY_BOARD_NAME")
	private String universityBoardName;
	
	@Column(name="PREVIOUS_CLASS")
	private String previousClass;
	
	@Column(name="PREVIOUS_PASSING_YEAR")
	private int previousPassingYear;
	
	@Column(name="PREVIOUS_PASSING_PERCENTAGE")
    private double previousPassingPercentage;
	
	@Column(name="ADMISSION_FEE")
	private double admissionFee;
	
	@Column(name="TUTION_FEE")
	private double tutionFee;
	
	@Column(name="OTHER_FEE")
	private double otherFee;
	
	@OneToOne
	@JoinColumn(name="STUDENT_ID")
    private StudentRegistration studentRegistration;

	public int getStudOtherDetailsId() {
		return studOtherDetailsId;
	}

	public void setStudOtherDetailsId(int studOtherDetailsId) {
		this.studOtherDetailsId = studOtherDetailsId;
	}

	public double getPreviousPassingPercentage() {
		return previousPassingPercentage;
	}

	public void setPreviousPassingPercentage(double previousPassingPercentage) {
		this.previousPassingPercentage = previousPassingPercentage;
	}

	public String getPresentClass() {
		return presentClass;
	}

	public void setPresentClass(String presentClass) {
		this.presentClass = presentClass;
	}

	public int getPresentClassYear() {
		return presentClassYear;
	}

	public void setPresentClassYear(int presentClassYear) {
		this.presentClassYear = presentClassYear;
	}

	public String getModeOfStudy() {
		return modeOfStudy;
	}

	public void setModeOfStudy(String modeOfStudy) {
		this.modeOfStudy = modeOfStudy;
	}

	public String getUniversityBoardName() {
		return universityBoardName;
	}

	public void setUniversityBoardName(String universityBoardName) {
		this.universityBoardName = universityBoardName;
	}

	public String getPreviousClass() {
		return previousClass;
	}

	public void setPreviousClass(String previousClass) {
		this.previousClass = previousClass;
	}

	public int getPreviousPassingYear() {
		return previousPassingYear;
	}

	public void setPreviousPassingYear(int previousPassingYear) {
		this.previousPassingYear = previousPassingYear;
	}

	

	public double getAdmissionFee() {
		return admissionFee;
	}

	public void setAdmissionFee(double admissionFee) {
		this.admissionFee = admissionFee;
	}

	public double getTutionFee() {
		return tutionFee;
	}

	public void setTutionFee(double tutionFee) {
		this.tutionFee = tutionFee;
	}

	public double getOtherFee() {
		return otherFee;
	}

	public void setOtherFee(double otherFee) {
		this.otherFee = otherFee;
	}

	public StudentRegistration getStudentRegistration() {
		return studentRegistration;
	}

	public void setStudentRegistration(StudentRegistration studentRegistration) {
		this.studentRegistration = studentRegistration;
	}
	
	
	
}
