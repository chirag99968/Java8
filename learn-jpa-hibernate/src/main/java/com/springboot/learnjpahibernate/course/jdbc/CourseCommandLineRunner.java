package com.springboot.learnjpahibernate.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.springboot.learnjpahibernate.course.Course;
import com.springboot.learnjpahibernate.course.jpa.CourseJpaRepository;
import com.springboot.learnjpahibernate.course.springDataJpa.CourseSpringDataJpaRepository;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {

//	@Autowired
//	private CourseJpaRepository courseRepository;

	@Autowired
	private CourseSpringDataJpaRepository courseRepository;
	
	@Override
	public void run(String... args) throws Exception {
		courseRepository.save(new Course(1, "Learn AWS", "Chirag"));
		courseRepository.save(new Course(2, "Learn Spring", "Chirag"));
		courseRepository.save(new Course(3, "Learn SpringBoot", "Chirag"));
		
		courseRepository.deleteById((long)1);
		
		System.out.println(courseRepository.findById((long)2));
		System.out.println(courseRepository.findAll());
		System.out.println(courseRepository.findFirstByAuthor("Chirag"));
		//System.out.println(courseRepository.findByAuthor("Chirag"));
		//System.out.println(courseRepository.findAllByAuthor("Chirag"));
		
	}

	
}
