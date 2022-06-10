package com.customerservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.customerservice.entities.Customer;


// 1 // Ici le repository manipule l'entité @Entity (pour accéder à la BDD)
@Repository
public interface CustomerRepository extends JpaRepository<Customer, String>{

}
