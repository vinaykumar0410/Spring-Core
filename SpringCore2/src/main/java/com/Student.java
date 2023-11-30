package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class Student {
	@Value("${unique}")
	int id;
	@Value("${name}")
	String name;
	@Autowired
//	@Qualifier("adr1")
	Address adr;
	
//	public Address getAdr() {
//		return adr;
//	}
//	public void setAdr(Address adr) {
//		this.adr = adr;
//	}
	//	public Student(Address adr) {
//		super();
//		this.adr = adr;
//	}
//	public int getId() {
//		return id;
//	}
//	public void setId(int id) {
//		this.id = id;
//	}
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public void create() {
//		System.out.println("Bean created");
//	}
//	public void destroy() {
//		System.out.println("Bean destroyed");
//	}
}
