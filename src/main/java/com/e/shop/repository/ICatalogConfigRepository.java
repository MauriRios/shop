/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.e.shop.repository;

import com.e.shop.entitys.CatalogConfig;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author mauri
 */

@Repository
public interface ICatalogConfigRepository extends JpaRepository<CatalogConfig, Integer> {
    
}
