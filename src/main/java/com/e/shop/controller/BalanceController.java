/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.e.shop.controller;

import com.e.shop.entitys.Expense;
import com.e.shop.entitys.Sale;
import com.e.shop.servicesInterfaces.IExpenseService;
import com.e.shop.servicesInterfaces.ISaleService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author mauri
 */

@RestController
@RequestMapping("/balance")
@CrossOrigin(origins = {"https://ebrios-commerce.web.app","http://localhost:4200"})
/* "https://ebrios-commerce.web.app"*/
/* "http://localhost:4200" */
public class BalanceController {
    
        
    @Autowired 
    ISaleService isaleService;
    
    @GetMapping("ventas/traer")
    public List<Sale> getSales() {
        return isaleService.getSales();
    }
    
    @Autowired 
    IExpenseService iexpenseService;
     
    @GetMapping("gastos/traer")
    public List<Expense> getExpenses() {
        return iexpenseService.getExpenses();
    }
    
}
