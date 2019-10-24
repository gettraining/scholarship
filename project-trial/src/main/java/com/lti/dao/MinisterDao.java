package com.lti.dao;

import java.util.List;

import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.lti.entity.ScholarshipStudentStatus;
@Repository
public class MinisterDao extends GenericDao{

	public List<ScholarshipStudentStatus> fetchByStatus(String status) {
		
		String hpql="select s from ScholarshipStudentStatus s where s. status=:st";
		Query q=entityManager.createQuery(hpql);
		q.setParameter("st",status);
		return q.getResultList();
	}
}
		