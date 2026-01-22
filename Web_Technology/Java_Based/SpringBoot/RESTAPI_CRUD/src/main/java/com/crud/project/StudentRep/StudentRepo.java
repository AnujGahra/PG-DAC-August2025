package com.crud.project.StudentRep;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.project.model.Student;

public interface StudentRepo extends JpaRepository<Student, Integer> {

}
