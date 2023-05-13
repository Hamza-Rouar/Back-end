package com.HamzaService.student.service;

import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.HamzaService.student.exception.UserNotFoundException;
import com.HamzaService.student.model.Student;
import com.HamzaService.student.repo.StudentRepo;

@Service
public class StudentService {
	
	@Autowired
	private StudentRepo studentrepo;

	public Student addStudent(Student student) {
		 student.setStudentCode(UUID.randomUUID().toString());
		 return studentrepo.save(student);
		
	}
	
	public Iterable<Student> getStudents(){
		return studentrepo.findAll();
	}
	
	public Student updateStudent(Student student) {
		return studentrepo.save(student);
	}
	
	public Optional<Student> findStudentById(final Long id) {
		return studentrepo.findById(id);
	}

	public void deleteStudent(final Long id) {
		studentrepo.deleteById(id);
	}
}
