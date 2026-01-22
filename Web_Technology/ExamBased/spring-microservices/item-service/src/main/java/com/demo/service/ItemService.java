
package com.demo.service;
import com.demo.entity.Item;
import com.demo.repository.ItemRepository;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class ItemService {
 private final ItemRepository repo;
 public ItemService(ItemRepository r){this.repo=r;}

 public Item save(Item i){return repo.save(i);}
 public List<Item> findAll(){return repo.findAll();}
 public Optional<Item> findById(Long id){return repo.findById(id);}
 public void delete(Long id){repo.deleteById(id);}
}
