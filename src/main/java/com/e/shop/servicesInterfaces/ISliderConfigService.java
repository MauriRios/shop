/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.e.shop.servicesInterfaces;

import com.e.shop.entitys.SliderConfig;
import java.util.List;

/**
 *
 * @author mauri
 */
public interface ISliderConfigService {
    
    //Traer una lista de Slider
    public List<SliderConfig> getSliderConfig();
    
    //guardad un objeto tipo informacion de Slider
    public void saveSliderConfig(SliderConfig sliderConfig);
    
    //Eliminar un objeto pero lo buscamos por ID
    public void deleteSliderConfig(int id);
    
    //Buscar informacion de Slider por id
    public SliderConfig findSliderConfig(int id);
}
