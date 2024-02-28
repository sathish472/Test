package com.springboot.test.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.test.dao.TopicRepository;
import com.springboot.test.model.Topic;

@Service
public class TopicService {
	
	@Autowired
	private TopicRepository topicRepository;
	
	public List<Topic> getTopics(){
		List<Topic> list=new ArrayList<>();
		topicRepository.findAll().forEach(list::add);
		return list;
	}
	
	public Topic getTopic(String id) {
		return topicRepository.findOne(id);
	}
	
	
	public void addTopic(Topic topic) {
		topicRepository.save(topic);
	}

}
