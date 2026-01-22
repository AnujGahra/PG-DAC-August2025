
package com.demo.controller;
import com.demo.entity.Item;
import com.demo.service.ItemService;
import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/api/items")
public class ItemController {
 private final ItemService service;
 public ItemController(ItemService s){this.service=s;}

 @PostMapping public Item add(@RequestBody Item i){return service.save(i);}
 @GetMapping public List<Item> all(){return service.findAll();}
 @GetMapping("/{id}") public Item byId(@PathVariable Long id){
  return service.findById(id).orElse(null);
 }
 @PutMapping("/{id}") public Item update(@PathVariable Long id,@RequestBody Item i){
  i.setId(id); return service.save(i);
 }
 @DeleteMapping("/{id}") public void delete(@PathVariable Long id){service.delete(id);}
}
