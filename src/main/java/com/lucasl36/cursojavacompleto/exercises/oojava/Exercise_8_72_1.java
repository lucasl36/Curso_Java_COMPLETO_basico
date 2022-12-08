package com.lucasl36.cursojavacompleto.exercises.oojava;

import com.lucasl36.cursojavacompleto.exercises.OOJavaExercise;
import com.lucasl36.cursojavacompleto.Main;
import com.lucasl36.cursojavacompleto.services.CurrencyConverter;

/**
 *
 * @author Lucas Lopes
 */
public class Exercise_8_72_1  extends OOJavaExercise {
        
    public Exercise_8_72_1() {
        super("Exercise mod. 8 lesson 72 num. 1");
    }
    
    @Override
    public void execute() {
        System.out.println("** Currency Exchange Service");
        System.out.print("Enter dollar current price in R$: ");
        double dollarPrice = Main.sc.nextDouble();
        Main.sc.nextLine();
        System.out.print("Enter amount of dollars being bought: ");
        double buyingAmount = Main.sc.nextDouble();
        Main.sc.nextLine();
        System.out.println("Price of the currency exchange in R$: " + String.format("%.2f", CurrencyConverter.calculateExchangeReaisToDolar(dollarPrice, buyingAmount)));
    }

}
