package com.ecommerce.main;

import com.ecommerce.model.*;
import com.ecommerce.service.OrderService;

public class Main {
    public static void main(String[] args) {
        User u=new User("Tsest_user","dubai");
        Product p=new Product("keyboard",500);
        Order o=new Order(u,p,2);
        OrderService service=new OrderService();
        service.placeOrder(o);
    }
}
