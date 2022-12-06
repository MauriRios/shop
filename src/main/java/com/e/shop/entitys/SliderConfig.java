package com.e.shop.entitys;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class SliderConfig {
    
    @Id
    @Column(name="ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NotNull
    private String slider1;
    @NotNull
    private String title1;
    @NotNull
    private String text1;
    @NotNull
    private String slider2;
    @NotNull
    private String title2;
    @NotNull
    private String text2;
    @NotNull
    private String slider3;
    @NotNull
    private String title3;
    @NotNull
    private String text3;
   
    //@NotNull
    //private String spronsors;

    public SliderConfig() {
    }

    public SliderConfig(int id, String slider1, String title1, String text1, String slider2, String title2, String text2, String slider3, String title3, String text3, String cervezasCatalog, String vinosCatalog, String regalosCatalog, String whiskysCatalog, String combosCatalog, String aperitivosCatalog, String destiladosCatalog, String sinAlcoholCatalog, String elegidoDelMes, String masVendido1, String masVendido2, String masVendido3, String masVendido4, String spronsors) {
        this.id = id;
        this.slider1 = slider1;
        this.title1 = title1;
        this.text1 = text1;
        this.slider2 = slider2;
        this.title2 = title2;
        this.text2 = text2;
        this.slider3 = slider3;
        this.title3 = title3;
        this.text3 = text3;
    }
    
      public String getTitle1() {
        return title1;
    }

    public void setTitle1(String title1) {
        this.title1 = title1;
    }

    public String getTitle2() {
        return title2;
    }

    public void setTitle2(String title2) {
        this.title2 = title2;
    }

    public String getTitle3() {
        return title3;
    }

    public void setTitle3(String title3) {
        this.title3 = title3;
    }
    public String getText1() {
        return text1;
    }

    public void setText1(String text1) {
        this.text1 = text1;
    }

    public String getText2() {
        return text2;
    }

    public void setText2(String text2) {
        this.text2 = text2;
    }

    public String getText3() {
        return text3;
    }

    public void setText3(String text3) {
        this.text3 = text3;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSlider1() {
        return slider1;
    }

    public void setSlider1(String slider1) {
        this.slider1 = slider1;
    }

    public String getSlider2() {
        return slider2;
    }

    public void setSlider2(String slider2) {
        this.slider2 = slider2;
    }

    public String getSlider3() {
        return slider3;
    }

    public void setSlider3(String slider3) {
        this.slider3 = slider3;
    }


}
