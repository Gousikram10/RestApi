package com.example.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.project.model.Login;

public interface Repositorylogin extends JpaRepository<Login,Integer>{
    
}
