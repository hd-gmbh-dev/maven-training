package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// here we cannot use awaitility (`await()`) because it's a test-scoped dependency
// import static org.awaitility.Awaitility.await;

@SpringBootApplication
public class Phase4Application {

	public static void main(String[] args) {
		SpringApplication.run(Phase4Application.class, args);
	}

}
