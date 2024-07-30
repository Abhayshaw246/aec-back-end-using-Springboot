package com.aec.training;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = {"com.aec.training","com.aec.training.service","com.aec.training.entity","com.aec.training.repositry"})

public class AecSpringBootMvcProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(AecSpringBootMvcProjectApplication.class, args);
	}

}
