package com.lucasl36.cursojavacompleto.exercises.oojava;

import com.lucasl36.cursojavacompleto.Main;
import com.lucasl36.cursojavacompleto.entities.mod15.BankAccount;
import com.lucasl36.cursojavacompleto.exercises.OOJavaExercise;
import java.util.*;

/**
 *
 * @author Lucas Lopes
 */
public class Exercise_15_151_1 extends OOJavaExercise{

    List<BankAccount> bankAccounts;
    
    public Exercise_15_151_1() {
        super("Exercise mod. 15 lesson 151 num. 1 - Withdraw from Bank Account");
        bankAccounts = new ArrayList<>();
    }
    
    @Override
    public void execute() {
        boolean executionLoop = true;
        while(executionLoop) {
            try {
               System.out.println("L36 BANK");
                this.showOptions(); 
                Integer opt = Main.sc.nextInt();
                if(opt == 0) {
                    System.out.println("Exiting...");
                    executionLoop = false;
                } else {
                    switch(opt) {
                        case 1: {
                            registerAccount();
                            break;
                        }
                        case 2: {
                           listAccounts();
                           break;
                        }   
                        case 3: {
                            deposit();
                            break;
                        }
                        case 4: {
                            withdraw();
                            break;
                        }
                        default: {
                            throw new IllegalArgumentException("Invalid option, try again...");
                        }
                    }
                    System.out.println("Operation Succeeded! Returning to menu...");
                }
            } catch(Throwable t) {
                System.out.println(t.getMessage());
            }
        }
    }
    
    private void showOptions() {
        System.out.println("1. Register account");
        System.out.println("2. List accounts");
        System.out.println("3. Deposit");
        System.out.println("4. Withdraw");
        System.out.println("0. Exit");
        System.out.print("Choose an option: ");
    }
    
    
    private void registerAccount() throws Throwable {
        System.out.println("Inform the ACCOUNT NUMBER, HOLDER'S NAME, BALANCE and WITHDRAW LIMIT separated by spaces: ");
        String[] arguments = getInput(4);
        this.bankAccounts.add(new BankAccount(
                Long.valueOf(arguments[0]), 
                arguments[1], 
                Double.valueOf(arguments[2]), 
                Double.valueOf(arguments[3])));
    }
    
    private void listAccounts() {
        if(this.bankAccounts.size() > 0) 
            this.bankAccounts.stream().forEach(ba -> System.out.println(ba.toString()));
        System.out.println("No bank accounts registered!");
    }
    
    private void deposit() throws Throwable {
        System.out.println("Inform the ACCOUNT NUMBER and DEPOSIT VALUE separated by spaces: ");
        String[] arguments = getInput(2);
        BankAccount ba = getAccount(Long.valueOf(arguments[0]));
        System.out.println("Depositing...");
        ba.deposit(Double.valueOf(arguments[1]));
        System.out.println(ba.toStringOnlyBalance());
    }
    
    private void withdraw() throws Throwable {
        System.out.println("Inform the ACCOUNT NUMBER and WITHDRAW VALUE separated by spaces: ");
        String[] arguments = getInput(2);
        BankAccount ba = getAccount(Long.valueOf(arguments[0]));
        System.out.println("Withdrawing...");
        ba.withdraw(Double.valueOf(arguments[1]));
        System.out.println(ba.toStringOnlyBalance());
    }
    
    private BankAccount getAccount(Long accountNumber) throws RuntimeException {
        Optional<BankAccount> optBankAccount = bankAccounts.stream()
                .filter(ba -> ba.getNumber().equals(accountNumber))
                .findFirst();
        if(optBankAccount.isEmpty())
            throw new IllegalArgumentException("Invalid bank account, try again...");
        return optBankAccount.get();
    }
    
    private String[] getInput(Integer expectedLength) throws RuntimeException {
        Main.sc.nextLine();
        String input = Main.sc.nextLine();
        String[] arguments = input.split(" ");
        if(arguments.length != expectedLength)
            throw new IllegalArgumentException("Invalid input, try again...");
        return arguments;
    }
    
}
