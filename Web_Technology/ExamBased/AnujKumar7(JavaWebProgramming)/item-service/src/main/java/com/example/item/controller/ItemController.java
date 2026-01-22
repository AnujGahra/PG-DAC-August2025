package com.example.item.controller;

import com.example.item.entity.Item;
import com.example.item.service.ItemService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/items")
public class ItemController {

    private final ItemService service;

    public ItemController(ItemService service) {
        this.service = service;
    }

    @PostMapping
    public Item create(@RequestBody Item item) {
        return service.save(item);
    }

    @GetMapping
    public List<Item> getAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Item getById(@PathVariable Long id) {
        return service.findById(id);
    }

    @PutMapping("/{id}")
    public Item update(@PathVariable Long id, @RequestBody Item item) {
        return service.update(id, item);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}
