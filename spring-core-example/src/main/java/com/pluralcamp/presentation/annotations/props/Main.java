package com.pluralcamp.presentation.annotations.props;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class Main {

	public static void main(String[] args) {
	
		
		AbstractApplicationContext context = 
				new AnnotationConfigApplicationContext();
		
		AnnotationConfigApplicationContext annotationsContext = 
				(AnnotationConfigApplicationContext)context;
		
		annotationsContext.scan("com.pluralcamp.presentation.annotations.props");
		annotationsContext.refresh();
		
		
		//Constructor DI with annotations (Dependency Injection)
		HelloWorld helloWorld = (HelloWorld) annotationsContext.getBean("helloWorld");
		System.out.println(helloWorld.getUuid());
		System.out.println(helloWorld.getHello());
		
		HelloWorld helloWorld2 = (HelloWorld) annotationsContext.getBean("helloWorld");
		System.out.println(helloWorld2.getUuid());
		System.out.println(helloWorld2.getHello());
		
		context.close();
	}
}
