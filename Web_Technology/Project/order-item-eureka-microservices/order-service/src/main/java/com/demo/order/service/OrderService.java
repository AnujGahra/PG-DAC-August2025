
@Service
public class OrderService {
 @Autowired
 private OrderRepository repo;
 @Autowired
 private RestTemplate restTemplate;

 public Order findById(Long id){
  Order o = repo.findById(id).orElse(null);
  if(o!=null){
   Object item = restTemplate.getForObject(
    "http://ITEM-SERVICE/api/items/"+id,Object.class);
   o.setItem(item);
  }
  return o;
 }
 public List<Order> findAll(){ return repo.findAll(); }
 public Order save(Order o){ return repo.save(o); }
 public void delete(Long id){ repo.deleteById(id); }
}
