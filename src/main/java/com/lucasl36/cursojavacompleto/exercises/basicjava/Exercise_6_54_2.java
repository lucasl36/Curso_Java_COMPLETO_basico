package com.lucasl36.cursojavacompleto.exercises.basicjava;

import com.lucasl36.cursojavacompleto.Main;

/**
 *
 * @author Lucas Lopes
 */
public class Exercise_6_54_2 extends BasicJavaExercise {
    
    private static final int minValue = 10;
    private static final int maxValue = 20;
    
    public Exercise_6_54_2() {
        super("Exercise mod. 6 lesson 54 num. 2");
    }

    @Override
    public void execute() {
        int in = 0;
        int out = 0;
        System.out.println("Enter an integer number:");
        int n = Main.sc.nextInt();
        Main.sc.nextLine();
        System.out.printf("Now enter %d integer numbers: %n", n);
        int val = 0;
        for(int i = 0; i < n; i++) {
            val = Main.sc.nextInt();
            if(val >= minValue && val <= maxValue) {
                in++;
            } else {
                out++;
            }
        }
        System.out.printf("From these numbers %d are in and %d are out of %d - %d interval %n", in, out, minValue, maxValue);
    }
    
}
