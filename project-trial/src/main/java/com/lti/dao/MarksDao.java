package com.lti.dao;

import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.lti.dto.StudentMarksDto;
import com.lti.entity.StudentMarks10;

@Repository
public class MarksDao extends GenericDao {

	public StudentMarksDto fetchMarksById(int id) {
		String hpql="select m from StudentMarksDto m where m.studentId=:i";
		Query q= entityManager.createQuery("hpql");
		q.setParameter("i", id);
		return (StudentMarksDto)q.getSingleResult();
		
	}

	
}
