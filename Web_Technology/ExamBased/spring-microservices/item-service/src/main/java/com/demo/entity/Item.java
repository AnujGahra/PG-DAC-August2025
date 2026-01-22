
package com.demo.entity;
import jakarta.persistence.*;

@Entity
public class Item {
 @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
 private Long id;
 private String itemName;
 private double price;
 private int stock;

 public Long getId() {return id;}
 public void setId(Long id){this.id=id;}
 public String getItemName(){return itemName;}
 public void setItemName(String s){this.itemName=s;}
 public double getPrice(){return price;}
 public void setPrice(double p){this.price=p;}
 public int getStock(){return stock;}
 public void setStock(int s){this.stock=s;}
}
