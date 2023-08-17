package com.digit.springBoot.springbootdemo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.digit.springBoot.springbootdemo.bean.Student;

@RestController
public class StudentController {

	@GetMapping("/Student")
	public Student getStudent() {
		Student s = new Student("Suman", "Kirtana", "Jashobanti");
		return s;
	}

	@GetMapping("/StudentList")
	public List<Student> getStudentList() {
		List<Student> l = new ArrayList<Student>();
		l.add(new Student("Suman1", "Kirtana1", "Jashobanti1"));
		l.add(new Student("Suman2", "Kirtana2", "Jashobanti2"));
		l.add(new Student("Suman3", "Kirtana3", "Jashobanti3"));
		l.add(new Student("Suman4", "Kirtana4", "Jashobanti4"));

		return l;
	}

	@GetMapping("/Student/{name}/{fname}")
	public Student getStudentPathVariable(@PathVariable("name") String name, @PathVariable("fname") String fname) {
		Student s = new Student(name, fname, "lkjhgf");
		return s;
	}

	@PutMapping("/UpdateStudent")
	public Student UpdateStudent() {
		Student s = new Student("Suman", "Kirtana", "Jashobanti");
		System.out.println("Updated");
		return s;

	}

	
	@DeleteMapping("/DeleteStudent")
	public Student deleteStudent() {
		Student s = new Student("Suman", "Kirtana", "Jashobanti");
		System.out.println("Deleted");
		return s;

	}

	@PostMapping("/Student/create")
	@ResponseStatus(HttpStatus.CREATED)
	public Student createStudent(@RequestBody Student student) {
		System.out.println(student.getName());
		System.out.println(student.getFname());
		System.out.println(student.getMname());
		return student;
	}

}
