package com.lucasl36.cursojavacompleto.entities;

/**
 *
 * @author Lucas Lopes
 */
public class BankAccount {
    
    private final int accountId;
    private String holdersName;
    private double balance;
    
    public BankAccount(int accountId, String holdersName) {
        this.accountId = accountId;
        this.holdersName = holdersName;
    }
    
    public BankAccount(int accountId, String holdersName, double initialDeposit) {
        this.accountId = accountId;
        this.holdersName = holdersName;
        deposit(initialDeposit);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Account ").append(String.valueOf(accountId))
                .append(", Holder: ").append(holdersName)
                .append(", Balance: $ ").append(String.format("%.2f", balance));
        return sb.toString();
    }
    
    public void deposit(double value) {
        this.balance += value;
    }
    
    public void withdraw(double value, double withdrawFee) {
        this.balance -= (value+withdrawFee);
    }

    public int getAccountId() {
        return accountId;
    }

    public String getHoldersName() {
        return holdersName;
    }

    public void setHoldersName(String nomeTitular) {
        this.holdersName = nomeTitular;
    }
    
    public double getBalance() {
        return balance;
    }
    
}
