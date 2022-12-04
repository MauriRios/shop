/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.e.shop.servicesInterfaces;

import com.e.shop.entitys.Cart;
import com.e.shop.entitys.Product;
import java.util.List;

/**
 *
 * @author mauri
 */

public interface ICartService {
    
    
    public List<Product> cart(Product list);
   
    //Traer una lista de Productos
    public List<Cart> getCart();
    
    //guardad un objeto tipo informacion de Productos
    public void saveCart(Cart cart);
    
    //Eliminar un objeto pero lo buscamos por ID
    public void deleteCart(int id);
    
    //Buscar informacion de Productos por id
    public Cart findCart(int id);
  
}
