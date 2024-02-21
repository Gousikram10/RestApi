package com.example.project.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.project.model.Product;
import com.example.project.repository.RepositoryProduct;

@Service
public class Productservice {
    @Autowired
    RepositoryProduct repo;

    public Product post(Product p) {
        return repo.save(p);
    }
    public List<Product> get()
    {
        return repo.findAll();
    }
    public Optional<Product> getbyId(int id)
    {
        return repo.findById(id);
    }
    public String delete(int id)
    {
        repo.deleteById(id);
        return "Deleted";
    }
     public Product put(int id,Product po)
    {
        Product user=repo.findById(id).orElse(null);
        if(user!=null)
        {
           user.setProductname(po.getProductname());
           user.setProductType(po.getProductType());
           user.setProductamt(po.getProductamt());
           user.setQuantity(po.getQuantity());
           return repo.saveAndFlush(user);
        }
        else
        return null;

    }
    
    
}
