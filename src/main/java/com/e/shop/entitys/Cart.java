
package com.e.shop.entitys;



import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import javax.persistence.Table;


@Entity
@Table(name = "carts")
public class Cart {
    
    @Id
    @Column(name="ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    
    
  @ManyToMany(mappedBy = "cartIds", cascade = CascadeType.ALL)
    private List<Product> cartList;

    public Cart(int id, List<Product> cartList) {
        this.id = id;
        this.cartList = cartList;
    }

    public Cart() {
    }

    
    public List<Product> getCartList() {
        return cartList;
    }

    public void setCartList(List<Product> cartList) {
        this.cartList = cartList;
    }

    public int getCartId() {
        return id;
    }

    public void setCartId(int id) {
        this.id = id;
    }


      
    //public void addCart(Product product){
    //    if(this.cartList == null){
    //        this.cartList = new ArrayList<>();
     //   }
        
    //    this.cartList.add(product);
   // }


    
}
