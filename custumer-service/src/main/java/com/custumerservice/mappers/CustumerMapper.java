package com.custumerservice.mappers;

import com.custumerservice.dto.CustumerReponseDTO;
import com.custumerservice.dto.CustumerRequestDTO;
import com.custumerservice.entities.Custumer;

@Mapper(componentModel = "spring")
public interface CustumerMapper {
	
	CustumerReponseDTO customerToCustumerReponseDTO (Custumer customer);
	Custumer customerRequestDTOToCustumer(CustumerRequestDTO customerReponseDTO );

}
