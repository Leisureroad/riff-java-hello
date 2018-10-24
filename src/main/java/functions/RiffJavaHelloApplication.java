package functions;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.function.Function;

@SpringBootApplication
public class RiffJavaHelloApplication {
    @Bean
    Function<String, String> sayHello() {
        return String::toUpperCase;
    }

	public static void main(String[] args) {
		SpringApplication.run(RiffJavaHelloApplication.class, args);
	}
}
