package com.sms.io.studentmanagementsystem.repository;

import com.sms.io.studentmanagementsystem.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
