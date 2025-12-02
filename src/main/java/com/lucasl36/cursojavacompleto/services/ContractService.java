package com.lucasl36.cursojavacompleto.services;

import com.lucasl36.cursojavacompleto.entities.mod17.Contract;
import com.lucasl36.cursojavacompleto.entities.mod17.Installment;
import com.lucasl36.cursojavacompleto.interfaces.mod17.PaymentService;
import java.time.LocalDate;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Lucas Lopes
 */
public class ContractService {
    
    PaymentService paymentService;
    
    public ContractService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }
    
    public Contract processContract(Integer number, LocalDate date, Double totalValue, Integer installmentQty) {
        try {
            if(number <= 0) {
                throw new Exception("Invalid number");
            }
            if(installmentQty <= 0) {
                throw new Exception("Invalid installment quantity");
            }
            if(totalValue <= 0) {
                throw new Exception("Invalid total value");
            }
            Double installmentValue = totalValue/installmentQty;
            List<Installment> installments = new ArrayList<>();
            for(int i = 1; i <= installmentQty; i++) {
                Installment installment = new Installment(
                        calculateDueDate(date, i),
                        installmentValue,
                        paymentService.calculateFee(installmentValue),
                        paymentService.calculateInterest(installmentValue, i)
                );
                installments.add(installment);
            }
            Contract contract = new Contract(
                    number,
                    date,
                    totalValue,
                    installments
            );
            return contract;
        } catch(Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
    
    private LocalDate calculateDueDate(LocalDate contractDate, Integer installment) {
        return contractDate.plusMonths(installment);
    }

}
