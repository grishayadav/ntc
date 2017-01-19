package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
@ComponentScan(basePackages={"com.model","com.controller","com.example"})
@SpringBootApplication

public class NtcserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(NtcserverApplication.class, args);
	}
}
