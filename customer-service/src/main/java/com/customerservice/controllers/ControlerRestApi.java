package com.customerservice.controllers;

import java.util.List;
import java.util.UUID;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.customerservice.dto.CustomerReponseDTO;
import com.customerservice.dto.CustomerRequestDTO;
import com.customerservice.services.CustomerService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping(path = "/api")
public class ControlerRestApi {
	
	private CustomerService customerService;

	public ControlerRestApi(CustomerService customerService) {
		super();
		this.customerService = customerService;
	}
	
	
	@GetMapping(path="/customers")
	public List<CustomerReponseDTO> getAllCustomer(){
		return customerService.listCustumers();
	}
	
	@PostMapping(path="/customers")
	public CustomerReponseDTO save (@RequestBody CustomerRequestDTO customerRequestDTO) {
		customerRequestDTO.setId(UUID.randomUUID().toString());
		return customerService.save(customerRequestDTO);
	}
	
	@GetMapping(path="/customer/{id}")
	public CustomerReponseDTO getCustomer (@PathVariable String id) {
		return customerService.getCustumer(id);
	}

}
