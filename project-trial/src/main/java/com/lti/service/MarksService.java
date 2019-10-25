package com.lti.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.dao.MarksDao;
import com.lti.dto.StudentInfo;
import com.lti.dto.StudentMarksDto;

@Service
public class MarksService {
	
	@Autowired
	private MarksDao dao;
	public StudentMarksDto fetchMarksById() {
		// TODO Auto-generated method stub
		StudentInfo sInfo=(StudentInfo) dao.fetchMarks();
		return sInfo;
	}

}
