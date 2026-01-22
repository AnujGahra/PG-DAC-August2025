import java.util.List;

import org.hibernate.cache.spi.support.AbstractReadWriteAccess.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemService {
 @Autowired
 private ItemRepository repo;
 public List<Item> findAll(){ return repo.findAll(); }
 public Item findById(Long id){ return repo.findById(id).orElse(null); }
 public Item save(Item i){ return repo.save(i); }
 public void delete(Long id){ repo.deleteById(id); }
}
