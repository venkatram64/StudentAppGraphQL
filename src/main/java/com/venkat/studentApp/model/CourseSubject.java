package com.venkat.studentApp.model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class CourseSubject {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String subjectName;
    @OneToMany(mappedBy = "courseSubject", cascade = CascadeType.MERGE)
    private List<Student> students = new ArrayList<>();

    public CourseSubject(){}

    public CourseSubject(String subjectName, List<Student> students) {
        this.subjectName = subjectName;
        this.students = students;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
}
