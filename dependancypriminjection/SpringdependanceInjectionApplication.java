package com.spring.dependancypriminjection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringdependanceInjectionApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringdependanceInjectionApplication.class, args);
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/dependancypriminjection/applicationContext.xml");
		
	//	Resource r=new ClassPathResource("applicationContext.xml");
	// BeanFactory factory=new XmlBeanFactory(context);
		Employee employee=(Employee) context.getBean("e");
		employee.show();
	}

}
