package com.springboot.test.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.springboot.test.model.Course;

public interface CourseRepository extends CrudRepository<Course, String>{

}
