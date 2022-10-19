package com.lucasl36.cursojavacompleto.exercises.basicjava;

import com.lucasl36.cursojavacompleto.Main;

/**
 *
 * @author Lucas Lopes
 */
public class Exercise_5_37_7 extends BasicJavaExercise {
    
    public Exercise_5_37_7() {
        super("Exercise mod. 5 lesson 37 num. 7");
    }
    
    @Override
    public void execute() {
        System.out.println("Enter two decimal values with double precision\n"
                + "separated by space:");
        double x = Main.sc.nextDouble();
        double y = Main.sc.nextDouble();
        Main.sc.nextLine();
        if(x == 0.0 && y == 0.0) {
            System.out.println("Point location at origin");
        } else if(x == 0.0 && y > 0.0) {
            System.out.println("Point location over X axis between Q1 & Q2");
        } else if(x == 0.0 && y < 0.0) {
            System.out.println("Point location over X axis between Q3 & Q4");
        } else if(x > 0.0 && y == 0.0) {
            System.out.println("Point location over Y axis between Q1 & Q4");
        } else if(x < 0.0 && y == 0.0) {
            System.out.println("Point location over X axis between Q2 & Q3");
        } else if(x > 0.0 && y > 0.0) {
            System.out.println("Point location on Q1");
        } else if(x > 0.0 && y < 0.0) {
            System.out.println("Point location on Q4");
        } else if(x < 0.0 && y > 0.0) {
            System.out.println("Point location on Q2");
        } else if(x < 0.0 && y < 0.0) {
            System.out.println("Point location on Q3");
        } else {
            System.out.println("This point cannot be found on this dimension");
        }
    }
}
