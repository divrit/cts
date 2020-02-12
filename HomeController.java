package com.cts.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.dao.WorkerDao;
import com.cts.model.worker;

@RestController
	public class HomeController {
		
		@Autowired
		WorkerDao dao;
	   
		@RequestMapping("/homedata")
		public ResponseEntity<worker> getHomeData() {
			
			return new ResponseEntity<worker>(new worker(11,"Giri", "Add1111"), HttpStatus.OK);
				
		}
		
		@GetMapping("/getAllUsers")
		public List<worker> getUsers(){
					
			return dao.getUsers();
		}
		
		@GetMapping("/user/{id}")
		public ResponseEntity<worker> getUser(@PathVariable("id") int id) {
			return dao.getUser(id);
		}
		
		@PostMapping("/user")
		public ResponseEntity<worker> saveUser(@RequestBody worker user) {
			return dao.insertUser(user);
		}
		
		@DeleteMapping("user/{id}")
		public int deleteUser(@PathVariable("id") int id) {
			return dao.deleteUser(id);
		}
	}