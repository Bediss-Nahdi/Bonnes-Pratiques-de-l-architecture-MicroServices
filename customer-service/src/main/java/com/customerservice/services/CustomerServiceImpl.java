package com.customerservice.services;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.customerservice.dto.CustomerReponseDTO;
import com.customerservice.dto.CustomerRequestDTO;
import com.customerservice.entities.Customer;
import com.customerservice.mappers.CustomerMapper;
import com.customerservice.repositories.CustomerRepository;

@Service
@Transactional
public class CustomerServiceImpl implements CustomerService{
	
	
	private CustomerRepository customerRepository;
	
	private CustomerMapper customerMapper;
	



	public CustomerServiceImpl(CustomerRepository custumerRepository, CustomerMapper customerMapper) {
		this.customerRepository = custumerRepository;
		this.customerMapper = customerMapper;
	}

	@Override
	public CustomerReponseDTO save(CustomerRequestDTO customerRequestDTO) {
		Customer customer = customerMapper.customerRequestDTOToCustumer(customerRequestDTO);
		Customer savedCustomer =  customerRepository.save(customer);
		CustomerReponseDTO customerReponseDTO = customerMapper.customerToCustumerReponseDTO(savedCustomer);
		return customerReponseDTO;
	}

	@Override
	public CustomerReponseDTO getCustumer(String id) {
		Customer customer = customerRepository.findById(id).get();
		
		
		return customerMapper.customerToCustumerReponseDTO(customer);
	}

	@Override
	public CustomerReponseDTO updateCustumer(CustomerRequestDTO customerRequestDTO, String id) {
		Customer customer = customerMapper.customerRequestDTOToCustumer(customerRequestDTO);
		customer.setId(id);
		Customer savedCustomer =  customerRepository.save(customer);
		CustomerReponseDTO customerReponseDTO = customerMapper.customerToCustumerReponseDTO(savedCustomer);
		return customerReponseDTO;
	}
	@Override
	public CustomerReponseDTO updateCustumer(CustomerRequestDTO customerRequestDTO) {
		Customer customer = customerMapper.customerRequestDTOToCustumer(customerRequestDTO);
		
		Customer savedCustomer =  customerRepository.save(customer);
		CustomerReponseDTO customerReponseDTO = customerMapper.customerToCustumerReponseDTO(savedCustomer);
		return customerReponseDTO;
	}

	@Override
	public List<CustomerReponseDTO> listCustumers() {
		List<Customer> customers = customerRepository.findAll();
		List<CustomerReponseDTO> customerReponseDTOs = 
				customers.stream()
				.map(cust->customerMapper.customerToCustumerReponseDTO(cust))
				.collect(Collectors.toList());
		return customerReponseDTOs;
	}

	@Override
    public void deleteCustomer(String id) {
		customerRepository.deleteById(id);
    }
	
	


}
