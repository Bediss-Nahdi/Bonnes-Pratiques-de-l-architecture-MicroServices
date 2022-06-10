package com.customerservice.services;

import java.util.List;

import com.customerservice.dto.CustomerReponseDTO;
import com.customerservice.dto.CustomerRequestDTO;

public interface CustomerService {
	CustomerReponseDTO save(CustomerRequestDTO customerRequestDTO);

	CustomerReponseDTO getCustumer(String id);

	CustomerReponseDTO updateCustumer(CustomerRequestDTO custumerRequestDTO);

	List<CustomerReponseDTO> listCustumers();

	CustomerReponseDTO updateCustumer(CustomerRequestDTO customerRequestDTO, String id);

	void deleteCustomer(String id);

}
