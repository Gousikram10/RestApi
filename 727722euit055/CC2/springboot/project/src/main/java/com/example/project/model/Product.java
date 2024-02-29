package com.example.project.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Product")
public class Product{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String productType;
    String productname,productamt,quantity;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getProductname() {
        return productname;
    }
    public void setProductname(String productname) {
        this.productname = productname;
    }
    public String getProductamt() {
        return productamt;
    }
    public void setProductamt(String productamt) {
        this.productamt = productamt;
    }
    public String getQuantity() {
        return quantity;
    }
    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }
    public String getProductType() {
        return productType;
    }
    public void setProductType(String productType) {
        this.productType = productType;
    }
    
}
