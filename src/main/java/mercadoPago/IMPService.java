/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package mercadoPago;

import java.math.BigDecimal;

/**
 *
 * @author mauri
 */
public interface IMPService {
    
    
     public String CreatePayment(String amount, String token, String description, String payMethod, int installments, String email);
         
}
