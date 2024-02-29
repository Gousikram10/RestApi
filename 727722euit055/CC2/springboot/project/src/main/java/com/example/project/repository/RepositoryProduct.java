package com.example.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.project.model.Product;

public interface RepositoryProduct extends JpaRepository<Product,Integer>{

    
}
