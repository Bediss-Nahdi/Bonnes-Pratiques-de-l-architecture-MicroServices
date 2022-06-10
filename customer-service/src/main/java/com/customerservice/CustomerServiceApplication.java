package com.customerservice;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.context.annotation.Bean;

import com.customerservice.dto.CustomerRequestDTO;
import com.customerservice.services.CustomerService;

@SpringBootApplication//( exclude = JpaRepositoriesAutoConfiguration.class)
public class CustomerServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerServiceApplication.class, args);
	}
	
	@Bean
	CommandLineRunner start(CustomerService customerService) {
		return args ->{
			customerService.save(new CustomerRequestDTO("C01","Bédiss","helloWorld@gmail.com"));
			customerService.save(new CustomerRequestDTO("C02","Bdouze","hellotoi@gmail.com"));
			customerService.save(new CustomerRequestDTO("C03","Btreize","world@gmail.com"));
			
		};
	}

}
