package com.ivson.security;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class SbCacheableDataApplication {

	public static void main(String[] args) {
		SpringApplication.run(SbCacheableDataApplication.class, args);
	}
}
