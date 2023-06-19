package com.ty;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentMain {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("config.xml");
		
		Student student= (Student) applicationContext.getBean("mystudent");
		System.out.println("Student name is : "+student.getName());
		System.out.println("Student id is : "+student.getId());
		System.out.println("Student father is : "+student.getPrantesName());
		System.out.println("Student teacher is : "+student.getTeacherName());
		System.out.println("Student fees is : "+student.getFees());

	}

}
