package com.cybage.pms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "com.cybage")
@EnableJpaRepositories(basePackages="com.cybage.dao")
@EntityScan(basePackages="com.cybage.model")
public class SpringRestMvcApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringRestMvcApplication.class, args);
	}

}
