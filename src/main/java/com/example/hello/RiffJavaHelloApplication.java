package com.example.hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.function.Function;

@SpringBootApplication
public class RiffJavaHelloApplication {
    @Bean
    Function<String, String> sayhello() {
        return f->"Hello " + f;
    }

	public static void main(String[] args) {
		SpringApplication.run(RiffJavaHelloApplication.class, args);
	}
}
