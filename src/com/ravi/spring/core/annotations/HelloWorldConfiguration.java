package com.ravi.spring.core.annotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloWorldConfiguration {
@Bean	
public HelloWorld getHelloWordBean(){
	return new HelloWorld();
}
}
