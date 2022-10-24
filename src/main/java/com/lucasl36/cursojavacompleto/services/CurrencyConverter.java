package com.lucasl36.cursojavacompleto.services;

/**
 *
 * @author Lucas Lopes
 */
public class CurrencyConverter {
    
    public static final double iofTaxPercentage = 6;
    
    public static double calculateExchangeReaisToDolar(double dolarPrice, double buyingAmount) {
        return (dolarPrice*buyingAmount)*(1+iofTaxPercentage/100);
    }
    
}
