/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.e.shop.controller;

import com.e.shop.entitys.SliderConfig;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.e.shop.servicesInterfaces.ISliderConfigService;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author mauri
 */

@RestController
@RequestMapping("/sliderconfig")
@CrossOrigin(origins = "https://ebrios-commerce.web.app")
public class SliderConfigController {
    
    @Autowired 
    ISliderConfigService isliderConfigService;
    
    @GetMapping("/traer")
    public List<SliderConfig> getSliderConfig() {
        return isliderConfigService.getSliderConfig();
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/crear")
    public void createSliderConfig(@RequestBody SliderConfig sliderConfig) {
        isliderConfigService.saveSliderConfig(sliderConfig);
        
    }
    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/borrar/{id}")
    public void deleteSliderConfig(@PathVariable int id) {
        isliderConfigService.deleteSliderConfig(id);
        
    }
    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/editar/{id}")
    public SliderConfig editSliderConfig(@PathVariable("id") int id,
                                        @RequestBody SliderConfig sliderConfig)
    {
    sliderConfig.setId(id);  
    isliderConfigService.saveSliderConfig(sliderConfig);
    
    return sliderConfig;
    }
    
}
