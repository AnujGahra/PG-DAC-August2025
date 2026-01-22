package com.example.item.service;

import com.example.item.entity.Item;
import com.example.item.repository.ItemRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemService {

    private final ItemRepository repo;

    public ItemService(ItemRepository repo) {
        this.repo = repo;
    }

    public Item save(Item item) {
        return repo.save(item);
    }

    public List<Item> findAll() {
        return repo.findAll();
    }

    public Item findById(Long id) {
        return repo.findById(id)
                .orElseThrow(() -> new RuntimeException("Item not found"));
    }

    public Item update(Long id, Item item) {
        Item existing = findById(id);
        existing.setItemName(item.getItemName());
        existing.setPrice(item.getPrice());
        existing.setStock(item.getStock());
        return repo.save(existing);
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }
}
