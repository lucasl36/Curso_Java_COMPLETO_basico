package com.lucasl36.cursojavacompleto.exercises.basicjava;

import com.lucasl36.cursojavacompleto.Main;

/**
 *
 * @author Lucas Lopes
 */
public class Exercise_5_37_8 extends BasicJavaExercise {
    
    public Exercise_5_37_8() {
        super("Exercise mod. 5 lesson 37 num. 8");
    }
    
    @Override
    public void execute() {
        System.out.println("** Lisarb's Financial Secretary");
        System.out.println("** Income tax value calculation");
        System.out.print("Enter your salary value with double decimal precision:");
        double salary = Main.sc.nextDouble();
        Main.sc.nextLine();
        double taxTotal = 0.0;
        if(salary > 4500.0) {
            taxTotal += (salary-4500.0)*0.28;
            salary -= salary-4500.00;
        } 
        if(salary >= 3000.01 && salary <= 4500.0) {
            taxTotal += (salary-3000.01)*0.18;
            salary -= salary-3000.01;
        } 
        if(salary >= 2000.01 && salary <= 3000.0) {
            taxTotal += (salary-2000.01)*0.08;
        }        
        if(taxTotal > 0.0) {
            System.out.printf("The income tax amount owed is R$ %.2f!", taxTotal);
        } else {
            System.out.println("You are exempt from paying income tax!");
        }
    }
}
