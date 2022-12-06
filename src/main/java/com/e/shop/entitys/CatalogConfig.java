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
public class CatalogConfig {
    
    @Id
    @Column(name="ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @NotNull
    private String cervezasCatalog;
    @NotNull
    private String vinosCatalog;
    @NotNull
    private String regalosCatalog;
    @NotNull
    private String whiskysCatalog;
    @NotNull
    private String combosCatalog;
    @NotNull
    private String aperitivosCatalog;
    @NotNull
    private String destiladosCatalog;
    @NotNull
    private String sinAlcoholCatalog;

    public CatalogConfig() {
    }

    public CatalogConfig(int id, String cervezasCatalog, String vinosCatalog, String regalosCatalog, String whiskysCatalog, String combosCatalog, String aperitivosCatalog, String destiladosCatalog, String sinAlcoholCatalog) {
        this.id = id;
        this.cervezasCatalog = cervezasCatalog;
        this.vinosCatalog = vinosCatalog;
        this.regalosCatalog = regalosCatalog;
        this.whiskysCatalog = whiskysCatalog;
        this.combosCatalog = combosCatalog;
        this.aperitivosCatalog = aperitivosCatalog;
        this.destiladosCatalog = destiladosCatalog;
        this.sinAlcoholCatalog = sinAlcoholCatalog;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCervezasCatalog() {
        return cervezasCatalog;
    }

    public void setCervezasCatalog(String cervezasCatalog) {
        this.cervezasCatalog = cervezasCatalog;
    }

    public String getVinosCatalog() {
        return vinosCatalog;
    }

    public void setVinosCatalog(String vinosCatalog) {
        this.vinosCatalog = vinosCatalog;
    }

    public String getRegalosCatalog() {
        return regalosCatalog;
    }

    public void setRegalosCatalog(String regalosCatalog) {
        this.regalosCatalog = regalosCatalog;
    }

    public String getWhiskysCatalog() {
        return whiskysCatalog;
    }

    public void setWhiskysCatalog(String whiskysCatalog) {
        this.whiskysCatalog = whiskysCatalog;
    }

    public String getCombosCatalog() {
        return combosCatalog;
    }

    public void setCombosCatalog(String combosCatalog) {
        this.combosCatalog = combosCatalog;
    }

    public String getAperitivosCatalog() {
        return aperitivosCatalog;
    }

    public void setAperitivosCatalog(String aperitivosCatalog) {
        this.aperitivosCatalog = aperitivosCatalog;
    }

    public String getDestiladosCatalog() {
        return destiladosCatalog;
    }

    public void setDestiladosCatalog(String destiladosCatalog) {
        this.destiladosCatalog = destiladosCatalog;
    }

    public String getSinAlcoholCatalog() {
        return sinAlcoholCatalog;
    }

    public void setSinAlcoholCatalog(String sinAlcoholCatalog) {
        this.sinAlcoholCatalog = sinAlcoholCatalog;
    }
}
