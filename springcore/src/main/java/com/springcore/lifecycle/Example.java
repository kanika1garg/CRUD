package com.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Example {
	private String course;

	public Example(String course) {
		super();
		this.course = course;
	}

	@Override
	public String toString() {
		return "Example [course=" + this.course + "]";
	}
	@PostConstruct
	public void Start() {
		System.out.println("inside start method");
		
	}
	@PreDestroy
	public void end() {
		System.out.println("inside ending method");
	}
	
	
	

}
