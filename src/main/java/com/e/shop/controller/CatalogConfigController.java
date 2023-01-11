/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.e.shop.controller;

import com.e.shop.entitys.CatalogConfig;
import com.e.shop.servicesInterfaces.ICatalogConfigService;
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
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author mauri
 */

@RestController
@CrossOrigin(origins = "https://ebrios-commerce.web.app")
public class CatalogConfigController {
    
    @Autowired 
    ICatalogConfigService icatalogConfigService;
    
    @GetMapping("/catalogconfig/traer")
    public List<CatalogConfig> getCatalogConfig() {
        return icatalogConfigService.getCatalogConfig();
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/catalogconfig/crear")
    public void createCatalogConfig(@RequestBody CatalogConfig catalogConfig) {
        icatalogConfigService.saveCatalogConfig(catalogConfig);
        
    }
    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/catalogconfig/borrar/{id}")
    public void deleteCatalogConfig(@PathVariable int id) {
        icatalogConfigService.deleteCatalogConfig(id);
        
    }
    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/catalogconfig/editar/{id}")
    public CatalogConfig editCatalogConfig(@PathVariable("id") int id,
                                        @RequestBody CatalogConfig catalogConfig)
    {
    catalogConfig.setId(id);  
    icatalogConfigService.saveCatalogConfig(catalogConfig);
    
    return catalogConfig;
    }
}
