package com.ecommerce.model;

public class Order{
    public int quantity;
    public Product product;
    public User user;
    public Order(User user,Product product,int q){
        this.quantity=q;
        this.user=user;
        this.product=product;
    }
}