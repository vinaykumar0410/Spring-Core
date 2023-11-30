package com;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Student s = context.getBean("std",Student.class);
		System.out.println(s.id);
		System.out.println(s.name);
		System.out.println(s.adr.city);
		context.close();
	}
}
