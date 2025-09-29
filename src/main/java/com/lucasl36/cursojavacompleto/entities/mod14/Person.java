package com.lucasl36.cursojavacompleto.entities.mod14;

/**
 *
 * @author Lucas Lopes
 */
public abstract class Person {

    protected String name;
    protected Double income;

    public Person(String name, Double income) {
        this.name = name;
        this.income = income;
    }
    
    public abstract Double calculateIncomeFee();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getIncome() {
        return income;
    }

    public void setIncome(Double yearlyIncome) {
        this.income = yearlyIncome;
    }
 
    public void declareTaxes() {
        System.out.printf("%s: $ %.2f%n", this.getName(), this.calculateIncomeFee());
    }
    
}
