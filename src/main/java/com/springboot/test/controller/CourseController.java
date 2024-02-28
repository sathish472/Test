package com.springboot.test.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.springboot.test.model.Course;
import com.springboot.test.service.CourseService;

@RestController
public class CourseController {
	
	private static final Logger LOGGER = LogManager.getLogger(CourseController.class);
	
 
	@Autowired
	private CourseService courseService;
	
	@RequestMapping("/Courses")
	public List<Course> getAllCourse(){
		return courseService.getAllCourses();
	}
	
	
	@RequestMapping("/log")
	public String printLog(){
		for(int i=0;i<=10000000;i++) {
			if(i%1000==0) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}
			   LOGGER.info("Test Logging: "+i);
			}
		 return "Log";
	}
	
	@RequestMapping("/Course/{id}")
	public Course getCourse(@PathVariable String id) {
		return courseService.getCourse(id);
	}
	
	@RequestMapping(method = RequestMethod.POST, value="/addCourse")
	public String addCourse(@RequestBody Course course) {
		courseService.addCourse(course);
		return "Course added";
	}
}