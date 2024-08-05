package com.example.SpringRest.Controller;

import com.example.SpringRest.Entity.Student;
import com.example.SpringRest.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
private StudentService studentService;
    @PostMapping("/student")
    public Student saveDepartment(@Valid @RequestBody Student student){
        return studentService.saveStudent(student);

    }
    @GetMapping("/student")
    public List<Student> fetchStudentList(){
        return studentService.fetchStudentList();
    }
    @PutMapping("/student/{rollNumber}")
    public Student updateStudent(@RequestBody Student student,@PathVariable("rollNumber") Long studentRollNo){
        return studentService.updateStudent(student,studentRollNo);
    }
    @DeleteMapping("/student/{rollNumber}")
    public String deleteStudentByRollNo(@PathVariable("rollNumber") Long studentRollNo){
        studentService.deleteStudentByRollNo(studentRollNo);
        return "Deleted Successfully";

    }


}
