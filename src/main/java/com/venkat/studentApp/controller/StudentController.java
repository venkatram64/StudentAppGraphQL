package com.venkat.studentApp.controller;

import com.venkat.studentApp.model.CourseSubject;
import com.venkat.studentApp.model.Student;
import com.venkat.studentApp.service.CourseSubjectService;
import com.venkat.studentApp.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

@Controller
public class StudentController {
    @Autowired
    private StudentService studentService;
    @Autowired
    CourseSubjectService subjectService;

    @QueryMapping
    Iterable<Student> students(){
        return studentService.getAll();
    }

    @MutationMapping
    Student addStudent(@Argument StudentInput student) {
        CourseSubject cs = subjectService.getCourseSubjectById(student.courseSubjectId)
                .orElseThrow(() -> new IllegalArgumentException("CourseSubject not found"));
        Student s = new Student(student.firstName, student.lastName, student.studentId, student.age, cs);
        return studentService.save(s);
    }

    record StudentInput(String firstName, String lastName, String studentId, int age, int courseSubjectId){}
}
