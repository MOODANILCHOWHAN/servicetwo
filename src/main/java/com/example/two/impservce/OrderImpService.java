//package com.example.two.impservce;
//
//import java.util.List;
//import java.util.UUID;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.domain.jaxb.SpringDataJaxb.OrderDto;
//import org.springframework.stereotype.Service;
//
//import com.example.two.dto.OrderLineItemDto;
//import com.example.two.dto.OrdersDto;
//import com.example.two.entity.Order;
//import com.example.two.entity.OrderLineItems;
//import com.example.two.repo.OrderRepo;
//import com.example.two.service.OrderService;
//
//@Service
//public class OrderImpService implements OrderService{
//
//	@Autowired
//	OrderRepo orderRepo;
//	
//	@Override
//	public void addOrderLineItem(OrdersDto orderDto) {
//		// TODO Auto-generated method stub
//		Order order = new Order();
//		
//		order.setOrderNumber(UUID.randomUUID().toString());
//		
//		List<OrderLineItems> orderLineItem = orderDto.getOrderLineItems()
//				.stream()
//				.map(i->mapToDto(i))
//				.toList();
//		order.setOrderLineItems(orderLineItem);
//		orderRepo.save(order);
//	}
//
//	
//	private OrderLineItems mapToDto(OrderLineItemDto i) {
//		// TODO Auto-generated method stub
//		OrderLineItems orderLineItem = new OrderLineItems();
//		orderLineItem.setId(i.getId());
//		orderLineItem.setSkqcode(i.getSkqcode());
//		orderLineItem.setQuantity(i.getQuantity());
//		return orderLineItem;
//	}
//
//}
