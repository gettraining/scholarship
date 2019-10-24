package com.lti.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.dao.MinisterDao;
import com.lti.entity.ScholarshipStudentStatus;
@Service
public class MinisterService {
	
	@Autowired
	private MinisterDao dao;

	public List<ScholarshipStudentStatus> fetchByStatus(String status) {
		
		List<ScholarshipStudentStatus> ss=dao.fetchByStatus(status);
		return ss;
			
	}

}
