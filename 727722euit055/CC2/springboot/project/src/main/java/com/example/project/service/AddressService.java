package com.example.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.project.model.Address;
import com.example.project.model.Login;
import com.example.project.repository.AddressRepo;

@Service
public class AddressService {
    @Autowired AddressRepo re;
    
    public Address post(Address l) {
        return re.save(l);
    }

    public List<Address> get() {
        return re.findAll();
    }
    public List<Address> sort(String name)
     {
        Sort s=Sort.by(Sort.Direction.ASC, name);
        return re.findAll(s);
     }
    public List<Address> page(int a,int b)
     {
        return re.findAll(PageRequest.of(a, b)).getContent();
     }
     public List<Address> pagingsort(int pgno,int pgsize,String field)
     {
        return re.findAll(PageRequest.of(pgno, pgsize).withSort(Sort.by(Sort.Direction.ASC, field))).getContent();
     }
}
