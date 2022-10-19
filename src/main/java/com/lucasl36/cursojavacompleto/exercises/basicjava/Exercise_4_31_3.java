package com.lucasl36.cursojavacompleto.exercises.basicjava;

import com.lucasl36.cursojavacompleto.Main;

/**
 *
 * @author Lucas Lopes
 */
public class Exercise_4_31_3 extends BasicJavaExercise {

    public Exercise_4_31_3() {
        super("Exercise mod. 4 lesson 31 num. 3");
    }
    
    @Override
    public void execute() {
        System.out.println("Enter 4 integer values - A, B, C and D - separated by space:");
        int a = Main.sc.nextInt();
        int b = Main.sc.nextInt();
        int c = Main.sc.nextInt();
        int d = Main.sc.nextInt();
        Main.sc.nextLine();
        System.out.println("The difference beetwen A & B product and C & D product is: " + (a*b-c*d));
    }
    
}
