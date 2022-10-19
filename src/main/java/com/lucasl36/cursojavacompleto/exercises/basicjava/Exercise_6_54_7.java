package com.lucasl36.cursojavacompleto.exercises.basicjava;

import com.lucasl36.cursojavacompleto.Main;
import com.lucasl36.cursojavacompleto.exercises.Exercise;

/**
 *
 * @author Lucas Lopes
 */
public class Exercise_6_54_7 extends Exercise {
        
    public Exercise_6_54_7() {
        super("Exercise mod. 6 lesson 54 num 7");
    }

    @Override
    public void execute() {
        System.out.println("* Quadratic and Cubic Calculation");
        System.out.println("Enter an integer number: ");
        int val = Main.sc.nextInt();
        Main.sc.nextLine();
        for(int i = 1; i <= val; i++) {
            int square = (int) Math.pow(i, 2);
            int cube = (int) Math.pow(i, 3);
            System.out.printf("Line: %d, Square: %d, Cube: %d %n", i, square, cube);
        }
    }
    
}
