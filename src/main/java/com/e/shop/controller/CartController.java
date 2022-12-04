/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.e.shop.controller;

import com.e.shop.entitys.Cart;
import com.e.shop.entitys.Product;
import com.e.shop.servicesInterfaces.ICartService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author mauri
 */

@RestController
@CrossOrigin(origins = "*")
public class CartController {
    
    @Autowired 
    ICartService icartService;
    
    
    //@PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/cart/buy")
   public void createPay(@RequestBody List<Product> cartList) {
        icartService.cart((Product) cartList);
        
        System.out.println(cartList);
        
    }
    
    
}
