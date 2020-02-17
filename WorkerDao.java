package com.cts.Dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cts.model.ManAtWork;

@Repository 
public class WorkerDao {
	@Autowired
	SessionFactory sessionFactory;
	
     public List<ManAtWork> getAllStudent() {
    	
    	 Criteria criteria = sessionFactory.getCurrentSession().createCriteria(ManAtWork.class);
    	 return criteria.list();
     } 
     
     public void saveOrUpdate(ManAtWork student) {
 		System.out.println("DATA::: "+student);
 		sessionFactory.getCurrentSession().saveOrUpdate(student);
 		System.out.println("Student save upadet Done !!!");
 	}
}

