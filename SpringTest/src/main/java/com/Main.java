package com;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
//		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		Student student = context.getBean(Student.class);
		System.out.println(student.id);
		System.out.println(student.name);
		System.out.println(student.address.dNo);
		System.out.println(student.address.city);
	}
}
