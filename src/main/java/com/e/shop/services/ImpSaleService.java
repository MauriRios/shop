/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.e.shop.services;

import com.e.shop.entitys.Sale;
import com.e.shop.repository.ISaleRepository;
import com.e.shop.servicesInterfaces.ISaleService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author mauri
 */

@Service
public class ImpSaleService implements ISaleService {
    
    @Autowired ISaleRepository isaleRepository;
    
    @Override
    public List<Sale> getSales() {
        List<Sale> sale = isaleRepository.findAll();
        return sale;
    }
    
}
