package com.example.project.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.project.model.Login;
import com.example.project.repository.Repositorylogin;


@Service
public class Loginservice{
    @Autowired
    private Repositorylogin repo;

    public Login post(Login l) {
        return repo.save(l);
    }

    public List<Login> get() {
        return repo.findAll();
    }

    public Optional<Login> getbyid(int id) {
        return repo.findById(id);
    }

    public String delete(int id) {
        if (repo.existsById(id)) {
            repo.deleteById(id);
            return "Deleted successfully";
        } else {
            return "Record not found";
        }
    }

    public Login put(int id, Login lo) {
        Optional<Login> optionalUser = repo.findById(id);
        
        if (optionalUser.isPresent()) {
            Login user = optionalUser.get();
            user.setName(lo.getName());
            user.setEmail(lo.getEmail());
            user.setMobile(lo.getMobile());
            user.setPassword(lo.getPassword());
            return repo.save(user);
        } else {
            return null; // Or throw an exception or handle the not found case appropriately
        }
    }
    public boolean check(int id,String password)
    {
        Login l=repo.findById(id).orElse(null);
        if(l!=null)
        {
            if(l.getPassword().equals(password))
            return true;
            else
            return false;
        }
        else
        return false;
    }
}
