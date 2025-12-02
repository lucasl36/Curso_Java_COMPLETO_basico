package com.lucasl36.cursojavacompleto.services;

import com.lucasl36.cursojavacompleto.interfaces.mod17.PaymentService;

/**
 *
 * @author Lucas Lopes
 */
public class PaypalPaymentService implements PaymentService {

    private static final Double feeRate = 2.0;
    private static final Double interestRate = 1.0;
    
    public PaypalPaymentService() {
        
    }
    
    @Override
    public Double calculateFee(Double installmentValue) {
        return installmentValue*(feeRate/100);
    }

    @Override
    public Double calculateInterest(Double installmentValue, Integer installment) {
        return (installmentValue*(interestRate/100))*installment;
    }

}
