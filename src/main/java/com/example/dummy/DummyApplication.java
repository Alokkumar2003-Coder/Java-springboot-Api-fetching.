package com.example.dummy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DummyApplication {

	public static void main(String[] args) {
		System.out.println(DummyController.myMethod());
		SpringApplication.run(DummyApplication.class, args);
	}

}
