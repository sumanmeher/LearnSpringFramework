package com.digit.learnspringframework.helloworld;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//Released in JDK 16.
//Eliminate creating getters and setters 
//public accessor methods, constructor
//equals, hashcode and toString are automatically created.

record Person (String name, int age) {};

@Configuration
public class HelloWorldConfiguration {

    @Bean
    public String name() {
        return "Suman";
    }
	
    @Bean
    public int age() {
        return 22;
    }

}
