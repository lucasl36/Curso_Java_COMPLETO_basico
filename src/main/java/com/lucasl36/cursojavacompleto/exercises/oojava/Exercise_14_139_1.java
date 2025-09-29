package com.lucasl36.cursojavacompleto.exercises.oojava;

import com.lucasl36.cursojavacompleto.Main;
import com.lucasl36.cursojavacompleto.entities.mod14.*;
import com.lucasl36.cursojavacompleto.exercises.OOJavaExercise;
import java.util.*;

/**
 *
 * @author Lucas Lopes
 */
public class Exercise_14_139_1 extends OOJavaExercise{

    List<Person> taxPayers;
    
    public Exercise_14_139_1() {
        super("Exercise mod. 14 lesson 139 num. 1 - Abstract Tax Payers");
        this.taxPayers = new ArrayList<>();
    }
    
    @Override
    public void execute() {
        int productsQty;
        System.out.print("Enter the number of tax payers: ");
        Integer taxPayersQty = Main.sc.nextInt();
        try {
            for(int i = 1; i <= taxPayersQty; i++) {
                taxPayers.add(buildTaxPayer(i));
            }
            for(Person person : taxPayers) {
                person.declareTaxes();
            }
        } catch(Exception e) {
            System.out.println("Invalid arguments, terminating exercise executin");
        }
        
    }
    
    private Person buildTaxPayer(int sequence) throws Exception {
        System.out.printf("Tax payer #%d data:%n",sequence);
        
        System.out.print("Natural(N) or Legal(L) person? ");
        String personTypeStr = Main.sc.next();
        Main.sc.nextLine();
        
        System.out.print("Name: ");
        String name = Main.sc.next();
        Main.sc.nextLine();
        
        System.out.print("Annual income: ");
        Double income = Main.sc.nextDouble();
     
        PersonTypeEnum personType = PersonTypeEnum.findByCode(personTypeStr);
        if(personType.equals(PersonTypeEnum.LEGAL)) {
            System.out.print("Employees quantity: ");
            Integer employeesQuantity = Main.sc.nextInt();
            
            return new LegalPerson(name, income, employeesQuantity);
        } else if(personType.equals(PersonTypeEnum.NATURAL)) {
            System.out.print("Health expenses: ");
            Double healthExpenses = Main.sc.nextDouble();
            
            return new NaturalPerson(name, income, healthExpenses);
        }
        throw new Exception("Invalid Person Type");
    }

}
