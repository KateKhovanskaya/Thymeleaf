package com.example.ThymeleafApp.services;

import com.example.ThymeleafApp.model.Order;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrderService {
    private List<Order> orderlist = new ArrayList<>();


    public List<Order> getOrderlist(){
        return orderlist;
    }

    public void addOrder(Order order){
        orderlist.add(order);
    }
 }
