package com.lti.dao;

import java.util.List;

import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.lti.dto.StudentMarksDto;
import com.lti.entity.ScholarshipStudentStatus;
@Repository
public class MinisterDao extends GenericDao{

	public List<ScholarshipStudentStatus> fetchByStatus(String status) {
		
		String hpql="select s ,r, m from ScholarshipDto m,ScholarshipStudentStatus s"
				+ "StudentRegistration r "
				+ "where r."
				+ " s. status=:st";
		Query q=entityManager.createQuery(hpql);
		q.setParameter("st",status);
		return q.getResultList();
	}

//	public List<StudentMarksDto> fetchMarksById(int studId) {
//		// TODO Auto-generated method stub
//		String hpql="select t,m.* from "
//	}
}
		