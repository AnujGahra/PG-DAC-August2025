
@Entity
public class Item {
 @Id
 @GeneratedValue
 private Long id;
 private String itemName;
 private double price;
 private int stock;
 // getters & setters
}
