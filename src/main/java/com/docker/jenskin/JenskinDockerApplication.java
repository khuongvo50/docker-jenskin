package com.docker.jenskin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.docker.jenskin")
public class JenskinDockerApplication {

	public static void main(String[] args) {
		SpringApplication.run(JenskinDockerApplication.class, args);
	}

}
