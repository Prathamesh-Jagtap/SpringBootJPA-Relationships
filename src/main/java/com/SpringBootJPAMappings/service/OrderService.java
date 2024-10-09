package com.SpringBootJPAMappings.service;

import com.SpringBootJPAMappings.entity.Order;
import com.SpringBootJPAMappings.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }

    public List<Order> getOrdersByUserId(Long userId) {
        return orderRepository.findByUserId(userId);
    }

    public Order saveOrder(Order order) {
        return orderRepository.save(order);
    }
}
