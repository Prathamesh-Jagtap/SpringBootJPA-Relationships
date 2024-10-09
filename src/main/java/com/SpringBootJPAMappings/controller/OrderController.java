package com.SpringBootJPAMappings.controller;
import com.SpringBootJPAMappings.entity.Order;
import com.SpringBootJPAMappings.entity.User;
import com.SpringBootJPAMappings.service.OrderService;
import com.SpringBootJPAMappings.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/orders")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @Autowired
    private UserService userService;

    @GetMapping
    public List<Order> getAllOrders() {
        return orderService.getAllOrders();
    }

    @PostMapping("/{userId}")
    public ResponseEntity<Order> createOrder(@PathVariable Long userId, @RequestBody Order order) {
        Optional<User> userOptional = userService.getUserById(userId);
        if (userOptional.isPresent()) {
            order.setUser(userOptional.get());
            return ResponseEntity.ok(orderService.saveOrder(order));
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/user/{userId}")
    public List<Order> getOrdersByUserId(@PathVariable Long userId) {
        return orderService.getOrdersByUserId(userId);
    }
}
