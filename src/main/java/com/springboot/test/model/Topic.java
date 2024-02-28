package com.springboot.test.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Topic {
	
	@Id
	String id;
	String name;
	String descrption;
	
	
	public Topic() {
	}
	public Topic(String id, String name, String descrption) {
		super();
		this.id = id;
		this.name = name;
		this.descrption = descrption;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescrption() {
		return descrption;
	}
	public void setDescrption(String descrption) {
		this.descrption = descrption;
	}
	
	
}
