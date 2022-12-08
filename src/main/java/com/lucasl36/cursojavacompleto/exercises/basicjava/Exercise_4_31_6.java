package com.lucasl36.cursojavacompleto.exercises.basicjava;

import com.lucasl36.cursojavacompleto.exercises.BasicJavaExercise;
import com.lucasl36.cursojavacompleto.Main;

/**
 *
 * @author Lucas Lopes
 */
public class Exercise_4_31_6 extends BasicJavaExercise {

    public Exercise_4_31_6() {
        super("Exercise mod. 4 lesson 31 num. 6");
    }
    
    @Override
    public void execute() {
        double pi = 3.14159;
        System.out.println("Enter 3 decimal values of double precision maximum:");
        float a = Main.sc.nextFloat();
        float b = Main.sc.nextFloat();
        float c = Main.sc.nextFloat();
        Main.sc.nextLine();
        double triangleArea = a*c/2;
        double circleArea = pi*Math.pow(c, 2);
        double trapezeArea = (a+b)*c/2;
        double squareArea = Math.pow(b, 2);
        double rectangleArea = a*b;
        System.out.println("These are the areas of the respective geometrical figures:");
        System.out.printf("Triangle: %.3f%n", triangleArea);
        System.out.printf("Circle: %.3f%n", circleArea);
        System.out.printf("Trapeze: %.3f%n", trapezeArea);
        System.out.printf("Square: %.3f%n", squareArea);
        System.out.printf("Rectangle: %.3f%n", rectangleArea);
    }
    
}
