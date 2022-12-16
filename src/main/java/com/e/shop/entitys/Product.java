/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.e.shop.entitys;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.validation.constraints.Size;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import org.springframework.transaction.annotation.Transactional;
/**
 *
 * @author mauri
 */


@Entity
@Transactional
@Table(name= "products")
public class Product {
    
    @Id
    @Column(name="ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @NotNull
    @Size(min= 3, max = 20, message = "No cumple con la longitud")
    private String brand;
    
    @NotNull
    @Size(min= 3, max = 20, message = "No cumple con la longitud")
    private String style;
    
    @NotNull
    @Size(min= 3, max = 20, message = "No cumple con la longitud")
    private String volume;
    
    @NotNull
    private String image;
    
    @NotNull
    @Size(min= 3, max = 20, message = "No cumple con la longitud")
    private String category;
    
    @NotNull
    private Float price;
    
    @NotNull
    private int stock;
    
    @NotNull
    private int quantity;
    
    private boolean clearance;
    
    @ManyToMany()
    @JoinTable(name="product_cart",
            joinColumns=@JoinColumn(name="product_id"),
            inverseJoinColumns = @JoinColumn(name="cart_id"))
    private List<Cart> cartIds;

    public Product() {
    }

    public Product(int id, String brand, String style, String volume, String image, String category, Float price, int stock, int quantity, boolean clearance, List<Cart> cartIds) {
        this.id = id;
        this.brand = brand;
        this.style = style;
        this.volume = volume;
        this.image = image;
        this.category = category;
        this.price = price;
        this.stock = stock;
        this.quantity = quantity;
        this.clearance = clearance;
        this.cartIds = cartIds;
    }
    
    

    public boolean isClearance() {
        return clearance;
    }

    public void setClearance(boolean clearance) {
        this.clearance = clearance;
    }

    public List<Cart> getCartIds() {
        return cartIds;
    }

    public void setCartIds(List<Cart> cartIds) {
        this.cartIds = cartIds;
    }

 




    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }
    
        public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
       
}
