package com.example.demo.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.Address;
import com.example.demo.model.Order;

@Service
public class OrderService {
 public int create() {
	 return 1;
 }
 public Order post(Order order) {
	 Order order1=new Order();
	 Address address=new Address();
	 List<Address> addresses =new ArrayList<Address>();
	 address.setStreet("1, Indore");
	 address.setPin(41111);
	 addresses.add(address);
	 order1.setId(1);
	 order1.setItem("Laptop");
	 order1.setPrice(29000.0F);
	 order1.setAddresses(addresses);
	 return order1;
	 
 }
 public List<Order> getAll(){
	 Order o1=new Order();
	 Order o2=new Order();
	 List<Order> ordAll=new ArrayList<Order>();
	 ordAll.add(o1);
	 ordAll.add(o2);
	 return ordAll;
 }
}
