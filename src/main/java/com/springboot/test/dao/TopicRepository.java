package com.springboot.test.dao;

import org.springframework.data.repository.CrudRepository;

import com.springboot.test.model.Topic;

public interface TopicRepository extends CrudRepository<Topic, String> {

}
