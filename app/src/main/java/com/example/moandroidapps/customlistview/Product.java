package com.example.moandroidapps.customlistview;

public class Product {

    private String productID;
    private String name;
    private String description;
    private double price;

    public Product(String productID, String name, String description, double price) {
        this.productID = productID;
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public String getProductID() {
        return productID;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }//end getPrice()
}//end Product{}
