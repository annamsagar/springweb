package com.livein.Springwebfirst;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringwebfirstApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringwebfirstApplication.class, args);
		System.out.println("Hello");
	}
}