package com.customerservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// Même Structure que l'entité

// C'est juste un OBJET !!!!

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerRequestDTO {
	private String id;

	private String name;

	private String email;
}
