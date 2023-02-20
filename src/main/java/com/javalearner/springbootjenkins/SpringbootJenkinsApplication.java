package com.javalearner.springbootjenkins;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringbootJenkinsApplication {

	@GetMapping("/index")
	public String getMessage(){
		return "Welcome to Java Learner";
	}
	public static void main(String[] args) {
		SpringApplication.run(SpringbootJenkinsApplication.class, args);
	}
//	git init
//	git add README.md
//	git commit -m "first commit"
//	git branch -M main
//	git remote add origin https://github.com/vivekreddy95/JenkinsDemo.git
//	git push -u origin main



}
