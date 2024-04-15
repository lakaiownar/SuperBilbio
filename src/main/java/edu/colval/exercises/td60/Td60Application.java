package edu.colval.exercises.td60;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("edu.colval.exercises.td60.dal")
@EntityScan("edu.colval.exercises.td60.bll.model")
public class Td60Application {

	public static void main(String[] args) {
		SpringApplication.run(Td60Application.class, args);
	}

}
