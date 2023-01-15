/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.e.shop.entitys;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author mauri
 */

@Entity
public class Expense {
    
    @Id
    @Column(name="ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    private String month;

    private int expenseMonthlyBalance;

    public Expense() {
    }

    public Expense(int id, String month, int expenseMonthlyBalance) {
        this.id = id;
        this.month = month;
        this.expenseMonthlyBalance = expenseMonthlyBalance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public int getExpenseMonthlyBalance() {
        return expenseMonthlyBalance;
    }

    public void setExpenseMonthlyBalance(int expenseMonthlyBalance) {
        this.expenseMonthlyBalance = expenseMonthlyBalance;
    }
    
    
}
