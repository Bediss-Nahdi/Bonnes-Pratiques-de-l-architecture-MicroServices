package com.custumerservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.custumerservice.entities.Custumer;


// 1 // Ici le repository manipule l'entité @Entity (pour accéder à la BDD)

public interface CustumerRepository extends JpaRepository<Custumer, String>{

}
