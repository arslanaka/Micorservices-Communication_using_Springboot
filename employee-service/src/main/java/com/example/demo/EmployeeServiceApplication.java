package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;


//@EnableFeignClients enables component to scan for interfaces that are declared as feign client
@SpringBootApplication
@EnableFeignClients
public class EmployeeServiceApplication {



//	@Bean
//	public WebClient webClient(){
//		return WebClient.builder().build();
//	}
//

//	@Bean
//	public RestTemplate restTemplate(){
//		return new RestTemplate();
//	}

	public static void main(String[] args) {
		SpringApplication.run(EmployeeServiceApplication.class, args);
	}

}
