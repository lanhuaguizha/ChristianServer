package com.christian;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan("com.christian.mapper")
public class ChristianServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChristianServerApplication.class, args);
	}
}
