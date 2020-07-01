package com.common.exception;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.common.exception")
public class CommonExceptionApplication {

	public static void main(String[] args) {
		SpringApplication.run(CommonExceptionApplication.class, args);
	}

}
