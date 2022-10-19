package com.lucasl36.cursojavacompleto.exercises.basicjava;

import com.lucasl36.cursojavacompleto.Main;

/**
 *
 * @author Lucas Lopes
 */
public class Exercise_4_31_2 extends BasicJavaExercise {

    public Exercise_4_31_2() {
        super("Exercise mod. 4 lesson 31 num. 2");
    }
    
    @Override
    public void execute() {
        double pi = 3.14159;
        System.out.println("Enter the value of a circle's radius:");
        double r = Main.sc.nextDouble();
        Main.sc.nextLine();
        System.out.printf("The circle's area is: %.4f%n", (pi*Math.pow(r, 2)));
    }
    
}
