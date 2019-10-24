package com.lti.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table(name="INSTITUTE_REGISTRATION")
public class InstituteRegistration {
	
	@Id
	@GeneratedValue
	@Column(name="INSTITUTE_REGIS_NO")
	private int instRegisNo;
	
	@Column(name="INSTITUTE_CODE")
	private long code;
	
	@Column(name="INSTITUTE_NAME")
	private String name;
	
	@Column(name="INSTITUTE_STATE")
	private String state;
	
	@Column(name="INSTITUTE_UNI_BOARD_NAME")
	private String uniBoardName;
	
	@Column(name="INSTITUTE_PWD")
	private String pwd;
	
	@Column(name="INSTITUTE_DISC_CODE")
	private String discCode;
	
	@Column(name="INSTITUTE_ESTABLISHMENT_CERTI")
	private String instEstabCerti;
	
	@Column(name="INSTITUTE_BOARD_AFFL_CERTI")
	private String boardAfflCerti;
	
	@Column(name="INSTITUTE_STATUS")
	private String status;
	
	@Column(name="INSTITUTE_DISTRICT")
	private String district;
	
	@Column(name="INSTITUTE_CATEGORY")
	private String category;
	
	@Column(name="INSTITUTE_LOCATION")
	private String location;
	
	@Column(name="INSTITUTE_ADDRESS")
	private String address;
	
	@Column(name="INSTITUTE_PINCODE")
	private long pincode;
	
	@Column(name="INSTITUTE_PRINCIPAL_NAME")
	private String principalName;
	
	@Column(name="INSTITUTE_CONTACT_NO")
	private long contactNo;

	public int getInstRegisNo() {
		return instRegisNo;
	}

	public void setInstRegisNo(int instRegisNo) {
		this.instRegisNo = instRegisNo;
	}

	

	public long getCode() {
		return code;
	}

	public void setCode(long code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getUniBoardName() {
		return uniBoardName;
	}

	public void setUniBoardName(String uniBoardName) {
		this.uniBoardName = uniBoardName;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getDiscCode() {
		return discCode;
	}

	public void setDiscCode(String discCode) {
		this.discCode = discCode;
	}

	public String getInstEstabCerti() {
		return instEstabCerti;
	}

	public void setInstEstabCerti(String instEstabCerti) {
		this.instEstabCerti = instEstabCerti;
	}

	public String getBoardAfflCerti() {
		return boardAfflCerti;
	}

	public void setBoardAfflCerti(String boardAfflCerti) {
		this.boardAfflCerti = boardAfflCerti;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getPincode() {
		return pincode;
	}

	public void setPincode(long pincode) {
		this.pincode = pincode;
	}

	public String getPrincipalName() {
		return principalName;
	}

	public void setPrincipalName(String principalName) {
		this.principalName = principalName;
	}

	public long getContactNo() {
		return contactNo;
	}

	public void setContactNo(long contactNo) {
		this.contactNo = contactNo;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	
	
	
	
}
