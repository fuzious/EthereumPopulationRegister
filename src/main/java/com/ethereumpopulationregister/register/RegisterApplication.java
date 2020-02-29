package com.ethereumpopulationregister.register;

import org.apache.log4j.BasicConfigurator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RegisterApplication {

	public static void main(String[] args) {
		BasicConfigurator.configure();
		SpringApplication.run(RegisterApplication.class, args);
	}

}
