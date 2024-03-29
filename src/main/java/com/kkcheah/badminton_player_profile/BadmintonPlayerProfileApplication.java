package com.kkcheah.badminton_player_profile;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;

@SpringBootApplication
public class BadmintonPlayerProfileApplication {

	public static void main(String[] args) {
		SpringApplication.run(BadmintonPlayerProfileApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext ctx){
		return args -> {
			System.out.println("Inspect beans provided by Spring Boot:");

			String[] beanNames = ctx.getBeanDefinitionNames();
			Arrays.sort(beanNames);
			for (String beanName: beanNames){
				System.out.println("Bean no:" + Arrays.asList(beanNames).indexOf(beanName) + " - bean name: " + beanName);
			}
		};

	}

}
