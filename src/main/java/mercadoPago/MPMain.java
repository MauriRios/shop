/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mercadoPago;

import com.mercadopago.*;

import com.mercadopago.client.payment.PaymentClient;
import com.mercadopago.client.payment.PaymentCreateRequest;
import com.mercadopago.client.payment.PaymentPayerRequest;
import com.mercadopago.exceptions.MPApiException;
import com.mercadopago.exceptions.MPException;
import com.mercadopago.resources.payment.Payment;
import java.math.BigDecimal;
import org.springframework.stereotype.Service;

/**
 *
 * @author mauri
 */

@Service
public class MPMain implements IMPService {

    public String CreatePayment(String amount, String token, String description, String payMethod, int installments, String email) {
        MercadoPagoConfig.setAccessToken("TEST-2261696313839104-110320-147809b5db7af0d3737ee492c11f363d-47372310");

        PaymentClient client = new PaymentClient();
        BigDecimal amount2 = new BigDecimal(amount);
        
        
        PaymentCreateRequest createRequest
                = PaymentCreateRequest.builder()
                        .transactionAmount(amount2)
                        .token(token)
                        .description(description)
                        .installments(installments)
                        .paymentMethodId(payMethod)
                        .payer(PaymentPayerRequest.builder().email(email).build())
                        .build();

        try {
            Payment payment = client.create(createRequest);
            System.out.println(payment);
        } catch (MPApiException ex) {
            System.out.printf(
                    "MercadoPago Error. Status: %s, Content: %s%n",
                    ex.getApiResponse().getStatusCode(), ex.getApiResponse().getContent());
        } catch (MPException ex) {
            ex.printStackTrace();
        }
        
        return "joya";

    }
}
