package com.venkat.studentApp.repository;

import com.venkat.studentApp.model.CourseSubject;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseSubjectRepository extends JpaRepository<CourseSubject, Integer> {
}
