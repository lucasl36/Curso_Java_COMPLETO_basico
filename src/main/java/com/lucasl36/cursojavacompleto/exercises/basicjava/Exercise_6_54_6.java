package com.lucasl36.cursojavacompleto.exercises.basicjava;

import com.lucasl36.cursojavacompleto.Main;

/**
 *
 * @author Lucas Lopes
 */
public class Exercise_6_54_6 extends BasicJavaExercise {
        
    public Exercise_6_54_6() {
        super("Exercise mod. 6 lesson 54 num. 6");
    }

    @Override
    public void execute() {
        System.out.println("* Divisors Calculation");
        System.out.println("Enter an integer number: ");
        int val = Main.sc.nextInt();
        Main.sc.nextLine();
        for(int i = 1; i <= val; i++) {
            if(val%i == 0) {
                System.out.println(i);
            }
        }
    }
    
}
