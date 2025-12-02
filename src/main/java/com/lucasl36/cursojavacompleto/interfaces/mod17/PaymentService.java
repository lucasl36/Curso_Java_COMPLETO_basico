package com.lucasl36.cursojavacompleto.interfaces.mod17;

/**
 *
 * @author Lucas Lopes
 */
public interface PaymentService {
    
    public Double calculateFee(Double installmentValue);
    public Double calculateInterest(Double installmentValue, Integer installment);
    
}
