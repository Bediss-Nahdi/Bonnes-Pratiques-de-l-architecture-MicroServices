package com.customerservice.dto;

import lombok.Data;

// ici la structure peut changer

@Data
public class CustomerReponseDTO {
	private String id;

	private String name;

	private String email;
}
