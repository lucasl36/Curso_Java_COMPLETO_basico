package com.lucasl36.cursojavacompleto.entities.mod14;

/**
 *
 * @author Lucas Lopes
 */
public class LegalPerson extends Person {

    private Integer employeesQunatity;
    
    public LegalPerson(String name, Double income, Integer employeesQunatity) {
        super(name, income);
        this.employeesQunatity = employeesQunatity;
    }
    
    @Override
    public Double calculateIncomeFee() {
        if(this.employeesQunatity > IncomeFeeConstants.legalPersonEmployeesThreshhold) {
            return this.income * (IncomeFeeConstants.legalPersonMinimumRate/100);
        } else {
            return this.income * (IncomeFeeConstants.legalPersonMaximumRate/100);
        }
    }

    public Integer getEmployeesQunatity() {
        return employeesQunatity;
    }

    public void setEmployeesQunatity(Integer employeesQunatity) {
        this.employeesQunatity = employeesQunatity;
    }

}
