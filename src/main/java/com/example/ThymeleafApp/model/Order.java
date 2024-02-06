package com.example.ThymeleafApp.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class Order {
    private static int count;
    private int id;
    private String name;
    private double price;

    public Order(){
        this.id = ++count;
    }

    //    public Order(String name, double price){
//        this.id = ++count;
//        this.name = name;
//        this.price = price;
//    }
}
