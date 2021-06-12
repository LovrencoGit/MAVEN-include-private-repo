package com.learncommons.learncommonsmscommons.model;

import com.learncommons.learncommonsmscommons.dto.DTOProduct;
import org.springframework.beans.BeanUtils;

public class Product {

    private int idProduct;
    private String brand;
    private String description;
    private double price;


    public Product() {
    }
    public Product(int idProduct, String brand, String description, double price) {
        this.idProduct = idProduct;
        this.brand = brand;
        this.description = description;
        this.price = price;
    }


    public int getIdProduct() {
        return idProduct;
    }
    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }


    /*******************************************************************/


    public DTOProduct toDTOProduct(){
        DTOProduct output = new DTOProduct();
        BeanUtils.copyProperties(this, output);
        return output;
    }
}
