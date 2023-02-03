package com.pluralcamp.presentation.xml;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		//Crear el contexto de Spring -- Spring context
		AbstractApplicationContext context = 
				new ClassPathXmlApplicationContext("spring-config.xml");

		//Injection via property
		HelloWorld helloworld = (HelloWorld) context.getBean("helloWorld");
		System.out.println(helloworld.getName());
		
		//Injection via constructor
		HelloWorld helloworld2 = (HelloWorld) context.getBean("helloWorldConst");
		System.out.println(helloworld2.getName());
				
		context.close();
	}

}
