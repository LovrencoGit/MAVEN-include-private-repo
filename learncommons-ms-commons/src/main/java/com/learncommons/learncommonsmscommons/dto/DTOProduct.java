package com.learncommons.learncommonsmscommons.dto;

public class DTOProduct {

    private int idProduct;
    private String brand;
    private String description;
    private double price;


    public DTOProduct() {
    }
    public DTOProduct(int idProduct, String brand, String description, double price) {
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

}
