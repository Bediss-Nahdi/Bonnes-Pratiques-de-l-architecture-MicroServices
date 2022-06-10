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
	
	@Autowired
	private CustomerRepository custumerRepository;
	@Autowired
	private CustomerMapper customerMapper;
	



//	public CustomerServiceImpl(CustomerRepository custumerRepository, CustomerMapper customerMapper) {
//		this.custumerRepository = custumerRepository;
//		this.customerMapper = customerMapper;
//	}

	@Override
	public CustomerReponseDTO save(CustomerRequestDTO customerRequestDTO) {
		Customer customer = customerMapper.customerRequestDTOToCustumer(customerRequestDTO);
		Customer savedCustomer =  custumerRepository.save(customer);
		CustomerReponseDTO customerReponseDTO = customerMapper.customerToCustumerReponseDTO(savedCustomer);
		return customerReponseDTO;
	}

	@Override
	public CustomerReponseDTO getCustumer(String id) {
		Customer customer = custumerRepository.findById(id).get();
		
		
		return customerMapper.customerToCustumerReponseDTO(customer);
	}

	@Override
	public CustomerReponseDTO updateCustumer(CustomerRequestDTO customerRequestDTO, String id) {
		Customer customer = customerMapper.customerRequestDTOToCustumer(customerRequestDTO);
		customer.setId(id);
		Customer savedCustomer =  custumerRepository.save(customer);
		CustomerReponseDTO customerReponseDTO = customerMapper.customerToCustumerReponseDTO(savedCustomer);
		return customerReponseDTO;
	}
	@Override
	public CustomerReponseDTO updateCustumer(CustomerRequestDTO customerRequestDTO) {
		Customer customer = customerMapper.customerRequestDTOToCustumer(customerRequestDTO);
		
		Customer savedCustomer =  custumerRepository.save(customer);
		CustomerReponseDTO customerReponseDTO = customerMapper.customerToCustumerReponseDTO(savedCustomer);
		return customerReponseDTO;
	}

	@Override
	public List<CustomerReponseDTO> listCustumers() {
		List<Customer> customers = custumerRepository.findAll();
		List<CustomerReponseDTO> customerReponseDTOs = 
				customers.stream()
				.map(cust->customerMapper.customerToCustumerReponseDTO(cust))
				.collect(Collectors.toList());
		return customerReponseDTOs;
	}

	@Override
    public void deleteCustomer(String id) {
		custumerRepository.deleteById(id);
    }
	
	


}
