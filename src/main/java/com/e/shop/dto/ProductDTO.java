/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.e.shop.dto;

import javax.validation.constraints.NotNull;

/**
 *
 * @author mauri
 */


public class ProductDTO {
    
    @NotNull
    private String title;
    @NotNull
    private int quantity;
    @NotNull
    private Float unitPrice;

    public ProductDTO() {
    }

    public ProductDTO(String title, int quantity, Float unitPrice) {
        this.title = title;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Float getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Float unitPrice) {
        this.unitPrice = unitPrice;
    }
   
    
}
