
package com.demo.service;
import com.demo.entity.Order;
import com.demo.repository.OrderRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import java.util.*;

@Service
public class OrderService {
 private final OrderRepository repo;
 private final RestTemplate rest;

 public OrderService(OrderRepository r, RestTemplate t){this.repo=r; this.rest=t;}

 public Order save(Order o){return repo.save(o);}
 public List<Order> all(){return repo.findAll();}
 public Optional<Order> byId(Long id){return repo.findById(id);}

 public Object getOrderWithItem(Long id){
   Order o = repo.findById(id).orElse(null);
   if(o==null) return null;

   Object item = rest.getForObject(
     "http://ITEM-SERVICE/api/items/" + o.getItemId(), Object.class);

   Map<String,Object> map = new HashMap<>();
   map.put("order", o);
   map.put("item", item);
   return map;
 }

 public void delete(Long id){repo.deleteById(id);}
}
