/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.e.shop.services;

import com.e.shop.dto.ProductDTO;
import com.e.shop.entitys.Cart;
import com.e.shop.entitys.Product;
import com.e.shop.repository.ICartRepository;
import com.e.shop.servicesInterfaces.ICartService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author mauri
 */

@Service
public class ImpCartService implements ICartService{
    
    @Autowired
    ICartRepository icartRepository;
    
    @Override
    public List<Cart> getCart() {
        List<Cart> cart = icartRepository.findAll();
        return cart;
    }

    @Override
    public void saveCart(Cart cart) {
        icartRepository.save(cart);
        
    }

    @Override
    public void deleteCart(int id) {
        icartRepository.deleteById(id);
        
    }

    @Override
    public Cart findCart(int id) {
       Cart cart = icartRepository.findById(id).orElse(null);
        return cart;

    }

    @Override
    public List<Product> cart(Product list) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
        
     
}
