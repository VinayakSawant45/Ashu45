package com.example.SpringRest.Service;

import com.example.SpringRest.Entity.Student;

import java.util.List;

public interface StudentService {
    List<Student> fetchStudentList();
    Student saveStudent(Student studentDepartment);
    Student updateStudent(Student Department , Long departmentId);
    void deleteStudentByRollNo(Long departmentId);



}
