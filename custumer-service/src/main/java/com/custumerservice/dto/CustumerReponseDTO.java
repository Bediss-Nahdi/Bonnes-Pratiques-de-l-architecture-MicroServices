package com.custumerservice.dto;

import lombok.Data;

// ici la structure peut changer

@Data
public class CustumerReponseDTO {
	private String id;

	private String name;

	private String email;
}
