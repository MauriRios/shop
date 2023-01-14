/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.e.shop.services;

import com.e.shop.entitys.Expense;
import com.e.shop.repository.IExpenseRepository;
import com.e.shop.servicesInterfaces.IExpenseService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author mauri
 */

@Service
public class ImpExpenseService implements IExpenseService {
    
    @Autowired IExpenseRepository iexpenseRepository;
    
    @Override
    public List<Expense> getExpenses() {
        List<Expense> expense = iexpenseRepository.findAll();
        return expense;
    }
}
