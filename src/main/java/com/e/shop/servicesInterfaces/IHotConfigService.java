/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.e.shop.servicesInterfaces;

import com.e.shop.entitys.HotConfig;
import java.util.List;

/**
 *
 * @author mauri
 */
public interface IHotConfigService {
    
    public List<HotConfig> getHotConfig();
    

    public void saveHotConfig(HotConfig hotConfig);
    

    public void deleteHotConfig(int id);
    

    public HotConfig findHotConfig(int id);
}
