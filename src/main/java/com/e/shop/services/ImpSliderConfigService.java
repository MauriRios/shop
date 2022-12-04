/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.e.shop.services;

import com.e.shop.entitys.SliderConfig;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.e.shop.servicesInterfaces.ISliderConfigService;
import com.e.shop.repository.ISliderConfigRepository;

/**
 *
 * @author mauri
 */

@Service
public class ImpSliderConfigService implements ISliderConfigService {
    
    @Autowired ISliderConfigRepository isliderConfigRepository;
    
    @Override
    public List<SliderConfig> getSliderConfig() {
        List<SliderConfig> sliderConfig = isliderConfigRepository.findAll();
        return sliderConfig;
    }

    @Override
    public void saveSliderConfig(SliderConfig sliderConfig) {
        isliderConfigRepository.save(sliderConfig);
        
    }

    @Override
    public void deleteSliderConfig(int id) {
        isliderConfigRepository.deleteById(id);
        
    }

    @Override
    public SliderConfig findSliderConfig(int id) {
       SliderConfig sliderConfig = isliderConfigRepository.findById(id).orElse(null);
        return sliderConfig;

    }
}
