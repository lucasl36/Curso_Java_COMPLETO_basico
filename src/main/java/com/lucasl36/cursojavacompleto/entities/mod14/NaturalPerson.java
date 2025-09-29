package com.lucasl36.cursojavacompleto.entities.mod14;

/**
 *
 * @author Lucas Lopes
 */
public class NaturalPerson extends Person {
    
    private Double healthExpenses;
    
    public NaturalPerson(String name, Double income, Double healtExpenses) {
        super(name, income);
        this.healthExpenses = healtExpenses;
    }

    @Override
    public Double calculateIncomeFee() {
        Double incomeFee = this.income < IncomeFeeConstants.naturalPersonMinimumIncome 
                ? this.income * IncomeFeeConstants.naturalPersonMinimumRate
                : this.income * IncomeFeeConstants.naturalPersonMaximumRate;
        if(healthExpenses > 0) {
            incomeFee = incomeFee - (healthExpenses * IncomeFeeConstants.naturalPersonHealthExpensesTakeout);
        }
        return incomeFee;
    }

    public Double getHealthExpenses() {
        return healthExpenses;
    }

    public void setHealthExpenses(Double healthExpenses) {
        this.healthExpenses = healthExpenses;
    }
 
}
