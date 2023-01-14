/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.e.shop.controller;

import com.e.shop.entitys.HotConfig;
import com.e.shop.servicesInterfaces.IHotConfigService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author mauri
 */


@RestController
@RequestMapping("/hotconfig")
@CrossOrigin(origins = "https://ebrios-commerce.web.app")
/* "https://ebrios-commerce.web.app"*/
/* "http://localhost:4200" */
public class HotConfigController {
    
    @Autowired 
    IHotConfigService ihotConfigService;
    
    @GetMapping("/traer")
    public List<HotConfig> getHotConfig() {
        return ihotConfigService.getHotConfig();
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/crear")
    public void createHotConfig(@RequestBody HotConfig hotConfig) {
        ihotConfigService.saveHotConfig(hotConfig);
        
    }
    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/borrar/{id}")
    public void deleteHotConfig(@PathVariable int id) {
        ihotConfigService.deleteHotConfig(id);
        
    }
    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/editar/{id}")
    public HotConfig editHotConfig(@PathVariable("id") int id,
                                        @RequestBody HotConfig hotConfig)
    {
    hotConfig.setId(id);  
    ihotConfigService.saveHotConfig(hotConfig);
    
    return hotConfig;
    }
}
