package com.github.precompiler.reactivewarmup;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement

public class ReactiveWarmupApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReactiveWarmupApplication.class, args);
	}

}
