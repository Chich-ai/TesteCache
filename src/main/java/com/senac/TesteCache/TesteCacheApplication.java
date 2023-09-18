package com.senac.TesteCache;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@EnableCaching
@SpringBootApplication
public class TesteCacheApplication {

	public static void main(String[] args) {
		SpringApplication.run(TesteCacheApplication.class, args);
	}

}
