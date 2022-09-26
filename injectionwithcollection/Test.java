package com.spring.injectionwithcollection;



import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.dependancypriminjection.SpringdependanceInjectionApplication;


public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SpringApplication.run(SpringdependanceInjectionApplication.class, args);
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/injectionwithcollection/applicationContext.xml");

		 Question q=(Question)context.getBean("q");
		 q.displayInfo();

		}
		}

	

