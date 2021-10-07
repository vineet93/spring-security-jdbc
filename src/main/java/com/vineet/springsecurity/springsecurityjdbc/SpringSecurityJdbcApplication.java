package com.vineet.springsecurity.springsecurityjdbc;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class SpringSecurityJdbcApplication {

	private static final Logger LOGGER= LoggerFactory.getLogger(SpringSecurityJdbcApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityJdbcApplication.class, args);

		LOGGER.info("Sample Log Statement");
	}

}
