
package com.demo.entity;
import jakarta.persistence.*;

@Entity(name="orders")
public class Order {
 @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
 private Long id;
 private String customerName;
 private int quantity;
 private Long itemId;

 public Long getId(){return id;}
 public void setId(Long id){this.id=id;}
 public String getCustomerName(){return customerName;}
 public void setCustomerName(String c){this.customerName=c;}
 public int getQuantity(){return quantity;}
 public void setQuantity(int q){this.quantity=q;}
 public Long getItemId(){return itemId;}
 public void setItemId(Long i){this.itemId=i;}
}
