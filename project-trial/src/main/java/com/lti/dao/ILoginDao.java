package com.lti.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.lti.dto.InstituteInfo;

@Repository
public class ILoginDao {
	
	@PersistenceContext
	private EntityManager entityManager;
	@Transactional

	public InstituteInfo fetchByCode(long code) {
	String hpql="select i.code,i.name,i.pwd from InstituteRegistration i where i.code=:c";
	Query q=entityManager.createQuery(hpql);
	q.setParameter("c", code);
	Object [] arr=(Object []) q.getSingleResult();
	InstituteInfo inform=new InstituteInfo();
	
	inform.setInstituteCode((Long) arr[0]);
	inform.setInstituteName((String)arr[1]);
	inform.setInstitutePwd((String)arr[2]);
	
	return inform;
	
	}

}
