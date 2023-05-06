package com.jcdpess.DraftApp;

import com.jcdpess.DraftApp.entities.Draft;
import com.jcdpess.DraftApp.repositories.DraftRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
public class DraftAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(DraftAppApplication.class, args);
	}

	@Bean
	CommandLineRunner runner(DraftRepository dr){
		return args -> {
			Draft draft = new Draft(
					"laconchadetumadre",
					"tuhermanaentanga",
					650,
					"JCs lair",
					new Date(),
					"MOM"
			);
			dr.insert(draft);
		};
	}
}
