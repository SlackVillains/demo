package com.anz.wholesale.demo.starter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
@EnableAutoConfiguration
@EntityScan(basePackages= "com.anz.wholesale.*")

public class WholesaleDemoStarter extends SpringBootServletInitializer{
	
	public static void main(String args[]) {
		SpringApplication.run(WholesaleDemoStarter.class, args);
	}

}
