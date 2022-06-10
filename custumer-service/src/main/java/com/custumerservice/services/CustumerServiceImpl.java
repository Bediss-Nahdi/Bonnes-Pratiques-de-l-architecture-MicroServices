package com.custumerservice.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.custumerservice.dto.CustumerReponseDTO;
import com.custumerservice.dto.CustumerRequestDTO;
import com.custumerservice.repositories.CustumerRepository;

@Service
@Transactional
public class CustumerServiceImpl implements CustumerService{
	
	
	private CustumerRepository custumerRepository;
	
	

	public CustumerServiceImpl(CustumerRepository custumerRepository) {
		this.custumerRepository = custumerRepository;
	}

	@Override
	public CustumerReponseDTO save(CustumerRequestDTO custumerRequestDTO) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CustumerReponseDTO getCustumer(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CustumerReponseDTO updateCustumer(CustumerRequestDTO custumerRequestDTO) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<CustumerReponseDTO> listCustumers() {
		// TODO Auto-generated method stub
		return null;
	}

}
