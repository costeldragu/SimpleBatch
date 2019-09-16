package com.mdc.simplebatch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.liquibase.LiquibaseProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableConfigurationProperties(LiquibaseProperties.class)
@EnableJpaRepositories(basePackages = "com.mdc.simplebatch.dao", entityManagerFactoryRef = "entityManager")
public class SimpleBatchApplication {

	public static void main(String[] args) {
		SpringApplication.run(SimpleBatchApplication.class, args);
	}

}
