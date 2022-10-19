package com.lucasl36.cursojavacompleto.exercises.basicjava;

import com.lucasl36.cursojavacompleto.Main;

/**
 *
 * @author Lucas Lopes
 */
public class Exercise_5_37_6 extends BasicJavaExercise {
    
    public Exercise_5_37_6() {
        super("Exercise mod. 5 lesson 37 num. 6");
    }
    
    @Override
    public void execute() {
        System.out.println("Enter a decimal value with double precision:");
        double value = Main.sc.nextDouble();
        Main.sc.nextLine();
        if(value >= 0.0 && value <= 25.0) {
            System.out.println("Interval[0,25]");
        } else if(value > 25.0 && value <= 50.0) {
            System.out.println("Interval[25,50]");
        } else if(value > 50.0 && value <= 75.0) {
            System.out.println("Interval[50,75]");
        } else if(value > 75.0 && value <= 100.0) {
            System.out.println("Interval[75,100]");
        } else {
            System.out.println("Out of scope");
        }
    }
    
}
