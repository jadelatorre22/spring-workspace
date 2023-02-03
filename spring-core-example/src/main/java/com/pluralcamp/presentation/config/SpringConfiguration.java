package com.pluralcamp.presentation.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfiguration {

	@Bean(name = "helloWorld")
	public HelloWorld helloWorld() {
		HelloWorld h = new HelloWorld();
		h.setHello("Hello world from Code as configuration! :D");
		return h;
	}
}
