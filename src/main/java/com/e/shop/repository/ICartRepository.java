/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.e.shop.repository;

import com.e.shop.entitys.Cart;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
/**
 *
 * @author mauri
 */
        
@Repository
public interface ICartRepository extends JpaRepository<Cart, Integer>{
    
}
