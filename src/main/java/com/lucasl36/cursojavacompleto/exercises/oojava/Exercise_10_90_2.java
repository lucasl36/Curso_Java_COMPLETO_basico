package com.lucasl36.cursojavacompleto.exercises.oojava;

import com.lucasl36.cursojavacompleto.exercises.OOJavaExercise;
import com.lucasl36.cursojavacompleto.Main;

/**
 *
 * @author Lucas Lopes
 */
public class Exercise_10_90_2 extends OOJavaExercise {
    
    public Exercise_10_90_2() {
        super("Exercise mod. 10 lesson 90 num. 2");
    }
    
    @Override
    public void execute() {
        System.out.print("Enter how many decimals you'll inform: ");
        int numbersQty = Main.sc.nextInt();
        Main.sc.nextLine();
        
        double[] numbers = new double[numbersQty];
        for(int i = 0; i < numbersQty; i++) {
            System.out.print("Enter a decimal: ");
            numbers[i] = Main.sc.nextDouble();
            Main.sc.nextLine();
        }
        
        double numbersSum = 0.0;
        double numbersAvg = 0.0;
        System.out.print("DECIMALS: ");
        for(int i = 0; i < numbersQty; i++) {
            System.out.print(String.valueOf(numbers[i] + " "));
            numbersSum += numbers[i];
        }
        numbersAvg = numbersSum/numbersQty;
        System.out.println();
        System.out.println("SUM: " + String.valueOf(numbersSum));
        System.out.println("AVERAGE: " + String.valueOf(numbersAvg));
        
    }

}
