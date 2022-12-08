package com.lucasl36.cursojavacompleto.exercises.oojava;

import com.lucasl36.cursojavacompleto.exercises.OOJavaExercise;
import com.lucasl36.cursojavacompleto.Main;

/**
 *
 * @author Lucas Lopes
 */
public class Exercise_10_90_7 extends OOJavaExercise {

    public Exercise_10_90_7() {
        super("Exercise mod. 10 lesson 90 num. 7");
    }
    
    @Override
    public void execute() {
        System.out.print("Enter the number of elements for the array: ");
        int arraySize = Main.sc.nextInt();
        Main.sc.nextLine();
        
        double elementsArraySum = 0;
        double[] elementsArray = new double[arraySize];
        for(int i = 0; i < arraySize; i++) {
            System.out.print("Enter a decimal: ");
            elementsArray[i] = Main.sc.nextDouble();
            Main.sc.nextLine();
            elementsArraySum += elementsArray[i];
        }
        
        double elementsArrayAvg = elementsArraySum/arraySize;
        
        System.out.println("Elements array average: " + String.format("%.3f", elementsArrayAvg));
        System.out.println("Elements below average: ");
        for(int i = 0; i < arraySize; i++) {
            if(elementsArray[i] < elementsArrayAvg) {
                System.out.println(String.format("%.1f", elementsArray[i]));
            }
        }
    }
    
}
