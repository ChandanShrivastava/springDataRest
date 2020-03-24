package com.chandan.aws.awsWebApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * @author Chandan Shrivastava
 *
 */ 
@ComponentScan("com.chandan")
@EnableJpaRepositories("com.chandan.aws.repository")
@EntityScan("com.chandan.aws.entity")
@SpringBootApplication
public class AwsWebAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(AwsWebAppApplication.class, args);
	}

}
