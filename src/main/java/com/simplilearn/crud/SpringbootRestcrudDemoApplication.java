package com.simplilearn.crud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.simplilearn.crud")
public class SpringbootRestcrudDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootRestcrudDemoApplication.class, args);
	}

}
