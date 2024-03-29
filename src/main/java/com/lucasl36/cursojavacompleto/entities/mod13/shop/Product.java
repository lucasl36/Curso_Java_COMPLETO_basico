package com.lucasl36.cursojavacompleto.entities.mod13.shop;

/**
 *
 * @author Lucas Lopes
 */
public class Product {

    private String name;
    private Double price;

    public Product(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public String toString() {
        return "$" + String.format("%.2f", price) + " - " + name;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
    
}
