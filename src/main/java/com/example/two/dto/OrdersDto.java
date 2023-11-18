//package com.example.two.dto;
//
//import java.util.List;
//
//import com.example.two.entity.OrderLineItems;
//
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
//import jakarta.persistence.Id;
//
//public class OrdersDto {
//
//
//	private int id;
//	
//	private int orderNumber;
//		
//	private List<OrderLineItemDto> orderLineItems;
//
//	public int getId() {
//		return id;
//	}
//
//	public void setId(int id) {
//		this.id = id;
//	}
//
//	public int getOrderNumber() {
//		return orderNumber;
//	}
//
//	public void setOrderNumber(int orderNumber) {
//		this.orderNumber = orderNumber;
//	}
//
//	public List<OrderLineItemDto> getOrderLineItems() {
//		return orderLineItems;
//	}
//
//	public void setOrderLineItems(List<OrderLineItemDto> orderLineItems) {
//		this.orderLineItems = orderLineItems;
//	}
//
//	public OrdersDto(int id, int orderNumber, List<OrderLineItemDto> orderLineItems) {
//		super();
//		this.id = id;
//		this.orderNumber = orderNumber;
//		this.orderLineItems = orderLineItems;
//	}
//
//	@Override
//	public String toString() {
//		return "OrdersDto [id=" + id + ", orderNumber=" + orderNumber + ", orderLineItems=" + orderLineItems + "]";
//	}
//
//	
//	
//}
