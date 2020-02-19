package com.example.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Student;
import com.example.Service.StudentService;

@RestController
public class StudentController {
	
	 @Autowired
	 StudentService studentService;
	
	 @GetMapping("/student")
     public List<Student> listAllSrudents(){ 
		 
    	 return (List<Student>) studentService.getAllStudent(); 
     }
	 
	@RequestMapping(value = "/studentByName/{name}", method = RequestMethod.GET)
	public List<Student> getStudentByFirstname(@PathVariable String name) {
		return studentService.findByFirstname(name);
	}
	
	@RequestMapping(value = "/student", method = RequestMethod.POST)
	public HttpStatus insertPersone(@RequestBody Student student) {
		return studentService.addStudent(student) ? HttpStatus.CREATED : HttpStatus.BAD_REQUEST;
		
	}
	
	@RequestMapping(value = "/student/{id}", method = RequestMethod.DELETE)
	public HttpStatus deleteStudent(@PathVariable Long id) {
		studentService.deleteStudent(id);
		return HttpStatus.NO_CONTENT;
	}
	
	@RequestMapping(value = "/student", method = RequestMethod.PUT)
	public HttpStatus updateStudent(@RequestBody Student student) {
		return studentService.updateStudent(student)  ? HttpStatus.ACCEPTED : HttpStatus.BAD_REQUEST;
	}
	
	@RequestMapping(value = "/student/{id}", method = RequestMethod.GET)
	public Optional<Student> getStudent(@PathVariable Long id) {
		return studentService.getById(id);
	}
}