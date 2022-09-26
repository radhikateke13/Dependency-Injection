package com.spring.construcorWithDepObj;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(MainTest.class, args);
		//Resource r = new ClassPathResource("applicationContext.xml");
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/spring/construcorWithDepObj/applicationContext.xml");

		Employe s = (Employe) context.getBean("e");
		s.show();

	}

}
