package com.torryharris.practce;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PractceApplication {
	private static final Logger LOG= LoggerFactory.getLogger(PractceApplication.class);


	public static void main(String[] args) {
		LOG.info("Start");
		SpringApplication.run(PractceApplication.class, args);
		LOG.info("stop");
	}

}
