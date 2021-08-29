package com.example.studentmanagementsystem;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.studentmanagementsystem.Student;


public interface StudentRepository extends JpaRepository<Student, Long> {

}
