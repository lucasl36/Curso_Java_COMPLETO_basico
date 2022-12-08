package com.lucasl36.cursojavacompleto.exercises.oojava;

import com.lucasl36.cursojavacompleto.exercises.OOJavaExercise;
import com.lucasl36.cursojavacompleto.Main;

/**
 *
 * @author Lucas Lopes
 */
public class Exercise_10_90_5 extends OOJavaExercise {

    public Exercise_10_90_5() {
        super("Exercise mod. 10 lesson 90 num. 5");
    }
    
    @Override
    public void execute() {
        System.out.print("Enter how many decimals you gonna inform: ");
        int numbersQty = Main.sc.nextInt();
        Main.sc.nextLine();
        int biggestNumberIndex = 0;
        double biggestNumber = 0.0;
        double[] numbers = new double[numbersQty];
        for(int i = 0; i < numbersQty; i++) {
            System.out.print("Enter a decimal: ");
            numbers[i] = Main.sc.nextDouble();
            Main.sc.nextLine();
            if(numbers[i] > biggestNumber) {
                biggestNumber = numbers[i];
                biggestNumberIndex = i;
            }
        }
        System.out.println("BIGGEST NUMBER: " + String.valueOf(biggestNumber));
        System.out.println("BIGGEST NUMBER POSITION: " + String.valueOf(biggestNumberIndex));
    }
    
}
