package com.raaji.springrestweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SampleApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context =SpringApplication.run(SampleApplication.class, args);
		SampleEntity s=context.getBean(SampleEntity.class);
		s.setId(1);
		s.setName("Raaji");
		s.setYear(1986);
		System.out.println(s);
	}
}
