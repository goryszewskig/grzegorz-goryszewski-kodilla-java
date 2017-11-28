package com.kodilla.good.patterns.challenges;

public class Product {
    private String productName ;
    private double productPrice;
    private String productDescription;

    public Product(String productName, double productPrince, String productDescription) {
        this.productName = productName;
        this.productPrice = productPrince;
        this.productDescription = productDescription;
    }

    public String getProductName() {
        return productName;
    }

    public double getProductPrince() {
        return productPrice;
    }

}
