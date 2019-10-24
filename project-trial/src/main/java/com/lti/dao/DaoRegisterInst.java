package com.lti.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lti.entity.InstituteRegistration;

@Repository
public class DaoRegisterInst {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	@Transactional
	public void  save(InstituteRegistration institute){
		entityManager.persist(institute);
	}
}
