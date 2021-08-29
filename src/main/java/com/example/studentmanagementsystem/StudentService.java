package com.example.studentmanagementsystem;

import com.example.studentmanagementsystem.Student;
import java.util.List;

public interface StudentService {
    List<Student> getAllStudents();

    Student saveStudent(Student student);

    Student getStudentbyId(Long id);
    Student updateStudent(Student student);

    void deleteStudentById(Long id);
}
