package com.Springpro.Springpro.Repository;

import com.Springpro.Springpro.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {
}
