package com.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.project")
public class TutorialMvc9Application {

	public static void main(String[] args) {
		SpringApplication.run(TutorialMvc9Application.class, args);
	}
}
