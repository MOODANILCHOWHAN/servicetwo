//package com.example.two.entity;
//
//import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
//import jakarta.persistence.Id;
//import lombok.AllArgsConstructor;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.Setter;
//import lombok.ToString;
//
//@Entity
//@Setter
//@Getter
//@AllArgsConstructor
//@NoArgsConstructor
//@ToString
//public class OrderLineItems {
//	
//	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
//	private int id;
//	private int skqcode;
//	private int quantity;
//	public OrderLineItems() {
//		// TODO Auto-generated constructor stub
//	}
//	public int getId() {
//		return id;
//	}
//	public void setId(int id) {
//		this.id = id;
//	}
//	public int getSkqcode() {
//		return skqcode;
//	}
//	public void setSkqcode(int skqcode) {
//		this.skqcode = skqcode;
//	}
//	public int getQuantity() {
//		return quantity;
//	}
//	public void setQuantity(int quantity) {
//		this.quantity = quantity;
//	}
//	public OrderLineItems(int id, int skqcode, int quantity) {
//		super();
//		this.id = id;
//		this.skqcode = skqcode;
//		this.quantity = quantity;
//	}
//	@Override
//	public String toString() {
//		return "OrderLineItems [id=" + id + ", skqcode=" + skqcode + ", quantity=" + quantity + "]";
//	}
//	
//	
//
//}
