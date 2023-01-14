/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.e.shop.servicesInterfaces;

import com.e.shop.entitys.Sale;
import java.util.List;

/**
 *
 * @author mauri
 */


public interface ISaleService {
    
    //Traer una lista de Sale
    public List<Sale> getSales();

    
}
