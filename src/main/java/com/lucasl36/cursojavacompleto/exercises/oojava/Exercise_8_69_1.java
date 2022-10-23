package com.lucasl36.cursojavacompleto.exercises.oojava;

import com.lucasl36.cursojavacompleto.Main;
import com.lucasl36.cursojavacompleto.entities.Rectangle;

/**
 *
 * @author Lucas Lopes
 */
public class Exercise_8_69_1 extends OOJavaExercise {
    
    public Exercise_8_69_1() {
        super("Exercise mod. 8 lesson 69 num. 1");
    }

    @Override
    public void execute() {
        System.out.println("Enter rectangle width and height:");
        double width = Main.sc.nextDouble();
        double height = Main.sc.nextDouble();
        Main.sc.nextLine();
        Rectangle rectangle = new Rectangle(width, height);
        System.out.println("Rectangles's");
        System.out.println("Area: " + String.format("%,.2f", rectangle.Area()));
        System.out.println("Perimeter: " + String.format("%,.2f", rectangle.Perimeter()));
        System.out.println("Diagonal: " + String.format("%,.2f", rectangle.Diagonal()));
    }
    
}
