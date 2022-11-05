/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.e.shop.controller;

import com.e.shop.entitys.Product;
import com.e.shop.servicesInterfaces.IProductService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author mauri
 */

@RestController
@CrossOrigin(origins = "*")
public class ProductController {
    
    @Autowired 
    IProductService iproductService;
    
    @GetMapping("/productos/traer")
    public List<Product> getProducts() {
        return iproductService.getProducts();
    }
    
    //@PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/producto/crear")
    public void createProduct(@RequestBody Product product) {
        iproductService.saveProduct(product);
        
    }
    //@PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/producto/borrar/{id}")
    public void deleteProduct(@PathVariable int id) {
        iproductService.deleteProduct(id);
        
    }
    //@PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/producto/editar/{id}")
    public Product editProduct (@PathVariable("id") int id,
                                        @RequestBody Product product)
    {
    product.setId(id);  
    iproductService.saveProduct(product);
    
    return product;
    }
}
