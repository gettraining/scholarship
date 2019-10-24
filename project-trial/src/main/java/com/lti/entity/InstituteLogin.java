package com.lti.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="INSTITUTE_LOGIN")
public class InstituteLogin {

	@Id
	@Column(name="INSTITUTE_CODE")
	private long instituteCode;
	
	@OneToOne
	@JoinColumn(name="INSTITUTE_REGIS_NO")
	private InstituteRegistration registration;
	
	@Column(name="STATE_CODE")
	private String stateCode;

	public long getInstituteCode() {
		return instituteCode;
	}

	public void setInstituteCode(long instituteCode) {
		this.instituteCode = instituteCode;
	}

	public InstituteRegistration getRegistration() {
		return registration;
	}

	public void setRegistration(InstituteRegistration registration) {
		this.registration = registration;
	}

	public String getStateCode() {
		return stateCode;
	}

	public void setStateCode(String stateCode) {
		this.stateCode = stateCode;
	}
	
	
	
	
}
