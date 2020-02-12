package com.cts.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import com.cts.model.worker;

@Component
public class WorkerDao {

	static List<worker> list =null;
	static {		
		list = new ArrayList<worker>(); 
		list.add(new worker(1, "Anil", "Mang"));
		list.add(new worker(2, "Aji", "Mang2"));
		list.add(new worker(3, "Sanal", "Pralin"));
		list.add(new worker(4, "Nibin", "Raj"));
	}
	public List<worker> getUsers(){		
		
		return WorkerDao.list;
	}	
	public ResponseEntity<worker> insertUser(worker work){
		list.add(work);		
		return new ResponseEntity<worker>(work, HttpStatus.OK);
	}
	public ResponseEntity<worker> getUser(int id){
		for (worker user : list) {
			if(user.getId() == id) {
				return new ResponseEntity<worker>(user, HttpStatus.OK);
			}
		}
		return null;
	}
	public int deleteUser(int id){
		for (worker user : list) {
			if(user.getId() == id) {
				list.remove(user);
				return id;
			}
		}
		return 0;
	}
}
