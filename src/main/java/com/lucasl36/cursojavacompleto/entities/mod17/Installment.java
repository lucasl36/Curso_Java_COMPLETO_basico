package com.lucasl36.cursojavacompleto.entities.mod17;

import java.time.LocalDate;

/**
 *
 * @author Lucas Lopes
 */
public class Installment {

    private LocalDate dueDate;
    private Double value;
    private Double tax;
    private Double interest;

    public Installment() {
    }

    public Installment(LocalDate dueDate, Double value, Double tax, Double interest) {
        this.dueDate = dueDate;
        this.value = value;
        this.tax = tax;
        this.interest = interest;
    }

    public Double getTotalValue() {
        return value + tax + interest;
    }
    
    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public Double getTax() {
        return tax;
    }

    public void setTax(Double tax) {
        this.tax = tax;
    }

    public Double getInterest() {
        return interest;
    }

    public void setInterest(Double interest) {
        this.interest = interest;
    }
    
}
