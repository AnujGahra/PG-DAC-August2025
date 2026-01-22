
package com.demo.controller;
import com.demo.entity.Order;
import com.demo.service.OrderService;
import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/api/orders")
public class OrderController {
 private final OrderService service;
 public OrderController(OrderService s){this.service=s;}

 @PostMapping public Order add(@RequestBody Order o){return service.save(o);}
 @GetMapping public List<Order> all(){return service.all();}
 @GetMapping("/{id}") public Object byId(@PathVariable Long id){
  return service.getOrderWithItem(id);
 }
 @PutMapping("/{id}") public Order update(@PathVariable Long id,@RequestBody Order o){
  o.setId(id); return service.save(o);
 }
 @DeleteMapping("/{id}") public void delete(@PathVariable Long id){service.delete(id);}
}
