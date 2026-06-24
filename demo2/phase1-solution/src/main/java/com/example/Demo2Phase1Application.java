package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// here we cannot use awaitility (`await()`) because it's a test-scoped dependency
// import static org.awaitility.Awaitility.await;

@SpringBootApplication
public class Demo2Phase1Application {

	public static void main(String[] args) {
		SpringApplication.run(Demo2Phase1Application.class, args);
	}

}
