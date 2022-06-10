package com.custumerservice.services;

import java.util.List;

import com.custumerservice.dto.CustumerReponseDTO;
import com.custumerservice.dto.CustumerRequestDTO;


public interface CustumerService {
	CustumerReponseDTO save (CustumerRequestDTO custumerRequestDTO);
	CustumerReponseDTO getCustumer (String id);
	CustumerReponseDTO updateCustumer (CustumerRequestDTO custumerRequestDTO);
	List<CustumerReponseDTO> listCustumers(); 
	
}
