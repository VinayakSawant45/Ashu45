package com.example.SpringRest.Repository;

import com.example.SpringRest.Entity.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student, Long> {

}
