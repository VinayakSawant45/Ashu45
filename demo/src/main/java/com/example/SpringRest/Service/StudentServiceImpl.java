package com.example.SpringRest.Service;

import com.example.SpringRest.Entity.Student;
import com.example.SpringRest.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentRepository studentRepository;

    @Override
    public List<Student> fetchStudentList() {
        return (List<Student>)
                studentRepository.findAll();
    }

    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Student updateStudent(Student student, Long studentRollNo) {
Student stuDB
    = studentRepository.findById(studentRollNo).get();

        if (Objects.nonNull(student.getStudentName())
                &&!"".equalsIgnoreCase( student.getStudentName())) {
            stuDB.setStudentName( student.getStudentName());

        }

        if (Objects.nonNull( student.getStudentAddress())
                && !"".equalsIgnoreCase( student.getStudentAddress()))
        { stuDB.setStudentAddress( student.getStudentAddress());

        }

        stuDB.setStudentAge (student.getStudentAge());

        stuDB.setStudentSubjects(student.getStudentSubjects());

        return studentRepository.save(stuDB);
    }

    @Override
    public void deleteStudentByRollNo(Long studentRollNo) {
        studentRepository.deleteById(studentRollNo);
    }
}
