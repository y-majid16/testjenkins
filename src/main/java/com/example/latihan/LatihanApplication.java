package com.example.latihan;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class LatihanApplication extends SpringBootServletInitializer implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(LatihanApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Helllo World");
		System.out.println("Helllo World11");
	}
}
