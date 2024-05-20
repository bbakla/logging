package org.example.logback;

import lombok.RequiredArgsConstructor;
import org.example.logback.anothersubpackage.AnotherChildClass1;
import org.example.logback.subpackage.ChildClass1;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RequiredArgsConstructor
public class LogbackApplication implements CommandLineRunner {

	private final ChildClass1 childClass1;
	private final AnotherChildClass1 anotherChildClass1;

	public static void main(String[] args) {
		SpringApplication.run(LogbackApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
    for (int i = 0; i < 100; i++) {
      childClass1.createRandomLogs();
      anotherChildClass1.createRandomLogs();
		}


	}
}
