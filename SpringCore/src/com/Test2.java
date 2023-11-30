package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test2 {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans2.xml");
		Student student = context.getBean("student",Student.class);
		System.out.println(student.id);
		System.out.println(student.name);
		System.out.println(student.adr.doorNumber);
		System.out.println(student.adr.city);
	}
}
