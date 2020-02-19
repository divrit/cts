package com.example.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.model.Student;
import com.example.repository.StudentRepository;

@Service
public class StudentService {
	
	@Autowired
	StudentRepository studentRepository;
	
	@Transactional
	public List<Student> getAllStudent() {
		return (List<Student>) studentRepository.findAll();
	}
	
	@Transactional
	public List<Student> findByFirstname(String name) {
		return studentRepository.findByFirstname(name);
	}

	@Transactional
	public Optional<Student> getById(Long id) {
		return studentRepository.findById(id);
	}

	@Transactional
	public void deleteStudent(Long personId) {
		studentRepository.deleteById(personId);
	}

	@Transactional
	public boolean addStudent(Student person) {
		return studentRepository.save(person) != null;
	}

	@Transactional
	public boolean updateStudent(Student person) {
		return studentRepository.save(person) != null;
	}
}