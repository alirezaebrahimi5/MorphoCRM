package MorphoCRM.com;

import org.springframework.boot.SpringApplication;

public class TestComApplication {

	public static void main(String[] args) {
		SpringApplication.from(ComApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
