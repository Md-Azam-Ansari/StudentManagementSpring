package com.sun.restapi.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.sun.restapi.entity.Student;

public interface StudentRepo  extends JpaRepository<Student, Integer>{

}
