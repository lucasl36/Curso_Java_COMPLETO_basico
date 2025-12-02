package com.lucasl36.cursojavacompleto.exercises.oojava;

import com.lucasl36.cursojavacompleto.Main;
import com.lucasl36.cursojavacompleto.exercises.OOJavaExercise;
import com.lucasl36.cursojavacompleto.services.ContractService;
import com.lucasl36.cursojavacompleto.services.PaypalPaymentService;
import com.lucasl36.cursojavacompleto.helpers.TimeHelper;
import com.lucasl36.cursojavacompleto.entities.mod17.*;

/**
 *
 * @author Lucas Lopes
 */
public class Exercise_17_170_1 extends OOJavaExercise {
    
    private ContractService contractService;
    
    public Exercise_17_170_1() {
        super("Exercise mod. 17 lesson 170 num. 1 - Payment Contracts Processor");
        this.contractService = new ContractService(new PaypalPaymentService());
    }    

    @Override
    public void execute() {
        try {
            System.out.println("PAYMENT CONTRACT PROCESSOR");
            System.out.println("=======================================================================");
            System.out.println("Inform the contract's NUMBER, DATE, TOTAL VALUE and INSTALLMENT QUANTITY separated by spaces:");
            String[] arguments = this.getInput(4);
            Contract contract = contractService.processContract(
                    Integer.parseInt(arguments[0]),
                    TimeHelper.convertStringToLocalDate(arguments[1]),
                    Double.parseDouble(arguments[2]),
                    Integer.parseInt(arguments[3]));
            printContract(contract);
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private void printContract(Contract contract) {
        System.out.println("==============");
        System.out.println("CONTRACT INFO:");
        System.out.println("Number: ");
        System.out.println(contract.getNumber());
        System.out.println("Date: ");
        System.out.println(contract.getDate());
        System.out.println("Total Value: ");
        System.out.println(String.format("%.2f", contract.getTotalValue()));
        int i = 1;
        for(Installment installment : contract.getInstallments()) {
            System.out.println("INSTALLMENT #"+i+":");
            System.out.println("Due Date: ");
            System.out.println(installment.getDueDate());
            System.out.println("Insterest: ");
            System.out.println(String.format("%.2f", installment.getInterest()));
            System.out.println("Fee: ");
            System.out.println(String.format("%.2f", installment.getTax()));
            System.out.println("Value: ");
            System.out.println(String.format("%.2f", installment.getTotalValue()));
            i++;
        }
    }
    
    private String[] getInput(Integer expectedLength) throws RuntimeException {
        String input = Main.sc.nextLine();
        String[] arguments = input.split(" ");
        if(arguments.length != expectedLength)
            throw new IllegalArgumentException("Invalid input, try again...");
        return arguments;
    }
    
}
