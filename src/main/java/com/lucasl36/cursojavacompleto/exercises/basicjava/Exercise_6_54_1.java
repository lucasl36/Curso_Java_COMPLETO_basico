package com.lucasl36.cursojavacompleto.exercises.basicjava;

import com.lucasl36.cursojavacompleto.exercises.BasicJavaExercise;
import com.lucasl36.cursojavacompleto.Main;

/**
 *
 * @author Lucas Lopes
 */
public class Exercise_6_54_1 extends BasicJavaExercise {
    
    private static final int minValue = 1;
    private static final int maxValue = 1000;
    
    public Exercise_6_54_1() {
        super("Exercise mod. 6 lesson 54 num. 1");
    }

    @Override
    public void execute() {
        System.out.printf("Enter an integer number which it's value is between %d amd %d: %n", minValue, maxValue);
        int value = Main.sc.nextInt();
        Main.sc.nextLine();
        System.out.printf("Showing odd numbers between %d until %d... %n", minValue, value);
        for(int i = minValue; i <= value; i++) {
            if(i%2 != 0) {
                System.out.println(i);
            }
        }
    }
    
}
