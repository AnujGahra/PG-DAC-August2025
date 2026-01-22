import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/items")
public class ItemController {
 @Autowired
 private ItemService service;

 @PostMapping
 public Item add(@RequestBody Item i){ return service.save(i); }

 @GetMapping
 public List<Item> all(){ return service.findAll(); }

 @GetMapping("/{id}")
 public Item one(@PathVariable Long id){ return service.findById(id); }

 @PutMapping("/{id}")
 public Item update(@PathVariable Long id,@RequestBody Item i){
  i.setId(id); return service.save(i);
 }

 @DeleteMapping("/{id}")
 public void delete(@PathVariable Long id){ service.delete(id); }
}
