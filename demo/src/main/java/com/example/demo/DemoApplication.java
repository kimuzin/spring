package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 *@SpringBootApplication 어노테이션은 
 *기존 Spring에서 사용하는 @Configuration, @EnableAutoConfiguration, @EnableWebMvc, @ComponentScan 을 포함하며 
 *추가적인 설정파일 없이도 실행가능한 어플리케이션을 구성할 수 있도록 해주는 고마운 존재다.
 */
@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}
