/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mercadoPago;

import com.mercadopago.MercadoPagoConfig;
import java.util.logging.Level;

/**
 *
 * @author mauri
 */
public class MPConfig {
    
    public static void config() {
    MercadoPagoConfig.setConnectionRequestTimeout(2000);
    MercadoPagoConfig.setSocketTimeout(2000);
    MercadoPagoConfig.setLoggingLevel(Level.FINEST);
    
    }
}
