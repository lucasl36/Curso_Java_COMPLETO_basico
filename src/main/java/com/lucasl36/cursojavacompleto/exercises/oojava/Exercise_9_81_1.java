package com.lucasl36.cursojavacompleto.exercises.oojava;

import com.lucasl36.cursojavacompleto.exercises.OOJavaExercise;
import com.lucasl36.cursojavacompleto.Main;
import com.lucasl36.cursojavacompleto.entities.BankAccount;

/**
 *
 * @author Lucas Lopes
 */
public class Exercise_9_81_1  extends OOJavaExercise {
        
    private static final double withdrawFee = 5.0;
    
    public Exercise_9_81_1() {
        super("Exercise mod. 9 lesson 81 num. 1");
    }
    
    @Override
    public void execute() {
        System.out.println("** Bank Account Creation Tool");
        System.out.print("Enter account number: ");
        int accountId = Main.sc.nextInt();
        Main.sc.nextLine();
        System.out.print("Enter account holder: ");
        String holdersName = Main.sc.nextLine();
        double initialDeposit = 0.0;
        System.out.print("Is there an initial deposit (Y/N)? ");
        String ynInitialDeposit = Main.sc.nextLine();
        if(ynInitialDeposit.toUpperCase().equals("Y")) {
            System.out.print("Enter initial deposit value: ");
            initialDeposit = Main.sc.nextDouble();
            Main.sc.nextLine();
        }
        BankAccount newBankaccount;
        if(initialDeposit > 0.0) {
            newBankaccount = new BankAccount(accountId, holdersName, initialDeposit);
        } else {
            newBankaccount = new BankAccount(accountId, holdersName);
        }
        System.out.println("Account data:");
        System.out.println(newBankaccount);
        System.out.print("Enter a deposit value: ");
        double deposit = Main.sc.nextDouble();
        Main.sc.nextLine();
        newBankaccount.deposit(deposit);
        System.out.println("Updated account data:");
        System.out.println(newBankaccount);
        System.out.print("Enter a withdraw value: ");
        double withdraw = Main.sc.nextDouble();
        Main.sc.nextLine();
        newBankaccount.withdraw(withdraw, withdrawFee);
        System.out.println("Updated account data:");
        System.out.println(newBankaccount);
    }

}
