package com.lucasl36.cursojavacompleto.exercises.oojava;

import com.lucasl36.cursojavacompleto.exercises.OOJavaExercise;
import com.lucasl36.cursojavacompleto.Main;

/**
 *
 * @author Lucas Lopes
 */
public class Exercise_10_90_6 extends OOJavaExercise {

    public Exercise_10_90_6() {
        super("Exercise mod. 10 lesson 90 num. 6");
    }
    
    @Override
    public void execute() {
        System.out.println("** Sum of two integer arrays");
        System.out.print("Enter both array's size: ");
        int arraySize = Main.sc.nextInt();
        Main.sc.nextLine();
        
        int[] a = new int[arraySize];
        System.out.println("Enter first array (A) integers: ");
        for(int i = 0; i < arraySize; i++) {
            a[i] = Main.sc.nextInt();
            Main.sc.nextLine();
        }
        
        int[] b = new int[arraySize];
        System.out.println("Enter second array (B) integers: ");
        for(int i = 0; i < arraySize; i++) {
            b[i] = Main.sc.nextInt();
            Main.sc.nextLine();
        }
        
        int[] c = new int[arraySize];
        System.out.println("Printing sum array (C): ");
        for(int i = 0; i < arraySize; i++) {
            c[i] = a[i] + b[i];
            System.out.println(String.valueOf(c[i]));
        }
    }
    
}
