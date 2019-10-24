package com.lti.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="INSTITUTE_LOGIN")
public class InstituteLogin {

	@Id
	@Column(name="INSTITUTE_CODE")
	private String instituteCode;
	
	@Column(name="INSTITUTE_REGIS_NO")
	private int instRegisNo;
	
	@Column(name="STATE_CODE")
	private String stateCode;

	public String getInstituteCode() {
		return instituteCode;
	}

	public void setInstituteCode(String instituteCode) {
		this.instituteCode = instituteCode;
	}

	public int getInstRegisNo() {
		return instRegisNo;
	}

	public void setInstRegisNo(int instRegisNo) {
		this.instRegisNo = instRegisNo;
	}

	public String getStateCode() {
		return stateCode;
	}

	public void setStateCode(String stateCode) {
		this.stateCode = stateCode;
	}
	
	
	
	
}
