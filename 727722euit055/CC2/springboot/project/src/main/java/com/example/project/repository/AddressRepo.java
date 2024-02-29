package com.example.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.project.model.Address;

@Repository
public interface AddressRepo extends JpaRepository<Address,Integer>{
    
}
