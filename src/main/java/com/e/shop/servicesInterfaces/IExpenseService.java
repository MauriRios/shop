/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.e.shop.servicesInterfaces;

import com.e.shop.entitys.Expense;
import java.util.List;

/**
 *
 * @author mauri
 */
public interface IExpenseService {
    
        //Traer una lista de Expense
    public List<Expense> getExpenses();

}
