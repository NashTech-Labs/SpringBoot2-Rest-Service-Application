package com.nashtech.springboot.rest.api.repo;

import com.nashtech.springboot.rest.api.student.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

}
