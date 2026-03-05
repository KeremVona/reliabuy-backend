package com.commentedcode.demo;

import org.springframework.boot.SpringApplication;

public class TestReliabuyBackendApplication {

	public static void main(String[] args) {
		SpringApplication.from(ReliabuyBackendApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
