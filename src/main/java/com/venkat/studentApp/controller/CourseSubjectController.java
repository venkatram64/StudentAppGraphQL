package com.venkat.studentApp.controller;

import com.venkat.studentApp.model.CourseSubject;
import com.venkat.studentApp.service.CourseSubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.Optional;

@Controller
public class CourseSubjectController {
    @Autowired
    private CourseSubjectService courseSubjectService;

    @QueryMapping
    Iterable<CourseSubject> courseSubjects(){
        return courseSubjectService.getAll();
    }

    @QueryMapping
    Optional<CourseSubject> courseSubjectById(@Argument int id){
        return courseSubjectService.getCourseSubjectById(id);
    }
}
