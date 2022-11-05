/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.e.shop.servicesInterfaces;

import com.e.shop.entitys.Product;
import java.util.List;

/**
 *
 * @author mauri
 */

public interface IProductService {
    
    //Traer una lista de Productos
    public List<Product> getProducts();
    
    //gardad un objeto tipo informacion de Productos
    public void saveProduct(Product product);
    
    //Eliminar un objeto pero lo buscamos por ID
    public void deleteProduct(int id);
    
    //Buscar informacion de Productos por id
    public Product findProduct(int id);
  
}
