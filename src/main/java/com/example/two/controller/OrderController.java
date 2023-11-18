//package com.example.two.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.example.two.dto.OrdersDto;
//import com.example.two.entity.Order;
//import com.example.two.impservce.OrderImpService;
//
//@RestController
//@RequestMapping("/api/v1")
//public class OrderController {
//	@Autowired
//	OrderImpService orderImpService;
//	
//	@GetMapping("/")
//	public String orderHomeGet() {
//		return "Order Controller Home GetMapping";
//	}
//	
//	@PostMapping("/add-order")
//		public String addOrderPost(@RequestBody OrdersDto order) {
//			orderImpService.addOrderLineItem(order);
//			return "Data Saved Successfully";
//	}
//}
