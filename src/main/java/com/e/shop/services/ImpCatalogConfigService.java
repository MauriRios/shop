/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.e.shop.services;

import com.e.shop.entitys.CatalogConfig;
import com.e.shop.repository.ICatalogConfigRepository;
import com.e.shop.servicesInterfaces.ICatalogConfigService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author mauri
 */

@Service
public class ImpCatalogConfigService  implements ICatalogConfigService {
    
    @Autowired ICatalogConfigRepository icatalogConfigRepository;
    
    @Override
    public List<CatalogConfig> getCatalogConfig() {
        List<CatalogConfig> catalogConfig = icatalogConfigRepository.findAll();
        return catalogConfig;
    }

    @Override
    public void saveCatalogConfig(CatalogConfig catalogConfig) {
        icatalogConfigRepository.save(catalogConfig);
        
    }

    @Override
    public void deleteCatalogConfig(int id) {
        icatalogConfigRepository.deleteById(id);
        
    }

    @Override
    public CatalogConfig findCatalogConfig(int id) {
       CatalogConfig catalogConfig = icatalogConfigRepository.findById(id).orElse(null);
        return catalogConfig;

    }
}
