package com.cectus4.testr4.service;

import com.cectus4.testr4.model.Student;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface StudentService {

    List<Student> findAllStudent();
    Student saveStudent(Student student);
    Student findStudentByEmail(String email);
    Student updateStudent(Student student);
    void deleteStudent(String email);

}
