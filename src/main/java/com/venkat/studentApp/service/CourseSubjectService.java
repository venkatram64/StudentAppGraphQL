package com.venkat.studentApp.service;

import com.venkat.studentApp.model.CourseSubject;
import com.venkat.studentApp.repository.CourseSubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CourseSubjectService {

    @Autowired
    private CourseSubjectRepository courseSubjectRepository;

    public CourseSubject save(CourseSubject subject){
        return courseSubjectRepository.save(subject);
    }

    public CourseSubject update(CourseSubject subject){
        return courseSubjectRepository.save(subject);
    }

    public List<CourseSubject> getAll(){
        return courseSubjectRepository.findAll();
    }

    public Optional<CourseSubject> getCourseSubjectById(int id){
        return courseSubjectRepository.findById(id);
    }

    public boolean deleteCourseSubject(CourseSubject courseSubject){
        try {
            courseSubjectRepository.delete(courseSubject);
            return true;
        }catch (Exception e){
            return false;
        }
    }
}
