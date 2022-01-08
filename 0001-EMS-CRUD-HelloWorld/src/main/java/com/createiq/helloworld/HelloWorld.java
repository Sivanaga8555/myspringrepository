package com.createiq.helloworld;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloWorld {
	
	public HelloWorld() {
		// TODO Auto-generated constructor stub
	}
	
	public void sayHello() {
		System.out.println("Hello World..!");
	}
	
	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
		HelloWorld helloWorld = (HelloWorld) applicationContext.getBean("hello");
		helloWorld.sayHello();
		
		
		
	}

}
