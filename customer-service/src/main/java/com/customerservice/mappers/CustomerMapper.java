package com.customerservice.mappers;

import com.customerservice.dto.CustomerReponseDTO;
import com.customerservice.dto.CustomerRequestDTO;
import com.customerservice.entities.Customer;

//@Mapper(componentModel = "spring")
public interface CustomerMapper {
	
	CustomerReponseDTO customerToCustumerReponseDTO (Customer customer);
	Customer customerRequestDTOToCustumer(CustomerRequestDTO customerReponseDTO );

}
