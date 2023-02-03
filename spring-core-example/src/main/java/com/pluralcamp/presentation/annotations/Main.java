package com.pluralcamp.presentation.annotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		AbstractApplicationContext context = 
				new AnnotationConfigApplicationContext();
		
		AnnotationConfigApplicationContext annotationsContext = 
				(AnnotationConfigApplicationContext)context;
		
		annotationsContext.scan("com.pluralcamp.presentation.annotations");
		annotationsContext.refresh();
		
		
		//Constructor DI with annotations (Dependency Injection)
		HelloWorld helloWorld = (HelloWorld) annotationsContext.getBean("helloWorldConst");
		System.out.println(helloWorld.getUuid());
		System.out.println(helloWorld.getHello());
		
		HelloWorld helloWorld2 = (HelloWorld) annotationsContext.getBean("helloWorldConst");
		System.out.println(helloWorld2.getUuid());
		System.out.println(helloWorld2.getHello());
		
		context.close();
	}

}
