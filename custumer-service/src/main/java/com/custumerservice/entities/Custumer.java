package com.custumerservice.entities;

import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor @NoArgsConstructor
public class Custumer {
	
	
	private String id;
	
	private String name;
	
	private String email;
	

}
