package com.ecommerce.service;

import com.ecommerce.model.Order;
public class OrderService {
    public void placeOrder(Order order) {
        System.out.println(order.user.name);
        System.out.println(order.product.name);
        System.out.println(order.quantity);
        double totPrice=order.product.price*order.quantity;
        System.out.println("Total Price:"+totPrice);
    }
}