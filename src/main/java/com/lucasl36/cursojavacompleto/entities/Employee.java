package com.lucasl36.cursojavacompleto.entities;

/**
 *
 * @author Lucas Lopes
 */
public class Employee {

    private String name;
    private double grossSalary;
    private double tax;

    public Employee(String name, double grossSalary, double tax) {
        this.name = name;
        this.grossSalary = grossSalary;
        this.tax = tax;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(name).append(", $ ").append(String.format("%.2f", (grossSalary - tax)));
        return sb.toString();
    }
    
    public double netSalary() {
        return grossSalary - tax;
    }
    
    public void increaseSalary(double percentage) {
        double newGrossSalary = grossSalary + (grossSalary*percentage/100);
        setGrossSalary(newGrossSalary);
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGrossSalary() {
        return grossSalary;
    }

    public void setGrossSalary(double grossSalary) {
        this.grossSalary = grossSalary;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }
    
}
