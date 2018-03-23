package com.my.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.my.demo.bean.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
