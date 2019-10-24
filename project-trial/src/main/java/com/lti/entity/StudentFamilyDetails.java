package com.lti.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="STUDENT_FAMILY_DETAILS")
public class StudentFamilyDetails {
	
	@Id
	@GeneratedValue
	@Column(name="STU_FAM_ID")
	private int stuFamId;
	
	@Column(name="STUDENT_FATHER_NAME")
	private String studentFatherName;
	
	@Column(name="STUDENT_MOTHER_NAME")
	private String studentMotherName;
	
	@Column(name="STUDENT_FAM_INCOME")
	private String studentFamIncome;
	
	@Column(name="STUDENT_RELIGION")
	private String studentReligion;
	
	@Column(name="STUDENT_CASTE")
	private String studentCaste;
	
	@Column(name="STUDENT_FATHER_PROFF")
	private String studentFatherProff;
	
	@Column(name="STUDENT_MOTHER_PROFF")
	private String studentMotherProff;
	
	@Column(name="STUDENT_STATE")
	private String studentState;
	
	@Column(name="STUDENT_DISTRICT")
	private String studentDistrict;
	
	@Column(name="STUDENT_BLOCK")
	private String studentBlock;
	
	@Column(name="STUDENT_TALUKA")
	private String studentTaluka;
	
	@Column(name="STUDENT_HOUSE_NO")
    private String studentHouseNo; 
	
	@Column(name="STUDENT_STREET_NO")
    private String studentStreetNo; 
	
	@Column(name="STUDENT_PINCODE")
	private int studentPincode;
	
	@Column(name="STUDENT_MARITAL_STATUS")
	private String studentMaritalStatus;
	
	@OneToOne
	@JoinColumn(name="STUDENT_ID")
	private StudentRegistration studentRegistration;
	

	public int getStuFamId() {
		return stuFamId;
	}

	public void setStuFamId(int stuFamId) {
		this.stuFamId = stuFamId;
	}

	public String getStudentFatherName() {
		return studentFatherName;
	}

	public void setStudentFatherName(String studentFatherName) {
		this.studentFatherName = studentFatherName;
	}

	public String getStudentMotherName() {
		return studentMotherName;
	}

	public void setStudentMotherName(String studentMotherName) {
		this.studentMotherName = studentMotherName;
	}

	public String getStudentFamIncome() {
		return studentFamIncome;
	}

	public void setStudentFamIncome(String studentFamIncome) {
		this.studentFamIncome = studentFamIncome;
	}

	public String getStudentReligion() {
		return studentReligion;
	}

	public void setStudentReligion(String studentReligion) {
		this.studentReligion = studentReligion;
	}

	public String getStudentCaste() {
		return studentCaste;
	}

	public void setStudentCaste(String studentCaste) {
		this.studentCaste = studentCaste;
	}

	public String getStudentFatherProff() {
		return studentFatherProff;
	}

	public void setStudentFatherProff(String studentFatherProff) {
		this.studentFatherProff = studentFatherProff;
	}

	public String getStudentMotherProff() {
		return studentMotherProff;
	}

	public void setStudentMotherProff(String studentMotherProff) {
		this.studentMotherProff = studentMotherProff;
	}

	public String getStudentState() {
		return studentState;
	}

	public void setStudentState(String studentState) {
		this.studentState = studentState;
	}

	public String getStudentDistrict() {
		return studentDistrict;
	}

	public void setStudentDistrict(String studentDistrict) {
		this.studentDistrict = studentDistrict;
	}

	public String getStudentBlock() {
		return studentBlock;
	}

	public void setStudentBlock(String studentBlock) {
		this.studentBlock = studentBlock;
	}

	public String getStudentTaluka() {
		return studentTaluka;
	}

	public void setStudentTaluka(String studentTaluka) {
		this.studentTaluka = studentTaluka;
	}

	public String getStudentHouseNo() {
		return studentHouseNo;
	}

	public void setStudentHouseNo(String studentHouseNo) {
		this.studentHouseNo = studentHouseNo;
	}

	public String getStudentStreetNo() {
		return studentStreetNo;
	}

	public void setStudentStreetNo(String studentStreetNo) {
		this.studentStreetNo = studentStreetNo;
	}

	public int getStudentPincode() {
		return studentPincode;
	}

	public void setStudentPincode(int studentPincode) {
		this.studentPincode = studentPincode;
	}

	public StudentRegistration getStudentRegistration() {
		return studentRegistration;
	}

	public void setStudentRegistration(StudentRegistration studentRegistration) {
		this.studentRegistration = studentRegistration;
	}
	
	public String getStudentMaritalStatus() {
		return studentMaritalStatus;
	}

	public void setStudentMaritalStatus(String studentMaritalStatus) {
		this.studentMaritalStatus = studentMaritalStatus;
	}
	
	
	
	
	
}
