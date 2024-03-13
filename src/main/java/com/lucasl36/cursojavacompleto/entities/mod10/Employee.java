package com.lucasl36.cursojavacompleto.entities.mod10;

/**
 *
 * @author Lucas Lopes
 */
public class Employee {

    private Integer id;
    private String name;
    private Double salary;

    public Employee(Integer id, String name, Double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public void increaseSalary(Double percentage) {
        this.setSalary(this.salary*(1+percentage/100.0));
    }
    
    public String toString() {
        return id + ", " + name + ", " + String.format("%.2f", salary);
    }
    
    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Double getSalary() {
        return salary;
    }

    private void setSalary(Double salary) {
        this.salary = salary;
    }
    
}
