package com.example.project.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.project.model.Product;
import com.example.project.model.Login;
import com.example.project.service.Productservice;
import com.example.project.service.Loginservice;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class ProductController {
    @Autowired Loginservice l;
    @Autowired Productservice p;
    @GetMapping("/getlogin")
    public  List<Login> getMethodName() {
        return l.get();
    }
    @GetMapping("/getproduct")
    public  List<Product> getMethod() {
        return p.get();
    }
    @PostMapping("/addlogin")
    public Login postMethodName(@RequestBody Login entity) {
        return l.post(entity);
    }
    @PostMapping("/addproduct")
    public Product postMethodName(@RequestBody Product entity) {
        return p.post(entity);
    }
    @PutMapping("/putlogin/{id}")
    public Login putMethodName(@PathVariable int id, @RequestBody Login entity) {
        return l.put(id, entity);
    }
    @PutMapping("/putproduct/{id}")
    public Product putMethodName(@PathVariable int id, @RequestBody Product entity) {
        return p.put(id, entity);
    }
    @DeleteMapping("/deletelogin/{id}")
    public String deleteLogin(@PathVariable int id)
    {
        return l.delete(id);
    }
    @DeleteMapping("/deleteproduct/{id}")
    public String deleteProduct(@PathVariable int id)
    {
        return p.delete(id);
    }
    @GetMapping("/getlogin/{id}")
    public Optional<Login> getbyid(@PathVariable int id) {
        return l.getbyid(id);
    }
    @GetMapping("/getProduct/{id}")
    public Optional<Product> getbyId(@PathVariable int id) {
        return p.getbyId(id);
    }
    @GetMapping("/check")
    public boolean getMethodName(@RequestParam("id") int id,@RequestParam ("password")String param) {
        return l.check(id, param);
    }
    
    
    
}
