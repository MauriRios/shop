/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.e.shop.controller;

import java.math.BigDecimal;
import mercadoPago.IMPService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author mauri
 */

@RestController
@CrossOrigin(origins = "*")
public class MPController  {
    
    IMPService mPMain;
    
    @PostMapping("/pagar")
    public void payProducts(@RequestParam String amount,@RequestParam String token,@RequestParam String description,@RequestParam String payMethod,@RequestParam int installments,@RequestParam String email) {
        mPMain.CreatePayment(amount,token,description,payMethod,installments,email);
    }
}
