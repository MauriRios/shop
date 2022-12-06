/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.e.shop.servicesInterfaces;

import com.e.shop.entitys.CatalogConfig;
import java.util.List;

/**
 *
 * @author mauri
 */
public interface ICatalogConfigService {
    

    public List<CatalogConfig> getCatalogConfig();
    

    public void saveCatalogConfig(CatalogConfig catalogConfig);
    

    public void deleteCatalogConfig(int id);
    

    public CatalogConfig findCatalogConfig(int id);
}
