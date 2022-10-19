package com.lucasl36.cursojavacompleto.exercises.basicjava;

import com.lucasl36.cursojavacompleto.Main;

/**
 *
 * @author Lucas Lopes
 */
public class Exercise_4_31_5 extends BasicJavaExercise {

    public Exercise_4_31_5() {
        super("Exercise mod. 4 lesson 31 num. 5");
    }
    
    @Override
    public void execute() {
        System.out.println("Enter the code, quantity and value of the first part separated by space:");
        int pt1Code = Main.sc.nextInt();
        int pt1Quantity = Main.sc.nextInt();
        double pt1Value = Main.sc.nextDouble();
        Main.sc.nextLine();
        System.out.println("Enter the code, quantity and value of the second part separated by space:");
        int pt2Code = Main.sc.nextInt();
        int pt2Quantity = Main.sc.nextInt();
        double pt2Value = Main.sc.nextDouble();
        Main.sc.nextLine();
        System.out.printf("The amount to be paid in both parts of codes %d and %d is: $%.2f%n", pt1Code, pt2Code, (this.calculatePartValue(pt1Quantity,pt1Value) + this.calculatePartValue(pt2Quantity,pt2Value)));
    }
    
    private double calculatePartValue(int quantity, double value) {
        return (double) quantity * value;
    }
    
}
