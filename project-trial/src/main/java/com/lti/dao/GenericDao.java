package com.lti.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
	public class GenericDao {
		
		@PersistenceContext
		protected EntityManager entityManager;
		
		@Transactional
		public void upsert(Object obj){
			entityManager.merge(obj);
		}
		
		public Object fetchById(Class clazz,Object pk){

		   	      Object o=entityManager.find(clazz,pk);  
		   		   return o;
		   	 }
		   	

}
