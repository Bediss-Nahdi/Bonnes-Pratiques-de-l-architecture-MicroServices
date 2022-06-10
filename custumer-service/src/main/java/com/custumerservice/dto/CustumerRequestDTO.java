package com.custumerservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// Même Structure que l'entité
// C'est juste un OBJET !!!!

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustumerRequestDTO {
	private String id;

	private String name;

	private String email;
}
