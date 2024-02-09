package com.lucasl36.cursojavacompleto.exercises.basicjava;

import com.lucasl36.cursojavacompleto.exercises.BasicJavaExercise;

/**
 *
 * @author Lucas Lopes
 */
public class Exercise_4_24_1 extends BasicJavaExercise {

    public Exercise_4_24_1() {
        super("Exercise mod. 4 lesson 24");
    }
    
    @Override
    public void execute() {
        String product1 = "Computer";
        String product2 = "Office Desk";
        
        int age = 30;
        int code = 5290;
        char gender = 'F';
        
        double price1 = 2100.0;
        double price2 = 650.50;
        double measure = 53.234567;
        
        System.out.println("Products:");
        System.out.printf("%s, which price is $ %.2f%n", product1, price1);
        System.out.printf("%s, which price is $ %.2f%n%n", product2, price2);
        System.out.printf("Record: %d years old, code %d and gender: %s%n%n", age, code, gender);
        System.out.printf("Measure with eight decimal places: %.8f%n", measure);
        System.out.printf("Rounded (three decimal places): %.3f%n", measure);
        System.out.printf("US decimal point: %.3f%n", measure);
    }
    
}
