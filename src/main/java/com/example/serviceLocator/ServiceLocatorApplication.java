package com.example.serviceLocator;

import com.example.serviceLocator.service.MoviesService;
import com.example.serviceLocator.service.PartyService;
import com.example.serviceLocator.service.SiestaService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ServiceLocatorApplication {


	public static void main(String[] args) {
		SpringApplication.run(ServiceLocatorApplication.class, args);


	}

}
