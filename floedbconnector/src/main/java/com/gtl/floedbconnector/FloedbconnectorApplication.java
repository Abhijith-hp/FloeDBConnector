package com.gtl.floedbconnector;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.gtl.floedbconnector.jpa_repositories")
@EnableMongoRepositories(basePackages = "com.gtl.floedbconnector.mongo_repositories")
public class FloedbconnectorApplication {

	public static void main(String[] args) {
		SpringApplication.run(FloedbconnectorApplication.class, args);
	}

}
