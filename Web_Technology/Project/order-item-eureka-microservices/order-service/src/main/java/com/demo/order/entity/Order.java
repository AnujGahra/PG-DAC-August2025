
@Entity
public class Order {
 @Id
 @GeneratedValue
 private Long id;
 private String customerName;
 private int quantity;

 @Transient
 private Object item;
 // getters & setters
}
