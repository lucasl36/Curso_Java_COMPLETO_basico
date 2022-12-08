package com.lucasl36.cursojavacompleto.exercises.basicjava;

import com.lucasl36.cursojavacompleto.exercises.BasicJavaExercise;
import com.lucasl36.cursojavacompleto.Main;

/**
 *
 * @author Lucas Lopes
 */
public class Exercise_6_54_5 extends BasicJavaExercise {
        
    public Exercise_6_54_5() {
        super("Exercise mod. 6 lesson 54 number. 5");
    }

    @Override
    public void execute() {
        System.out.println("* Factorial Calculation");
        System.out.println("Enter an integer number: ");
        int val = Main.sc.nextInt();
        Main.sc.nextLine();
        if(val == 0) {
            System.out.println("Factorial of 0 is 1");
        } else {
            int factorial = 1;
            for(int i = 1; i <= val; i++) {
                factorial = factorial*i;
            }
            System.out.printf("Factorial of %d is %d%n", val, factorial);
        }
        
    }
    
}
