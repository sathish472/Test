package com.springboot.test.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.test.dao.CourseRepository;
import com.springboot.test.model.Course;



@Service
public class CourseService {
	
	@Autowired
	CourseRepository courseRepository;

	
	public List<Course> getAllCourses(){
		List<Course> list=new ArrayList<>();
		courseRepository.findAll().forEach(list::add);
		return list;
	}
	
	public Course getCourse(String id) {
		return courseRepository.findOne(id);
	}
	
	public void addCourse(Course course) {
		courseRepository.save(course);
	}
}
