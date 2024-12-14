package com.cectus4.testr4.service.impl;

import com.cectus4.testr4.model.Student;
import com.cectus4.testr4.repository.InMemoryStudentDAO;
import com.cectus4.testr4.service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class InMemoryStudentServiceImpl implements StudentService {

    private final InMemoryStudentDAO repository;

    @Override
    public List<Student> findAllStudent(){
        return repository.findAllStudent();
    }

    @Override
    public Student saveStudent(Student student){
        return repository.saveStudent(student);
    }

    @Override
    public Student findStudentByEmail(String email){
        return repository.findStudentByEmail(email);
    }

    @Override
    public Student updateStudent(Student student){
        return repository.updateStudent(student);
    }

    @Override
    public void deleteStudent(String email){
        repository.deleteStudent(email);
    }
}
