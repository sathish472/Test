package com.springboot.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.test.model.Topic;
import com.springboot.test.service.TopicService;

@RestController
public class TopicController {
	
	@Autowired
	private TopicService topicSerivce;
	
	@RequestMapping("/")
	public String welcome() {
		return "Welcome";
	}
	
	@RequestMapping("/user")
	public String welcomeUser() {
		return "Welcome User";
	}
	
	@RequestMapping("/admin")
	public String welcomeAdmin() {
		return "Welcome Admin";
	}
	
	@RequestMapping("/topics")
	public List<Topic> getTopics() {
		return topicSerivce.getTopics();
	}
	
	@RequestMapping("/topic/{id}")
	public Topic getTopic(@PathVariable String id) {
		return topicSerivce.getTopic(id);
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/addtopic")
	public String addTopic(@RequestBody Topic topic) {
		topicSerivce.addTopic(topic);
		return "Topic added";
	}
	

}
