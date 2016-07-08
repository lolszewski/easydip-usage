package com.model;


public class ClientOrder {
    public String orderNumber;

    public Double orderAmount;

    public ClientOrder(String orderNumber, Double orderAmount){
        this.orderNumber = orderNumber;
        this.orderAmount = orderAmount;
    }
}
