package com.example.ThymeleafApp.controllers;

import com.example.ThymeleafApp.model.Order;
import com.example.ThymeleafApp.services.OrderService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
@AllArgsConstructor
public class OrderController {
    private OrderService orderService;

    @GetMapping("/orders")
    public String getOrdersList(Model model){
        List<Order> orderList = orderService.getOrderlist();
        model.addAttribute("orders", orderList);
        return "orders";
    }

    @GetMapping("/add-order")
    public String addOrderForm(Order order){
        return "add-order";
    }

    @PostMapping("/add-order")
    public String addOrder(Order order){
        orderService.addOrder(order);
        return "redirect:/orders";
    }
}
