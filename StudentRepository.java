package com.example.repository;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.model.Student;

public interface StudentRepository extends CrudRepository<Student, Long> {
	List<Student> findByFirstname(String name);
}