package com.cectus4.testr4.controller;

import com.cectus4.testr4.model.Student;
import com.cectus4.testr4.service.StudentService;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/students")
@AllArgsConstructor
public class StudentController {

    private final StudentService service;

    @GetMapping
    private List<Student> findAllStudent() {
        return service.findAllStudent();
    }

    @PostMapping("save_student")
    public String saveStudent(@RequestBody Student student) {
        service.saveStudent(student);
        return "Student saved successfully";
    }

    @GetMapping("/{email}")
    public Student findByEmail(@PathVariable String email) {
        return service.findStudentByEmail(email);
    }

    @PutMapping("update_student")
    public Student updateStudent(@RequestBody Student student) {
        return service.updateStudent(student);
    }

    @DeleteMapping("delete_student/{email}")
    @Transactional
    public void deleteStudent(@PathVariable String email) {
        service.deleteStudent(email);
    }

}
