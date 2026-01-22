package com.example.order.controller;

import com.example.order.entity.OrderEntity;
import com.example.order.service.OrderService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/orders")
public class OrderController {

    private final OrderService service;

    public OrderController(OrderService service) {
        this.service = service;
    }

    @PostMapping
    public OrderEntity create(@RequestBody OrderEntity order) {
        return service.save(order);
    }

    @GetMapping
    public List<OrderEntity> getAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public OrderEntity getById(@PathVariable Long id) {
        return service.findById(id);
    }

    @PutMapping("/{id}")
    public OrderEntity update(@PathVariable Long id, @RequestBody OrderEntity order) {
        return service.update(id, order);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}
