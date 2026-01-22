package com.example.order.service;

import com.example.order.entity.OrderEntity;
import com.example.order.repository.OrderRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class OrderService {

    private final OrderRepository repo;
    private final RestTemplate restTemplate;

    public OrderService(OrderRepository repo, RestTemplate restTemplate) {
        this.repo = repo;
        this.restTemplate = restTemplate;
    }

    public OrderEntity save(OrderEntity order) {
        return repo.save(order);
    }

    public List<OrderEntity> findAll() {
        return repo.findAll();
    }

    public OrderEntity findById(Long id) {
        OrderEntity order = repo.findById(id)
                .orElseThrow(() -> new RuntimeException("Order not found"));

        // ✅ CORRECT Eureka-based call using itemId
        Object item = restTemplate.getForObject(
                "http://ITEM-SERVICE/api/items/" + order.getItemId(),
                Object.class
        );

        order.setItem(item);
        return order;
    }

    public OrderEntity update(Long id, OrderEntity order) {
        OrderEntity existing = repo.findById(id)
                .orElseThrow(() -> new RuntimeException("Order not found"));

        existing.setCustomerName(order.getCustomerName());
        existing.setQuantity(order.getQuantity());
        existing.setItemId(order.getItemId());

        return repo.save(existing);
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }
}
