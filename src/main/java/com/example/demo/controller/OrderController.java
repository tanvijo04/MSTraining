package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Order;
import com.example.demo.services.OrderService;

@RestController
@RequestMapping("/order")
public class OrderController {
final static Logger logger=LoggerFactory.getLogger(OrderController.class);
@Autowired
OrderService orderService;
@GetMapping
public int createOrder(String order){
	logger.debug("Creating an Order");
	return orderService.create();
	}
@PostMapping("/new")
public Order postOrder(Order order) {
	logger.debug("Posting a new Order"); 
	return orderService.post(order);
}
@GetMapping("/all")
public List<Order> getAllOrders(){
	
	return orderService.getAll();
}
}
