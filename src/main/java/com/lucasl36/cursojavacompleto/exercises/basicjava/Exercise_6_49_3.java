package com.lucasl36.cursojavacompleto.exercises.basicjava;

import com.lucasl36.cursojavacompleto.exercises.BasicJavaExercise;
import com.lucasl36.cursojavacompleto.Main;

/**
 *
 * @author Lucas Lopes
 */
public class Exercise_6_49_3 extends BasicJavaExercise {
    
    public Exercise_6_49_3() {
        super("Exercise mod. 6 lesson 49 num. 3");
    }
    
    @Override
    public void execute() {
        int alcoholAmount = 0;
        int gasolineAmount = 0;
        int dieselAmount = 0;
        System.out.println("Consumer Research");
        System.out.println("Enter which product you used during the last month:");
        System.out.println("1 for Alcohol, 2 for Gasoline, 3 for Diesel e 4 to end the research.");
        int product = 0;
        while(product != 4) {
            product = Main.sc.nextInt();
            switch(product) {
                case 1:
                    alcoholAmount++;
                    break;
                case 2:
                    gasolineAmount++;
                    break;
                case 3:
                    dieselAmount++;
                    break;
                default:
                    break;
            }
        }
        System.out.println("Thank you for participating in out research!");
        System.out.println("Alcohol amount consumed: "+alcoholAmount);
        System.out.println("Gasoline amount consumed: "+gasolineAmount);
        System.out.println("Diesel amount consumed:: "+dieselAmount);
    }
    
}
