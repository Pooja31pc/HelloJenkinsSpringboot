package com.example.jenkins.jenkinsexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class JenkinsSpringBootExampleApplication {

	@RequestMapping("/")
	String home() {
		return "Hello World Spring Boot! it's Pooja";
	}

	public static void main(String[] args) {
		SpringApplication.run(JenkinsSpringBootExampleApplication.class, args);
	}

}
