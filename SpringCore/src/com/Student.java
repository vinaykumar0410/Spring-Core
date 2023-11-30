package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component("student")
public class Student {
	@Value("${id}")
	int id;
	@Value("${name}")
	String name;
	@Autowired
//	@Qualifier("adr1")
	Address adr;
//	public Student(int id, String name) {
//		super();
//		this.id = id;
//		this.name = name;
//	}
//	public Address getAdr() {
//		return adr;
//	}
//	public void setAdr(Address adr) {
//		this.adr = adr;
//	}
//	void myOpening() {
//		System.out.println("Bean created");
//	}
//	void myClosing() {
//		System.out.println("Bean destroyed");
//	}
	
}
