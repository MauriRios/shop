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
import javax.validation.constraints.NotNull;

/**
 *
 * @author mauri
 */

@Entity
public class HotConfig {
    
    @Id
    @Column(name="ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @NotNull
    private String elegidoDelMes;
    @NotNull
    private String masVendido1;
    @NotNull
    private String masVendido2;
    @NotNull
    private String masVendido3;
    @NotNull
    private String masVendido4;

    public HotConfig() {
    }

    public HotConfig(String elegidoDelMes, String masVendido1, String masVendido2, String masVendido3, String masVendido4) {
        this.elegidoDelMes = elegidoDelMes;
        this.masVendido1 = masVendido1;
        this.masVendido2 = masVendido2;
        this.masVendido3 = masVendido3;
        this.masVendido4 = masVendido4;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    
    
    public String getElegidoDelMes() {
        return elegidoDelMes;
    }

    public void setElegidoDelMes(String elegidoDelMes) {
        this.elegidoDelMes = elegidoDelMes;
    }

    public String getMasVendido1() {
        return masVendido1;
    }

    public void setMasVendido1(String masVendido1) {
        this.masVendido1 = masVendido1;
    }

    public String getMasVendido2() {
        return masVendido2;
    }

    public void setMasVendido2(String masVendido2) {
        this.masVendido2 = masVendido2;
    }

    public String getMasVendido3() {
        return masVendido3;
    }

    public void setMasVendido3(String masVendido3) {
        this.masVendido3 = masVendido3;
    }

    public String getMasVendido4() {
        return masVendido4;
    }

    public void setMasVendido4(String masVendido4) {
        this.masVendido4 = masVendido4;
    }
    
}
