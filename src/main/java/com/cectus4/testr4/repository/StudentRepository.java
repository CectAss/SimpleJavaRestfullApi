package com.cectus4.testr4.repository;

import com.cectus4.testr4.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
    void deleteByEmail(String email);
    Student findByEmail(String email);
}
