package com.venkat.studentApp;

import com.venkat.studentApp.model.CourseSubject;
import com.venkat.studentApp.model.Student;
import com.venkat.studentApp.service.CourseSubjectService;
import com.venkat.studentApp.service.StudentService;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;


@SpringBootApplication
public class StudentAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentAppApplication.class, args);
	}

	@Bean
	ApplicationRunner applicationRunner(StudentService studentService,
										CourseSubjectService courseSubjectService){
		return args -> {

			CourseSubject cs = new CourseSubject("RDBMS Concepts", null);
			cs = courseSubjectService.save(cs);
			CourseSubject cs2 =	new CourseSubject("UML Concepts", null);
			cs2 = courseSubjectService.save(cs2);
			CourseSubject cs3 = new CourseSubject("Java", null);
			cs3 = courseSubjectService.save(cs3);
			CourseSubject cs4 = new CourseSubject("C++", null);
			cs4 = courseSubjectService.save(cs4);
			CourseSubject cs5 = new CourseSubject("Python", null);
			cs5 = courseSubjectService.save(cs5);
			CourseSubject cs6 = new CourseSubject("Oralce", null);
			cs6 = courseSubjectService.save(cs6);

			studentService.save(new Student("Ram","Veerareddy", "100", 26, cs5));
			studentService.save(new Student("Ram","Veerareddy", "100", 26, cs4));
			studentService.save(new Student("Laxman","Veerareddy", "100", 26, cs6));
			studentService.save(new Student("Venkat","Veerareddy", "103", 54, cs));
			studentService.save(new Student("Venkat","Veerareddy", "103", 54, cs2));
			studentService.save(new Student("Srijan","Veerareddy", "101", 23, cs3));
			studentService.save(new Student("Srijan","Veerareddy", "101", 23 , cs4));

		};
	}

}
