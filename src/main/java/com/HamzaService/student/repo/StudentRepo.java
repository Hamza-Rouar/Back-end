package com.HamzaService.student.repo;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.HamzaService.student.model.Student;

@Repository
public interface StudentRepo extends CrudRepository<Student, Long> {
}
