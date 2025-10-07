package com.lucasl36.cursojavacompleto.entities.mod15;

import com.lucasl36.cursojavacompleto.entities.mod15.throwables.InvalidValueException;
import com.lucasl36.cursojavacompleto.entities.mod15.throwables.NotEnoughBalanceExcetion;
import com.lucasl36.cursojavacompleto.entities.mod15.throwables.WithdrawLimitException;

/**
 *
 * @author Lucas Lopes
 */
public class BankAccount {
    
    private Long number;
    private String holder;
    private Double balance;
    private Double withdrawLimit;

    public BankAccount(Long number, String holder, Double balance, Double withdrawLimit) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }
    
    public void deposit(Double value) throws Exception {
        if(value <= 0.0) {
            throw new InvalidValueException();
        }
        this.balance += value;
    }
    
    public void withdraw(Double value) throws Exception {
        if(value <= 0.0) {
            throw new InvalidValueException();
        }
        if(value > this.balance) {
            throw new NotEnoughBalanceExcetion();
        }
        if(value > this.withdrawLimit) {
            throw new WithdrawLimitException();
        }
        this.balance -= value;
    } 
    
    public String toString() {
        return "Account #" + this.number + " | Holder: " + this.holder + " | Balance: $" + String.format("%.2f", this.balance) + " | Withdraw Limit: $" + String.format("%.2f", this.withdrawLimit);
    }
    
    public String toStringOnlyBalance() {
        return "Account #" + this.number + " current balance: $" + String.format("%.2f", this.balance);
    }
    
    public Long getNumber() {
        return number;
    }

    public void setNumber(Long number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public Double getWithdrawLimit() {
        return withdrawLimit;
    }

    public void setWithdrawLimit(Double withdrawLimit) {
        this.withdrawLimit = withdrawLimit;
    }
    
}
