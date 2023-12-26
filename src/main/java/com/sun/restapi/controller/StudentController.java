package com.sun.restapi.controller;

import java.util.List;
import com.sun.restapi.repo.StudentRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import com.sun.restapi.entity.Student;

@RestController
public class StudentController {

	@Autowired
	StudentRepo repo;

	@GetMapping("/students")
	public List<Student> getAllStudents() {

		List<Student> students = repo.findAll();
		return students;
	}

	@GetMapping("/students/{id}")
	public Student getStudent(@PathVariable int id) {

		Student student = repo.findById(id).get();
		return student;
	}

	@PostMapping("/student/add")
	@ResponseStatus(code = HttpStatus.CREATED)
	public void createStudent(@RequestBody Student student) {
		repo.save(student);
	}

	@PutMapping("/student/update/{id}")
	public Student SaveOrEmployee(@RequestBody Student student) {

		repo.save(student);
		return student;
	}

	public void removeStudent(@PathVariable int id) {
		Student student = repo.findById(id).get();
		repo.delete(student);
	}
}
