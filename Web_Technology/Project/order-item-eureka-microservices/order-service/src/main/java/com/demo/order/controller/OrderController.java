
@RestController
@RequestMapping("/api/orders")
public class OrderController {
 @Autowired
 private OrderService service;

 @PostMapping
 public Order add(@RequestBody Order o){ return service.save(o); }

 @GetMapping
 public List<Order> all(){ return service.findAll(); }

 @GetMapping("/{id}")
 public Order one(@PathVariable Long id){ return service.findById(id); }

 @PutMapping("/{id}")
 public Order update(@PathVariable Long id,@RequestBody Order o){
  o.setId(id); return service.save(o);
 }

 @DeleteMapping("/{id}")
 public void delete(@PathVariable Long id){ service.delete(id); }
}
