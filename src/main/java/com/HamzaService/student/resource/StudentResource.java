package com.HamzaService.student.resource;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.HamzaService.student.model.Student;
import com.HamzaService.student.service.StudentService;

@RestController
@RequestMapping("/students")
public class StudentResource {
	
	@Autowired
	private StudentService studentService;

	@GetMapping("/all")
	public ResponseEntity<Iterable<Student>> getAllEmployees () {
		Iterable<Student> students = studentService.getStudents();
        return new ResponseEntity<>(students, HttpStatus.OK);
    }
	
	@GetMapping("/find/{id}")
	public ResponseEntity<Optional> getstudentById(@PathVariable("id") Long id){
		Optional student=this.studentService.findStudentById(id);
		 return new ResponseEntity<>(student, HttpStatus.OK);
	}
	
	
	@PostMapping("/add")
	public ResponseEntity<Student> addStudent(@RequestBody Student student){
		Student newStudent=this.studentService.addStudent(student);	
		return new ResponseEntity<>(newStudent, HttpStatus.CREATED);
	}
	
	@PutMapping("/update")
	public ResponseEntity<Student> updateStudent(@RequestBody Student student){
		Student updateStudent=this.studentService.updateStudent(student);	
		return new ResponseEntity<>(updateStudent, HttpStatus.OK);
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<?> deleteStudent(@PathVariable("id") Long id){
		this.studentService.deleteStudent(id);	
		return new ResponseEntity<>(HttpStatus.OK);
	}
}
