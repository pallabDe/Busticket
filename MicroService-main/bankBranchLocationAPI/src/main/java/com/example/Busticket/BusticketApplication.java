package com.example.Busticket;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class BusticketApplication {

	public static void main(String[] args) {
		SpringApplication.run(BusticketApplication.class, args);
	}

}
