package com.example.two.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.two.entity.Order;

public interface OrderRepo extends JpaRepository<Order, Integer>{

}
