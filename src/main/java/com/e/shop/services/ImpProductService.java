/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.e.shop.services;

import com.e.shop.entitys.Product;
import com.e.shop.repository.IProductRepository;
import com.e.shop.servicesInterfaces.IProductService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author mauri
 */

@Service
public class ImpProductService implements IProductService {
    
    
    @Autowired IProductRepository iproductRepository;
    
    @Override
    public List<Product> getProducts() {
        List<Product> products = iproductRepository.findAll();
        return products;
    }

    @Override
    public void saveProduct(Product product) {
        iproductRepository.save(product);
        
    }

    @Override
    public void deleteProduct(int id) {
        iproductRepository.deleteById(id);
        
    }

    @Override
    public Product findProduct(int id) {
       Product product = iproductRepository.findById(id).orElse(null);
        return product;

    }
}
