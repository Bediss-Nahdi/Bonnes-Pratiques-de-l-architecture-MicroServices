package com.customerservice.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor @NoArgsConstructor
public class Customer {
	
	@Id
	private String id;
	
	private String name;
	
	private String email;
	

}
