package com.springboot.leanspringboot;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LearnController {

	@RequestMapping("/courses")
	public List<Course> retrieveAllCourses() {
		return Arrays.asList(
			new Course(1, "Learn AWS", "Chirag"),
			new Course(1,"Spring Boot", "Chirag"),
			new Course(1,"Spring Beans", "Chirag")
		);
	}
}
