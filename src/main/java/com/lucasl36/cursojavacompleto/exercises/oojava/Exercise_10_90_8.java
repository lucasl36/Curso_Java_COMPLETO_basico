package com.lucasl36.cursojavacompleto.exercises.oojava;

import com.lucasl36.cursojavacompleto.exercises.OOJavaExercise;
import com.lucasl36.cursojavacompleto.Main;

/**
 *
 * @author Lucas Lopes
 */
public class Exercise_10_90_8 extends OOJavaExercise {

    public Exercise_10_90_8() {
        super("Exercise mod. 10 lesson 90 num. 8");
    }
    
    @Override
    public void execute() {
        System.out.print("Enter the number of elements for the array: ");
        int arraySize = Main.sc.nextInt();
        Main.sc.nextLine();
        
        int evenIntSum = 0;
        int evenIntQty = 0;
        int[] array = new int[arraySize];
        for(int i = 0; i < arraySize; i++) {
            System.out.print("Enter an integer: ");
            array[i] = Main.sc.nextInt();
            Main.sc.nextLine();
            if(array[i]%2 == 0) {
                evenIntSum += array[i];
                evenIntQty++;
            }
        }
        
        if(evenIntSum > 0) {
            double evenIntAvg = evenIntSum/evenIntQty;
            System.out.println("EVEN INTEGERS AVERAGE: " + String.format("%.1f", evenIntAvg));
        } else {
            System.out.println("NO EVEN INTEGERS");
        }
    }
    
}
