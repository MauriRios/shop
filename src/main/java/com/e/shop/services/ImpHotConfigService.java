/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.e.shop.services;

import com.e.shop.entitys.HotConfig;
import com.e.shop.repository.IHotConfigRepository;
import com.e.shop.servicesInterfaces.IHotConfigService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author mauri
 */

@Service
public class ImpHotConfigService implements IHotConfigService {
    
    
    @Autowired IHotConfigRepository ihotConfigRepository;
    
    @Override
    public List<HotConfig> getHotConfig() {
        List<HotConfig> hotConfig = ihotConfigRepository.findAll();
        return hotConfig;
    }

    @Override
    public void saveHotConfig(HotConfig hotConfig) {
        ihotConfigRepository.save(hotConfig);
        
    }

    @Override
    public void deleteHotConfig(int id) {
        ihotConfigRepository.deleteById(id);
        
    }

    @Override
    public HotConfig findHotConfig(int id) {
       HotConfig hotConfig = ihotConfigRepository.findById(id).orElse(null);
        return hotConfig;

    }
}
