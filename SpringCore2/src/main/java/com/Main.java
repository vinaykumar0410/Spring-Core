package com;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		Student s = context.getBean(Student.class);
		System.out.println(s.id);
		System.out.println(s.name);
		System.out.println(s.adr.dNo);
		System.out.println(s.adr.city);
		context.close();
	}
}
