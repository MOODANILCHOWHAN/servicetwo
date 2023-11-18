package com.example.two.entity;

import java.util.List;

import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
public class Order {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	private String orderNumber;
		
//	private List<OrderLineItems> orderLineItems;

	
//	@Override
//	public String toString() {
//		return "Order [id=" + id + ", orderNumber=" + orderNumber + ", orderLineItems=" + orderLineItems + "]";
//	}
//
//
//	public Order(int id, String orderNumber, List<OrderLineItems> orderLineItems) {
//		super();
//		this.id = id;
//		this.orderNumber = orderNumber;
//		this.orderLineItems = orderLineItems;
//	}
//
//
//	public int getId() {
//		return id;
//	}
//
//
//	public void setId(int id) {
//		this.id = id;
//	}
//
//
//	public String getOrderNumber() {
//		return orderNumber;
//	}
//
//
//	public void setOrderNumber(String orderNumber) {
//		this.orderNumber = orderNumber;
//	}
//
//
//	public List<OrderLineItems> getOrderLineItems() {
//		return orderLineItems;
//	}
//
//
//	public void setOrderLineItems(List<OrderLineItems> orderLineItems) {
//		this.orderLineItems = orderLineItems;
//	}
//

	public Order() {
		// TODO Auto-generated constructor stub
	}
}
