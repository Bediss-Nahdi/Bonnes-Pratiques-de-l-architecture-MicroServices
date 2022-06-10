package com.customerservice.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.customerservice.dto.CustomerReponseDTO;
import com.customerservice.dto.CustomerRequestDTO;
import com.customerservice.repositories.CustomerRepository;

@Service
@Transactional
public class CustomerServiceImpl implements CustomerService{
	
	
	private CustomerRepository custumerRepository;
	

	public CustomerServiceImpl(CustomerRepository custumerRepository) {
		this.custumerRepository = custumerRepository;
	}

	@Override
	public CustomerReponseDTO save(CustomerRequestDTO customerRequestDTO) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CustomerReponseDTO getCustumer(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CustomerReponseDTO updateCustumer(CustomerRequestDTO custumerRequestDTO) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<CustomerReponseDTO> listCustumers() {
		// TODO Auto-generated method stub
		return null;
	}
	
	


}
