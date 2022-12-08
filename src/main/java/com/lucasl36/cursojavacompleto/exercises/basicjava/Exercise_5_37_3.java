package com.lucasl36.cursojavacompleto.exercises.basicjava;

import com.lucasl36.cursojavacompleto.exercises.BasicJavaExercise;
import com.lucasl36.cursojavacompleto.Main;

/**
 *
 * @author Lucas Lopes
 */
public class Exercise_5_37_3 extends BasicJavaExercise {
    
    public Exercise_5_37_3() {
        super("Exercise mod. 5 lesson 37 num. 3");
    }
    
    @Override
    public void execute() {
        System.out.print("Enter two integer numbers separated by space: ");
        int a = Main.sc.nextInt();
        int b = Main.sc.nextInt();
        Main.sc.nextLine();
        if(a > b) {
            int temp = b;
            b = a;
            a = temp;
        }
        if(b % a == 0) {
            System.out.println("This numbers are MULTIPLE!");
        } else {
            System.out.println("This numbers are NOT MULTIPLE!");
        }
    }
    
}