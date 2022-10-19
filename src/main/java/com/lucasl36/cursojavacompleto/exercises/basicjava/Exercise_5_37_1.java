package com.lucasl36.cursojavacompleto.exercises.basicjava;

import com.lucasl36.cursojavacompleto.Main;
import com.lucasl36.cursojavacompleto.exercises.Exercise;

/**
 *
 * @author Lucas Lopes
 */
public class Exercise_5_37_1 extends Exercise {
    
    public Exercise_5_37_1() {
        super("Exercise mod. 5 lesson 37 num. 1");
    }
    
    @Override
    public void execute() {
        System.out.print("Enter an integer number: ");
        int num = Main.sc.nextInt();
        Main.sc.nextLine();
        if(num > 0) {
            System.out.println("This number is POSITIVE");
        } else if (num == 0) {
            System.out.println("This number is ZERO");
        } else if (num < 0) {
            System.out.println("This number is NEGATIVE");
        }
    }
    
}
