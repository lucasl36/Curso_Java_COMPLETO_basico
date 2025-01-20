package com.lucasl36.cursojavacompleto.entities.mod13.shop;

/**
 *
 * @author Lucas Lopes
 */
public class OrderItem {

    private Integer quantity;
    private Double price;
    private Integer orderId;
    private Product product;

    public OrderItem(Integer quantity, Double price, Integer orderId, Product product) {
        this.quantity = quantity;
        this.price = price;
        this.orderId = orderId;
        this.product = product;
    }

    public String toString() {
        return quantity + "x " + product.getName() + ". TOTAL: " + subTotal();
    }
    
    public Integer getQuantity() {
        return quantity;
    }

    public Double getPrice() {
        return price;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public Product getProduct() {
        return product;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
    
    public Double subTotal() {
        return this.quantity*this.price;
    }
    
}
