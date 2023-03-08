package com.venkat.studentApp.service;

import com.venkat.studentApp.model.Student;
import com.venkat.studentApp.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public Student save(Student student){
        return studentRepository.save(student);
    }

    public Student update(Student student){
        return studentRepository.save(student);
    }

    public boolean deleteStudent(Student student){
        try{
            studentRepository.delete(student);
            return true;
        }catch (Exception e){
            return false;
        }
    }

    public List<Student> getAll(){
        return studentRepository.findAll();
    }

    public Student getStudentById(int id){
        return studentRepository.findById(id).get();
    }

}
