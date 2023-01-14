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
public class Sale {
    
    @Id
    @Column(name="ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    private String month;

    private int saleMonthlyValance;

    public Sale() {
    }

    public Sale(int id, String month, int saleMonthlyValance) {
        this.id = id;
        this.month = month;
        this.saleMonthlyValance = saleMonthlyValance;
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

    public int getSaleMonthlyValance() {
        return saleMonthlyValance;
    }

    public void setSaleMonthlyValance(int saleMonthlyValance) {
        this.saleMonthlyValance = saleMonthlyValance;
    }
    
    

}
